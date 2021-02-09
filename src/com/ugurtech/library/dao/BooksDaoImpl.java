/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ugurtech.library.dao;

import com.ugurtech.library.generalclasses.UserInfoMessages;
import com.ugurtech.library.model.AuthorModel;
import com.ugurtech.library.model.BooksModel;
import com.ugurtech.library.model.BooksTypeModel;
import com.ugurtech.library.model.PublisherModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ugur
 *
 */
public class BooksDaoImpl extends DaoAbstract implements BooksDao {

    private static final String BOOK_SERACH_QUERY = "SELECT b.booksid as Kitap_NO,"
            + "b.isbn as ISBN,"
            + "b.booksname as Kitap_Adı,"
            + "pub.publishername as Yayın_Evi,"
            + "b.pressdate as Yayınlama_Tarihi,"
            + "b.lastupdate as Son_Güncelleme_Tarihi,"
            + "group_concat(DISTINCT bt.typename) Kitap_Türü,group_concat(DISTINCT (p.firstname || ' ' || p.lastname)) Kitap_Yazarı,"
            + "CASE WHEN b.bookborrowed=0 THEN 'Hayır' ELSE 'Evet' END as Ödünç_Verildimi "
            + "FROM books b "
            + "left join bookstypebooks btb on b.booksid=btb.booksid "
            + "left join bookstype bt on btb.bookstypeid = bt.bookstypeid "
            + "left join publisher pub on b.publisherid=pub.publisherid "
            + "left join booksauthor ba on b.booksid=ba.booksid "
            + "left join author a on ba.authorid=a.authorid "
            + "left join person p on a.personid=p.personid ";

    private final List<BooksTypeModel> booksTypeList;
    private final List<AuthorModel> authorModelList;
    private final List<PublisherModel> publisherModels;

    private BooksTypeModel booksTypeModel;
    private AuthorModel authorModel;
    private PublisherModel publisherModel;

    public BooksDaoImpl() {
        booksTypeList = new ArrayList<>();
        authorModelList = new ArrayList<>();
        publisherModels = new ArrayList<>();
    }

    @Override
    public ResultSet findBooksByFilters(Map<String, String> map) {
        StringBuilder query = new StringBuilder(BOOK_SERACH_QUERY);
        query.append("WHERE ");
        query.append("b.deleted=0 ");
        fillFilters(query, map);
        query.append("GROUP BY b.booksid ");
        return createResultSet(query.toString());
    }

    @Override
    public BooksModel getBook(int bookId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addBook(BooksModel books) {
        String insertBooksAuthor = "INSERT INTO booksauthor(booksid,authorid) VALUES(?,?)";
        String insertBooksBooksType = "INSERT INTO bookstypebooks(booksid,bookstypeid) VALUES(?,?)";
        String addBook = "INSERT INTO books (isbn,sysuserid,publisherid,booksname,pressdate) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = createPrepareStatement(addBook);
        try {
            preparedStatement.setLong(1, books.getIsbn());
            preparedStatement.setInt(2, books.getSysuserId());
            preparedStatement.setInt(3, books.getBublisherId());
            preparedStatement.setString(4, books.getBookName());
            preparedStatement.setString(5, books.getPressDate().toString());

            int effactedRow = preparedStatement.executeUpdate();
            ResultSet booksId = preparedStatement.getGeneratedKeys();

            preparedStatement = createPrepareStatement(insertBooksAuthor);
            for (AuthorModel am : books.getAuthor()) {
                preparedStatement.setInt(1, booksId.getInt(1));
                preparedStatement.setInt(2, am.getAuthorId());
                preparedStatement.executeUpdate();
            }
            preparedStatement = createPrepareStatement(insertBooksBooksType);
            for (BooksTypeModel btm : books.getBooksType()) {
                preparedStatement.setInt(1, booksId.getInt(1));
                preparedStatement.setInt(2, btm.getBookTypeId());
                preparedStatement.executeUpdate();
            }
            UserInfoMessages.getInstance().insertMessage(effactedRow);
        } catch (SQLException ex) {
            UserInfoMessages.getInstance().exceptionInfoMessages(null,ex.getMessage(),"Insert Error");
            Logger.getLogger(BooksDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updateBook(BooksModel book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteBook(int bookid) {
        String sqlQueryDeleteBook = "UPDATE books SET deleted=? WHERE booksid=?";
        PreparedStatement preparedStatement = createPrepareStatement(sqlQueryDeleteBook);
        try {
            preparedStatement.setBoolean(1, true);
            preparedStatement.setInt(2, bookid);
            int affectedRow = preparedStatement.executeUpdate();
            UserInfoMessages.getInstance().deletedMessage(affectedRow);
        } catch (SQLException ex) {
            UserInfoMessages.getInstance().exceptionInfoMessages(null,ex.getMessage(),"Delete Error");
            Logger.getLogger(BooksDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<BooksTypeModel> getAllBooksType() {
        String sqlQueryBooksType = "SELECT bookstypeid,typename,lastupdate FROM bookstype";
        ResultSet resultSet = createResultSet(sqlQueryBooksType);
        try {
            while (resultSet.next()) {
                booksTypeModel = new BooksTypeModel();
                booksTypeModel.setBookTypeId(resultSet.getInt("bookstypeid"));
                booksTypeModel.setTypeName(resultSet.getString("typename"));
                booksTypeModel.setLastUpdate(resultSet.getDate("lastupdate"));
                booksTypeList.add(booksTypeModel);
            }
            return booksTypeList;
        } catch (SQLException ex) {
            UserInfoMessages.getInstance().exceptionInfoMessages(null,ex.getMessage(),"Search Error");
            Logger.getLogger(BooksDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    @Override
    public List<AuthorModel> allAuthors() {
        String sqlQueryAuthor = "SELECT a.authorid,p.firstname,p.lastname FROM author a,person p  WHERE a.personid=p.personid";
        ResultSet resultSet = createResultSet(sqlQueryAuthor);
        try {
            while (resultSet.next()) {
                authorModel = new AuthorModel();
                authorModel.setAuthorId(resultSet.getInt("authorid"));
                authorModel.setFirstName(resultSet.getString("firstname"));
                authorModel.setLastName(resultSet.getString("lastname"));
                authorModelList.add(authorModel);
            }
            return authorModelList;
        } catch (SQLException ex) {
            UserInfoMessages.getInstance().exceptionInfoMessages(null,ex.getMessage(),"Search Error");
            Logger.getLogger(BooksDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public List<PublisherModel> allPublisher() {
        String sqlQueryPublisher = "SELECT * FROM publisher";
        ResultSet resultSet = createResultSet(sqlQueryPublisher);
        try {
            while (resultSet.next()) {
                publisherModel = new PublisherModel();
                publisherModel.setPublisherId(resultSet.getInt("publisherid"));
                publisherModel.setPublisherName(resultSet.getString("publishername"));
                publisherModels.add(publisherModel);
            }
            return publisherModels;
        } catch (SQLException ex) {
            UserInfoMessages.getInstance().exceptionInfoMessages(null,ex.getMessage(),"Search Error");
            Logger.getLogger(BooksDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    private void fillFilters(StringBuilder query, Map<String, String> map) {
        if (!map.isEmpty()) {
            if (map.containsKey("isbn")) {
                query.append("AND ");
                query.append("b.isbn ");
                query.append("LIKE '");
                query.append(map.get("isbn"));
                query.append("%' ");
            }

            if (map.containsKey("bookName")) {
                query.append("AND ");
                query.append("b.booksname ");
                query.append("LIKE '%");
                query.append(map.get("bookName"));
                query.append("%' ");
            }

            if (map.containsKey("authorName")) {
                query.append("AND ");
                query.append("(p.firstname || ' ' || p.lastname) ");
                query.append("LIKE '%");
                query.append(map.get("authorName"));
                query.append("%' ");
            }

            if (map.containsKey("bookType")) {
                query.append("AND ");
                query.append("bt.typename ");
                query.append("LIKE '%");
                query.append(map.get("bookType"));
                query.append("%' ");
            }
        }
    }
}
