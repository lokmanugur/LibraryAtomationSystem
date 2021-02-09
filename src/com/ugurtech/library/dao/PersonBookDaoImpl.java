/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ugurtech.library.dao;

import com.ugurtech.library.generalclasses.UserInfoMessages;
import com.ugurtech.library.model.BookBorrowingModel;
import com.ugurtech.library.model.PersonBookBorrowingModel;
import com.ugurtech.library.model.PersonBookModel;
import com.ugurtech.library.model.TakenBackBookModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ugur
 */
public class PersonBookDaoImpl extends DaoAbstract implements PersonBookDao {

    @Override
    public List<PersonBookBorrowingModel> getAllPerson() {
        List<PersonBookBorrowingModel> personBookBorrowingList=new ArrayList<>();
        PersonBookBorrowingModel personBookBorrowingModel;
        String sqlQueryAllPerson="SELECT p.personid, p.firstname, p.lastname, p.birthdate, "
                + "p.phone,p.address,sch.schoolname,s.studentclass,s.studentnumber "
                + "FROM person p "
                + "LEFT JOIN student s ON p.personid=s.personid "
                + "LEFT JOIN school sch ON s.schoolid=sch.schoolid "
                + "LEFT JOIN author a ON p.personid=a.personid WHERE a.personid IS NULL ORDER BY p.firstname ASC ";
        ResultSet resultSet = createResultSet(sqlQueryAllPerson);
        try {
            while(resultSet.next()){
                personBookBorrowingModel = new PersonBookBorrowingModel();
                personBookBorrowingModel.setPersonId(resultSet.getInt("personid"));
                personBookBorrowingModel.setFirstName(resultSet.getString("firstname"));
                personBookBorrowingModel.setLastName(resultSet.getString("lastname"));
                personBookBorrowingModel.setBirthDate(resultSet.getDate("birthdate"));
                personBookBorrowingModel.setPhone(resultSet.getString("phone"));
                personBookBorrowingModel.setAddress(resultSet.getString("address"));
                personBookBorrowingModel.setSchool(resultSet.getString("schoolname"));
                personBookBorrowingModel.setStudentClass(resultSet.getString("studentclass"));
                personBookBorrowingModel.setStudentNumber(resultSet.getString("studentnumber"));
                personBookBorrowingList.add(personBookBorrowingModel);
            }
        } catch (SQLException ex) {
            UserInfoMessages.getInstance().exceptionInfoMessages(null,ex.getMessage(),"Search Error");
            Logger.getLogger(PersonBookDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return personBookBorrowingList;
    }
    
    @Override
    public List<BookBorrowingModel> getAllBook() {
        String sqlQueryAllBook="SELECT b.booksid as Kitap_NO,\n" +
                                "b.isbn as ISBN,\n" +
                                "b.booksname as Kitap_Adı, \n" +
                                "group_concat(DISTINCT bt.typename) Kitap_Türü, \n" +
                                "group_concat(DISTINCT (p.firstname || ' ' || p.lastname)) Kitap_Yazarı,\n" +
                                "pub.publishername as Yayın_Evi \n" +
                                "FROM books b \n" +
                                "left join bookstypebooks btb on  b.booksid=btb.booksid \n" +
                                "left join bookstype bt on btb.bookstypeid = bt.bookstypeid \n" +
                                "left join booksauthor ba on b.booksid=ba.booksid \n" +
                                "left join author a on ba.authorid=a.authorid \n" +
                                "left join person p on a.personid=p.personid \n" +
                                "left join publisher pub on b.publisherid=pub.publisherid WHERE b.bookborrowed=0 AND b.deleted=0 \n" +
                                "GROUP BY b.booksid ";
        List<BookBorrowingModel> booksList;
        booksList = new ArrayList<>();
        BookBorrowingModel bookBorrowingModel;
        ResultSet resultSet=createResultSet(sqlQueryAllBook);
        try {
            while(resultSet.next()){
                bookBorrowingModel = new BookBorrowingModel();
                bookBorrowingModel.setBookId(resultSet.getInt("Kitap_NO"));
                bookBorrowingModel.setIsbn(resultSet.getLong("ISBN"));
                bookBorrowingModel.setBookName(resultSet.getString("Kitap_Adı"));
                bookBorrowingModel.setBookAutors(resultSet.getString("Kitap_Yazarı"));
                bookBorrowingModel.setBookTypes(resultSet.getString("Kitap_Türü"));
                booksList.add(bookBorrowingModel);
            }
        } catch (SQLException ex) {
            UserInfoMessages.getInstance().exceptionInfoMessages(null,ex.getMessage(),"Search Error");
            Logger.getLogger(PersonBookDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return booksList;
    }
    
    @Override
    public PersonBookBorrowingModel getPersonBook(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addPersonBook(PersonBookModel personBookModel) {
        String sqlQueryBookBorrowing="INSERT INTO personbooks(personid,booksid,startdate,finishdate) VALUES(?,?,?,?)";
        String sqlQueryBookUpdate="UPDATE books SET bookborrowed=? WHERE booksid=?";
        PreparedStatement preparedStatementUpdate=createPrepareStatement(sqlQueryBookUpdate);
        PreparedStatement preparedStatement=createPrepareStatement(sqlQueryBookBorrowing);
        int effactedRow = 0;

                try {
                    for(BookBorrowingModel bookBorrowingModel:personBookModel.getBookBorrowingModel()){
                        preparedStatement.setInt(1, personBookModel.getPersonId());
                        preparedStatement.setInt(2, bookBorrowingModel.getBookId());
                        preparedStatement.setString(3, personBookModel.getStartDate().toString());
                        preparedStatement.setString(4, personBookModel.getFinishDate().toString());
                        effactedRow=preparedStatement.executeUpdate();
                    }
                    for(BookBorrowingModel bookBorrowingModel:personBookModel.getBookBorrowingModel()){
                        preparedStatementUpdate.setBoolean(1, true);
                        preparedStatementUpdate.setInt(2, bookBorrowingModel.getBookId());
                        preparedStatementUpdate.executeUpdate();
                    }
                } catch (SQLException ex) {
                    UserInfoMessages.getInstance().exceptionInfoMessages(null,ex.getMessage(),"Insert or Update Error");
                    Logger.getLogger(PersonBookDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        UserInfoMessages.getInstance().insertMessage(effactedRow);
    }

    @Override
    public void updatePersonBook(PersonBookBorrowingModel personBookBorrowingModel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletePersonBook(PersonBookBorrowingModel personBookBorrowingModel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TakenBackBookModel getTakenBackBook(TakenBackBookModel tbbm) {
        String sqlQueryTakeBackBook="SELECT b.booksid as Kitap_NO,b.isbn as ISBN,b.booksname as Kitap_Adı, \n" +
                            "group_concat(DISTINCT bt.typename) Kitap_Türü, group_concat(DISTINCT (p.firstname || ' ' || p.lastname)) Kitap_Yazarı,\n" +
                            "pub.publishername as Yayın_Evi,pb.startdate as Veriliş_Tarihi,pb.finishdate as Bitiş_Tarihi,pb.personbookid as borrownumber, \n" +
                            "ps.firstname ||' '||ps.lastname as Öğrenci_Adı_Soyadı,s.studentnumber as Öğrenci_No, s.studentclass as Sınıfı, sch.schoolname as Okul_Adı,ps.phone as Telefon, ps.address as Adres \n" +
                            "FROM books b \n" +
                            "LEFT JOIN bookstypebooks btb on  b.booksid = btb.booksid \n" +
                            "LEFT JOIN bookstype bt on btb.bookstypeid = bt.bookstypeid \n" +
                            "LEFT JOIN booksauthor ba on b.booksid = ba.booksid \n" +
                            "LEFT JOIN author a on ba.authorid = a.authorid \n" +
                            "LEFT JOIN person p on a.personid = p.personid \n" +
                            "LEFT JOIN personbooks pb on pb.booksid = b.booksid \n" +
                            "LEFT JOIN person ps on pb.personid = ps.personid \n" +
                            "LEFT JOIN student s on ps.personid = s.personid \n" +
                            "LEFT JOIN school sch on s.schoolid = sch.schoolid \n" +
                            "LEFT JOIN publisher pub on b.publisherid = pub.publisherid WHERE b.bookborrowed = 1 AND pb.bringbackdate is null AND b.isbn='"+tbbm.getBookIsbn()+"'  GROUP BY b.booksid";
        ResultSet resultSet=createResultSet(sqlQueryTakeBackBook);
        
        try {
            if(resultSet.next()){
            tbbm.setBookid(resultSet.getInt("Kitap_NO"));
            tbbm.setBookIsbn(resultSet.getInt("ISBN"));
            tbbm.setBookpersonid(resultSet.getInt("borrownumber"));
            tbbm.setBookTitle(resultSet.getString("Kitap_Adı"));
            tbbm.setBookType(resultSet.getString("Kitap_Türü"));
            tbbm.setBookAuthor(resultSet.getString("Kitap_Yazarı"));
            tbbm.setPublisher(resultSet.getString("Yayın_Evi"));
            tbbm.setStartDate(resultSet.getString("Veriliş_Tarihi"));
            tbbm.setFinishDate(resultSet.getString("Bitiş_Tarihi"));
            tbbm.setReturnDate(new Date().toString());
            
            tbbm.setStudentNumber(resultSet.getString("Öğrenci_No"));
            tbbm.setFirstLastName(resultSet.getString("Öğrenci_Adı_Soyadı"));
            tbbm.setClassRoom(resultSet.getString("Sınıfı"));
            tbbm.setSchoolName(resultSet.getString("Okul_Adı"));
            tbbm.setPhone(resultSet.getString("Telefon"));
            tbbm.setAddress(resultSet.getString("Adres"));}
        } catch (SQLException ex) {
            UserInfoMessages.getInstance().exceptionInfoMessages(null,ex.getMessage(),"Search Error");
            Logger.getLogger(PersonBookDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tbbm;
    }

    @Override
    public void acceptBook(TakenBackBookModel tbbm) {
        String sqlQueryBookUpdate="UPDATE books SET bookborrowed=? WHERE booksid='"+tbbm.getBookid()+"'";
        String sqlQueryPersonBookUpdate="UPDATE personbooks SET bringbackdate=? WHERE personbookid='"+tbbm.getBookpersonid()+"'";
        PreparedStatement preparedStatementBook=createPrepareStatement(sqlQueryBookUpdate);
        PreparedStatement preparedStatementPersonBook=createPrepareStatement(sqlQueryPersonBookUpdate);
        
        try {
            preparedStatementBook.setBoolean(1, false);
            preparedStatementBook.executeUpdate();
            preparedStatementPersonBook.setString(1, tbbm.getReturnDate());
            int effactedRow=preparedStatementPersonBook.executeUpdate();
            UserInfoMessages.getInstance().insertMessage(effactedRow);
        } catch (SQLException ex) {
            UserInfoMessages.getInstance().exceptionInfoMessages(null,ex.getMessage(),"Search Error");
            Logger.getLogger(PersonBookDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
