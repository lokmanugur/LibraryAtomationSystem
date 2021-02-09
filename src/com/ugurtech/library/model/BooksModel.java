/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ugurtech.library.model;

import java.sql.Date;
import java.util.List;

/**
 *
 * @author ugur
 */
public class BooksModel extends DateModel {
    private int bookId;
    private long isbn;
    private int sysuserId;
    private List<AuthorModel> author;
    private List<BooksTypeModel> booksType;
    private int bublisherId;
    private String bookName;
    private Date pressDate;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int id) {
        this.bookId = id;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public int getSysuserId() {
        return sysuserId;
    }

    public void setSysuserId(int sysuserId) {
        this.sysuserId = sysuserId;
    }
    
    public int getBublisherId() {
        return bublisherId;
    }

    public void setBublisherId(int bublisherId) {
        this.bublisherId = bublisherId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Date getPressDate() {
        return pressDate;
    }

    public void setPressDate(Date pressDate) {
        this.pressDate = pressDate;
    }

    public List<AuthorModel> getAuthor() {
        return author;
    }

    public void setAuthor(List<AuthorModel> author) {
        this.author = author;
    }

    public List<BooksTypeModel> getBooksType() {
        return booksType;
    }

    public void setBooksType(List<BooksTypeModel> booksType) {
        this.booksType = booksType;
    }

}
