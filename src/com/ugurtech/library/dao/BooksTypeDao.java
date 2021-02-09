/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ugurtech.library.dao;

import com.ugurtech.library.model.BooksTypeModel;
import java.sql.ResultSet;

/**
 *
 * @author ugur
 */
public interface BooksTypeDao {
    
    public ResultSet findBookTypeByFilter();
    public BooksTypeModel getBookType(int bookTypeId);
    public void addBookType(BooksTypeModel bookTypeModel);
    public void updateBookType(BooksTypeModel bookTypeModel);
    public void deleteBookType(int bookTypeId);
    
}
