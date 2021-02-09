/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ugurtech.library.dao;

import com.ugurtech.library.generalclasses.UserInfoMessages;
import com.ugurtech.library.model.BooksTypeModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ugur
 */
public class BooksTypeDaoImpl extends DaoAbstract implements BooksTypeDao {

    private static final String TYPE_SEARCH_QUERY="SELECT bookstypeid as Kitap_Türü_No,"
            + "typename as Kitap_Türü,"
            + "abbreviation as Kısaltma,"
            + "lastupdate as Son_Güncelleme_Tarihi FROM bookstype ";
    private static final String BOOK_TYPE_DELETE_QUERY="UPDATE bookstype SET deleted=? WHERE bookstypeid=?";
    private static final String BOOK_TYPE_UPDATE_QUERY="UPDATE bookstype SET typename=?,abbreviation=?,lastupdate=? WHERE bookstypeid=?";
    private static final String BOOK_TYPE_INSERT_QUERY="INSERT INTO bookstype(typename,abbreviation) VALUES(?,?)";
    @Override
    public ResultSet findBookTypeByFilter() {
        StringBuilder query = new StringBuilder(TYPE_SEARCH_QUERY);
        query.append("WHERE ");
        query.append("deleted=0 ");
       // fillFilters(query,map);
        return createResultSet(query.toString());
    }
    
    @Override
    public BooksTypeModel getBookType(int bookTypeId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addBookType(BooksTypeModel bookTypeModel) {
        PreparedStatement preparedStatement=createPrepareStatement(BOOK_TYPE_INSERT_QUERY);
        try{
            preparedStatement.setString(1, bookTypeModel.getTypeName());
            preparedStatement.setString(2, bookTypeModel.getAbbrivation());
            int numberOfRow=preparedStatement.executeUpdate();
            UserInfoMessages.getInstance().insertMessage(numberOfRow);
        }catch(SQLException ex){
            UserInfoMessages.getInstance().exceptionInfoMessages(null,ex.getMessage(),"Insert Error");
            Logger.getLogger(BooksDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updateBookType(BooksTypeModel bookTypeModel) {
        PreparedStatement preparedStatement = createPrepareStatement(BOOK_TYPE_UPDATE_QUERY);
        try{
            preparedStatement.setString(1, bookTypeModel.getTypeName());
            preparedStatement.setString(2, bookTypeModel.getAbbrivation());
            preparedStatement.setString(3, new Date().toString());
            preparedStatement.setInt(4, bookTypeModel.getBookTypeId());
            int affectedRow = preparedStatement.executeUpdate();
            UserInfoMessages.getInstance().updateMessage(affectedRow);
        }catch(SQLException ex){
            UserInfoMessages.getInstance().exceptionInfoMessages(null,ex.getMessage(),"Update Error");
            Logger.getLogger(BooksDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteBookType(int bookTypeId) {
        PreparedStatement preparedStatement = createPrepareStatement(BOOK_TYPE_DELETE_QUERY);
        try{
            preparedStatement.setBoolean(1, true);
            preparedStatement.setInt(2, bookTypeId);
            int affectedRow = preparedStatement.executeUpdate();
            UserInfoMessages.getInstance().deletedMessage(affectedRow);
        }catch(SQLException ex){
            UserInfoMessages.getInstance().exceptionInfoMessages(null,ex.getMessage(),"Delete Error");
            Logger.getLogger(BooksDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }

//    private void fillFilters(StringBuilder query, Map<String, String> map) {
//        if(!map.isEmpty()){
//            if(map.containsKey("typeName")){
//                query.append("AND ");
//                query.append("typename LIKE '%");
//                query.append(map.get("typeName"));
//                query.append("%' ");
//            }
//            
//            if(map.containsKey("abbreviation")){
//                query.append("AND ");
//                query.append("abbreviation LIKE '%");
//                query.append(map.get("abbreviation"));
//                query.append("%' ");
//            }
//        }
//    }
}
