/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ugurtech.library.controller;

import com.ugurtech.library.model.BooksModel;
import com.ugurtech.library.model.CurrentUserModel;
import com.ugurtech.library.view.book.BooksForm;
import com.ugurtech.library.dao.BooksDao;
import com.ugurtech.library.dao.BooksDaoImpl;
import com.ugurtech.library.model.AuthorModel;
import com.ugurtech.library.model.BooksTypeModel;
import com.ugurtech.library.model.PublisherModel;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ugur
 */
public final class BooksFormController {
    
    private final BooksForm booksForm;
    private final BooksDao booksDao;
    private BooksModel booksModel;
    private List<BooksTypeModel> booksTypeModels;
    private List<AuthorModel> authorModels;
    private List<PublisherModel> publisherModels;
    
    public BooksFormController(BooksForm booksForm){
        
        this.booksDao = new BooksDaoImpl();
        this.booksForm = booksForm;
        this.booksTypeModels = new ArrayList<>();
        this.authorModels = new ArrayList<>();
        this.publisherModels = new ArrayList<>();
    }
    
    public void addBooks(){
        this.booksModel = new BooksModel();
        List<AuthorModel> authorList=new ArrayList<>();
        List<BooksTypeModel> bookTypeList=new ArrayList<>();
        booksModel.setSysuserId(CurrentUserModel.getInstance().getSysUserId());
        booksModel.setIsbn(Long.parseLong(booksForm.getIsbnTextField().getText()));
        booksModel.setBookName(booksForm.getBookNameTextField().getText());
        booksModel.setPressDate(new Date(booksForm.getPressDatePicker().getLinkDay().getTime()));
        
        for(int i=0;i<booksForm.getBooksTypeDefaultListModel().getSize();i++){
            bookTypeList.add((BooksTypeModel)booksForm.getBooksTypeDefaultListModel().getElementAt(i));
        }
        booksModel.setBooksType(bookTypeList);
        
        for(int i=0;i<booksForm.getAuthorDefaultModel().getSize();i++){
            authorList.add((AuthorModel)booksForm.getAuthorDefaultModel().getElementAt(i));
        }
        booksModel.setAuthor(authorList);
        
        publisherModels.stream()
                .filter(pm -> (booksForm.getPublicsherComboBox().getSelectedItem().toString().equals(pm.getPublisherName())))
                .forEachOrdered(pm -> {booksModel.setBublisherId(pm.getPublisherId());});
        
        this.booksDao.addBook(booksModel);
    }
    
    public void allBooksType(){
        booksForm.getBooksTypeComboBox().removeAllItems();
        booksTypeModels.clear();
        booksTypeModels = booksDao.getAllBooksType();
        booksTypeModels.forEach(btm -> {
            booksForm.getBooksTypeComboBox().addItem(btm.getTypeName());
        });
    }
    
    public void addFromBooksTypeComboBoxToBooksTypeList(){ 
        booksTypeModels.stream()
                .filter(btm -> (btm.getTypeName().equals(booksForm.getBooksTypeComboBox().getSelectedItem())))
                .forEachOrdered(btm -> {booksForm.getBooksTypeDefaultListModel().addElement(btm);});       
    }
    
    public void removeBooksTypeFromBooksTypeList(){
        if(!booksForm.getBookTypeList().isSelectionEmpty()){
        booksForm.getBooksTypeDefaultListModel().remove(booksForm.getBookTypeList().getSelectedIndex());}
    }
    
    public void allAuthors(){
        booksForm.getAuthorComboBox().removeAllItems();
        authorModels.clear();
        authorModels = booksDao.allAuthors();
        authorModels.forEach(am -> {booksForm.getAuthorComboBox().addItem(am.getFirstName()+" "+am.getLastName());});
    }
    
    public void addFromAuthorComboBaxToAuthorList(){
        authorModels.stream()
                .filter(am -> ((am.getFirstName()+" "+am.getLastName()).equals(booksForm.getAuthorComboBox().getSelectedItem())))
                .forEachOrdered(am -> {booksForm.getAuthorDefaultModel().addElement(am);});
    }
    
    public void removeAuthorFromAuthorList(){
        if(!booksForm.getAuthorTypeList().isSelectionEmpty()){
        booksForm.getAuthorDefaultModel().remove(booksForm.getAuthorTypeList().getSelectedIndex());
        }
    }
    
    public void allPublisher(){
        booksForm.getPublicsherComboBox().removeAllItems();
        publisherModels.clear();
        publisherModels = booksDao.allPublisher();
        publisherModels.forEach(pm->{booksForm.getPublicsherComboBox().addItem(pm.getPublisherName());});
    }
}
