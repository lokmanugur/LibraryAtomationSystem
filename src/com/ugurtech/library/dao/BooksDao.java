/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ugurtech.library.dao;

import com.ugurtech.library.model.AuthorModel;
import com.ugurtech.library.model.BooksModel;
import com.ugurtech.library.model.BooksTypeModel;
import com.ugurtech.library.model.PublisherModel;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ugur
 * 
 */
public interface BooksDao {
    public ResultSet findBooksByFilters(Map<String, String> filters);
    public BooksModel getBook(int bookId);
    public void addBook(BooksModel book);
    public void updateBook(BooksModel book);
    public void deleteBook(int bookid);
    public List<BooksTypeModel>  getAllBooksType();
    public List<AuthorModel> allAuthors();
    public List<PublisherModel> allPublisher();
}
