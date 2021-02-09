/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ugurtech.library.view.book;
import com.ugurtech.library.controller.BooksFormController;
import com.ugurtech.library.view.MainFrame;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JList;
import javax.swing.JTextField;
import org.jdesktop.swingx.JXDatePicker;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
/**
 *
 * @author ugur
 * 
 */
public final class BooksForm extends JInternalFrame {
    
    private final BooksFormController booksController;
    private static BooksForm emptyUI;
    private DefaultListModel bookTypeDefaultListModel;
    private DefaultListModel authorDefaultModel;
    
    private BooksForm() {
        initComponents();
        booksController = new BooksFormController(this);
        AutoCompleteDecorator.decorate(booksTypeComboBox);
        AutoCompleteDecorator.decorate(authorComboBox);
        AutoCompleteDecorator.decorate(publicsherComboBox);
        bookTypeDefaultListModel = new DefaultListModel();
        authorDefaultModel = new DefaultListModel();
        bookTypeList.setModel(bookTypeDefaultListModel);
        authorList.setModel(authorDefaultModel);
        setLocation(getWidth()/2, getHeight()/100);
    }
    
    public static BooksForm getInstance(){
        if(emptyUI==null)
            return emptyUI= new BooksForm();
        else
            return emptyUI;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bookPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        authorList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        authorNameLabel = new javax.swing.JLabel();
        authorComboBox = new javax.swing.JComboBox<>();
        authorButton = new javax.swing.JButton();
        authorRemoveButton = new javax.swing.JButton();
        authorAddButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        booksTypeComboBox = new javax.swing.JComboBox<>();
        typrNameLabel = new javax.swing.JLabel();
        typeButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        bookTypeList = new javax.swing.JList<>();
        typrNameLabel1 = new javax.swing.JLabel();
        booksTypeAddButton = new javax.swing.JButton();
        booksTypeRemoveButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        isbnTextField = new javax.swing.JTextField();
        isbnLabel = new javax.swing.JLabel();
        bookNameLabel = new javax.swing.JLabel();
        bookNameTextField = new javax.swing.JTextField();
        publicsherComboBox = new javax.swing.JComboBox<>();
        authorNameLabel1 = new javax.swing.JLabel();
        pressDateLable = new javax.swing.JLabel();
        pressDatePicker = new org.jdesktop.swingx.JXDatePicker();
        publisherButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        cancelButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Kitap Kayıt Formu");

        bookPanel.setBorder(null);
        bookPanel.setMinimumSize(new java.awt.Dimension(487, 268));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Kitap Yazarları"));

        jScrollPane1.setViewportView(authorList);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Yazarlar:");

        authorNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        authorNameLabel.setText("Yazar Ekle:");

        authorComboBox.setEditable(true);
        authorComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                authorComboBoxPopupMenuWillBecomeVisible(evt);
            }
        });

        authorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/poem.png"))); // NOI18N
        authorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorButtonActionPerformed(evt);
            }
        });

        authorRemoveButton.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        authorRemoveButton.setText("-");
        authorRemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorRemoveButtonActionPerformed(evt);
            }
        });

        authorAddButton.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        authorAddButton.setText("+");
        authorAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorAddButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authorNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(authorComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(authorAddButton, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(authorRemoveButton, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(authorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(authorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(authorRemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(authorNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(authorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authorAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Kitap Türleri"));

        booksTypeComboBox.setEditable(true);
        booksTypeComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                booksTypeComboBoxPopupMenuWillBecomeVisible(evt);
            }
        });
        booksTypeComboBox.getEditor().getEditorComponent().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                typeComboBoxKeyReleased(evt);
            }
        });

        typrNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        typrNameLabel.setText("Kitap Türü Ekle:");

        typeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/separation.png"))); // NOI18N
        typeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeButtonActionPerformed(evt);
            }
        });

        bookTypeList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookTypeListMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(bookTypeList);

        typrNameLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        typrNameLabel1.setText("Kitap Türü:");

        booksTypeAddButton.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        booksTypeAddButton.setText("+");
        booksTypeAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booksTypeAddButtonActionPerformed(evt);
            }
        });

        booksTypeRemoveButton.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        booksTypeRemoveButton.setText("-");
        booksTypeRemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booksTypeRemoveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(typrNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(typrNameLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                    .addComponent(booksTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(typeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(booksTypeAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(booksTypeRemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(typrNameLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(typeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(booksTypeRemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(booksTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(typrNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(booksTypeAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Kitap Bilgileri"));

        isbnLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        isbnLabel.setText("ISBN:");

        bookNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bookNameLabel.setText("Kitap Adı:");

        publicsherComboBox.setEditable(true);
        publicsherComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                publicsherComboBoxPopupMenuWillBecomeVisible(evt);
            }
        });

        authorNameLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        authorNameLabel1.setText("Yayın Evi:");

        pressDateLable.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pressDateLable.setText("Basım Tarihi:");

        publisherButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/advertisement.png"))); // NOI18N
        publisherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publisherButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(authorNameLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bookNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(isbnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pressDateLable, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(publicsherComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(publisherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pressDatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bookNameTextField)
                    .addComponent(isbnTextField))
                .addGap(17, 17, 17))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(isbnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isbnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bookNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(publicsherComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authorNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(publisherButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pressDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pressDateLable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cancelButton.setText("İptal Et");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Kaydet");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelButton)
                .addGap(47, 47, 47)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout bookPanelLayout = new javax.swing.GroupLayout(bookPanel);
        bookPanel.setLayout(bookPanelLayout);
        bookPanelLayout.setHorizontalGroup(
            bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bookPanelLayout.setVerticalGroup(
            bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bookPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bookPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void authorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorButtonActionPerformed
        MainFrame.getInstance().addDesktopPane(AuthorForm.getInstance());
    }//GEN-LAST:event_authorButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
       booksController.addBooks();
       clearAllFields();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void publisherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publisherButtonActionPerformed
        MainFrame.getInstance().addDesktopPane(PublisherForm.getInstance());
    }//GEN-LAST:event_publisherButtonActionPerformed

    private void typeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeButtonActionPerformed
        MainFrame.getInstance().addDesktopPane(BooksTypeForm.getInstance());
    }//GEN-LAST:event_typeButtonActionPerformed

    private void booksTypeComboBoxPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_booksTypeComboBoxPopupMenuWillBecomeVisible
        booksController.allBooksType();
    }//GEN-LAST:event_booksTypeComboBoxPopupMenuWillBecomeVisible

    private void bookTypeListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTypeListMouseClicked
        if(evt.getClickCount()==2){
            evt.consume();
            booksController.removeBooksTypeFromBooksTypeList();
        }
    }//GEN-LAST:event_bookTypeListMouseClicked

    private void booksTypeAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booksTypeAddButtonActionPerformed
        booksController.addFromBooksTypeComboBoxToBooksTypeList();
    }//GEN-LAST:event_booksTypeAddButtonActionPerformed

    private void booksTypeRemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booksTypeRemoveButtonActionPerformed
        booksController.removeBooksTypeFromBooksTypeList();
    }//GEN-LAST:event_booksTypeRemoveButtonActionPerformed

    private void authorRemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorRemoveButtonActionPerformed
        booksController.removeAuthorFromAuthorList();
    }//GEN-LAST:event_authorRemoveButtonActionPerformed

    private void authorAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorAddButtonActionPerformed
        booksController.addFromAuthorComboBaxToAuthorList();
    }//GEN-LAST:event_authorAddButtonActionPerformed

    private void authorComboBoxPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_authorComboBoxPopupMenuWillBecomeVisible
        booksController.allAuthors();
    }//GEN-LAST:event_authorComboBoxPopupMenuWillBecomeVisible

    private void publicsherComboBoxPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_publicsherComboBoxPopupMenuWillBecomeVisible
       booksController.allPublisher();
    }//GEN-LAST:event_publicsherComboBoxPopupMenuWillBecomeVisible

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        clearAllFields();
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void typeComboBoxKeyReleased(java.awt.event.KeyEvent evt) {
        if(evt.getKeyCode()==10)
        booksController.addFromBooksTypeComboBoxToBooksTypeList();
    }

    public void clearAllFields(){
        authorComboBox.removeAllItems();
        bookTypeDefaultListModel.removeAllElements();
        bookNameTextField.setText(null);
        authorDefaultModel.removeAllElements();
        booksTypeComboBox.removeAllItems();
        isbnTextField.setText(null);
        pressDatePicker.setDate(null);
        publicsherComboBox.removeAllItems();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton authorAddButton;
    private javax.swing.JButton authorButton;
    private javax.swing.JComboBox<String> authorComboBox;
    private javax.swing.JList<String> authorList;
    private javax.swing.JLabel authorNameLabel;
    private javax.swing.JLabel authorNameLabel1;
    private javax.swing.JButton authorRemoveButton;
    private javax.swing.JLabel bookNameLabel;
    private javax.swing.JTextField bookNameTextField;
    private javax.swing.JPanel bookPanel;
    private javax.swing.JList<String> bookTypeList;
    private javax.swing.JButton booksTypeAddButton;
    private javax.swing.JComboBox<String> booksTypeComboBox;
    private javax.swing.JButton booksTypeRemoveButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel isbnLabel;
    private javax.swing.JTextField isbnTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel pressDateLable;
    private org.jdesktop.swingx.JXDatePicker pressDatePicker;
    private javax.swing.JComboBox<String> publicsherComboBox;
    private javax.swing.JButton publisherButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton typeButton;
    private javax.swing.JLabel typrNameLabel;
    private javax.swing.JLabel typrNameLabel1;
    // End of variables declaration//GEN-END:variables

    public DefaultListModel getAuthorDefaultModel() {
        return authorDefaultModel;
    }

    public void setAuthorDefaultModel(DefaultListModel authorDefaultModel) {
        this.authorDefaultModel = authorDefaultModel;
    }
    
    public DefaultListModel getBooksTypeDefaultListModel() {
        return bookTypeDefaultListModel;
    }

    public void setBooksTypeDefaultListModel(DefaultListModel defaultListModel) {
        this.bookTypeDefaultListModel = defaultListModel;
    }

    public JList<String> getAuthorTypeList() {
        return authorList;
    }

    public void setAuthorTypeList(JList<String> authorTypeList) {
        this.authorList = authorTypeList;
    }

    public JList<String> getBookTypeList() {
        return bookTypeList;
    }

    public void setBookTypeList(JList<String> bookTypeList) {
        this.bookTypeList = bookTypeList;
    }

    public JComboBox<String> getPublicsherComboBox() {
        return publicsherComboBox;
    }

    public void setPublicsherComboBox(JComboBox<String> publicsherComboBox) {
        this.publicsherComboBox = publicsherComboBox;
    }
        
    public JComboBox<String> getBooksTypeComboBox() {
        return booksTypeComboBox;
    }

    public void setBooksTypeComboBox(JComboBox<String> booksTypeComboBox) {
        this.booksTypeComboBox = booksTypeComboBox;
    }

    public JComboBox<String> getAuthorComboBox() {
        return authorComboBox;
    }

    public void setAuthorComboBox(JComboBox<String> authorComboBox) {
        this.authorComboBox = authorComboBox;
    }

    public JButton getAuthorButton() {
        return authorButton;
    }

    public void setAuthorButton(JButton authorButton) {
        this.authorButton = authorButton;
    }

    public JTextField getBookNameTextField() {
        return bookNameTextField;
    }

    public void setBookNameTextField(JTextField bookNameTextField) {
        this.bookNameTextField = bookNameTextField;
    }

    public JButton getCancelButton() {
        return cancelButton;
    }

    public void setCancelButton(JButton cancelButton) {
        this.cancelButton = cancelButton;
    }

    public JTextField getIsbnTextField() {
        return isbnTextField;
    }

    public void setIsbnTextField(JTextField isbnTextField) {
        this.isbnTextField = isbnTextField;
    }

    public JXDatePicker getPressDatePicker() {
        return pressDatePicker;
    }

    public void setPressDatePicker(JXDatePicker pressDatePicker) {
        this.pressDatePicker = pressDatePicker;
    }

    public JButton getSaveButton() {
        return saveButton;
    }

    public void setSaveButton(JButton saveButton) {
        this.saveButton = saveButton;
    }
}
