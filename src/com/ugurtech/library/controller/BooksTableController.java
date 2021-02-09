/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ugurtech.library.controller;

import com.ugurtech.library.dao.BooksDao;
import com.ugurtech.library.dao.BooksDaoImpl;
import com.ugurtech.library.generalclasses.UserInfoMessages;
import com.ugurtech.library.view.book.BooksSearch;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ugur
 * 
 */
public final class BooksTableController {

    private final BooksSearch booksTable;
    private final BooksDao booksDao;

    public BooksTableController(BooksSearch booksTable) {
        this.booksTable = booksTable;
        this.booksDao = new BooksDaoImpl();
        this.fillAllBooks();
    }

    public void fillAllBooks() {
        Map<String, String> filters = new HashMap<>();
        
        Optional.ofNullable(booksTable.getISBNTextField().getText())
                .filter(value -> !value.equals(""))
                .ifPresent(value -> filters.put("isbn", value));

        Optional.ofNullable(booksTable.getBookNameTextField().getText())
                .filter(value -> !value.equals(""))
                .ifPresent(value -> filters.put("bookName", value));

        Optional.ofNullable(booksTable.getAuthorNameTextField().getText())
                .filter(value -> !value.equals(""))
                .ifPresent(value -> filters.put("authorName", value));

        Optional.ofNullable(booksTable.getBookTypeTextField().getText())
                .filter(value -> !value.equals(""))
                .ifPresent(value -> filters.put("bookType", value));
        
        booksTable.getBooksTable().setModel(DbUtils.resultSetToTableModel(booksDao.findBooksByFilters(filters)));
    }

    public void deleteBook() {
        if (booksTable.getBooksTable().getSelectedRow() == -1) {
            UserInfoMessages.getInstance().showInfoMessages("Lütfen silmek istediğiniz veriyi seçin");
        } else if (booksTable.getBooksTable().getValueAt(booksTable.getBooksTable().getSelectedRow(), 8).equals("Evet")) {
            UserInfoMessages.getInstance().showInfoMessages("Bu Kitap Ödünç Verilmiştir Silinemez");
        } else if (UserInfoMessages.getInstance().showApproveMessages("Seçilen satırı silmek istediğinize eminmisiniz?", "Silme İşlemi Onay Formu")) {
            booksDao.deleteBook((int) booksTable.getBooksTable().getModel().getValueAt(booksTable.getBooksTable().getSelectedRow(), 0));
        }
        fillAllBooks();
    }

    public void updateBook() {

    }

}
