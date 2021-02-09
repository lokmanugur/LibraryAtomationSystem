package com.ugurtech.library.view.book;

import com.ugurtech.library.controller.AuthorSearchController;
import com.ugurtech.library.generalclasses.TableToExcelImpl;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JInternalFrame;
/**
 *
 * @author lokman uğur
 * 
 */
public final class AuthorSearchForm extends JInternalFrame {

    private static AuthorSearchForm authorSearchForm;
    private final AuthorSearchController authorSearchController;
    
    private AuthorSearchForm() {
        initComponents();
        this.authorSearchController = new AuthorSearchController(this);
        setLocation(getWidth()/10,getHeight()/10);
        authorSearchController.fillAllAuthor();
    }

    public static AuthorSearchForm getInstance(){
        if(authorSearchForm == null)
            return authorSearchForm = new AuthorSearchForm();
        else
            return authorSearchForm;
    }


 /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelToolBar = new javax.swing.JPanel();
        panelGuncelleme = new javax.swing.JPanel();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        panelSearch = new javax.swing.JPanel();
        authorIdTextField = new javax.swing.JTextField();
        labelID = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        authorNameTextField = new javax.swing.JTextField();
        panelOut = new javax.swing.JPanel();
        writeFlileButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        authorTable = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Yazarlar Bilgi Ayrıntı Tablosu");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panelGuncelleme.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Güncelleme", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        updateButton.setText("Güncelle");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Sil");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGuncellemeLayout = new javax.swing.GroupLayout(panelGuncelleme);
        panelGuncelleme.setLayout(panelGuncellemeLayout);
        panelGuncellemeLayout.setHorizontalGroup(
            panelGuncellemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuncellemeLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(panelGuncellemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelGuncellemeLayout.setVerticalGroup(
            panelGuncellemeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuncellemeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ara", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        authorIdTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                authorIdTextFieldKeyReleased(evt);
            }
        });

        labelID.setText("Yazar No:");

        jLabel1.setText("Yazar Adı Soyadı:");

        authorNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                authorNameTextFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelSearchLayout = new javax.swing.GroupLayout(panelSearch);
        panelSearch.setLayout(panelSearchLayout);
        panelSearchLayout.setHorizontalGroup(
            panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSearchLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(authorIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(authorNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSearchLayout.setVerticalGroup(
            panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSearchLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(authorIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(authorNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        panelOut.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Çıktı", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        writeFlileButton.setText("Exelle Yaz");
        writeFlileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writeFlileButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOutLayout = new javax.swing.GroupLayout(panelOut);
        panelOut.setLayout(panelOutLayout);
        panelOutLayout.setHorizontalGroup(
            panelOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOutLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(writeFlileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelOutLayout.setVerticalGroup(
            panelOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(writeFlileButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelToolBarLayout = new javax.swing.GroupLayout(panelToolBar);
        panelToolBar.setLayout(panelToolBarLayout);
        panelToolBarLayout.setHorizontalGroup(
            panelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelToolBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelGuncelleme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelToolBarLayout.setVerticalGroup(
            panelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelToolBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelGuncelleme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        authorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        )
        {public boolean isCellEditable(int row, int column){return false;}}
    );
    jScrollPane1.setViewportView(authorTable);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane1)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(panelToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(panelToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE))
    );

    getAccessibleContext().setAccessibleName("Menu Hareket");

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        authorSearchController.deleteAuthor();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        authorSearchController.updateAuthor();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void writeFlileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writeFlileButtonActionPerformed
        new TableToExcelImpl(authorTable, "Yazar Bilgi Tablosu").writeToTable();
    }//GEN-LAST:event_writeFlileButtonActionPerformed

    private void authorIdTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_authorIdTextFieldKeyReleased
        authorSearchController.fillAllAuthor();
    }//GEN-LAST:event_authorIdTextFieldKeyReleased

    private void authorNameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_authorNameTextFieldKeyReleased
         authorSearchController.fillAllAuthor();
    }//GEN-LAST:event_authorNameTextFieldKeyReleased

    public void fillAllAuthor() {
        authorSearchController.fillAllAuthor();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField authorIdTextField;
    private javax.swing.JTextField authorNameTextField;
    private javax.swing.JTable authorTable;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelID;
    private javax.swing.JPanel panelGuncelleme;
    private javax.swing.JPanel panelOut;
    private javax.swing.JPanel panelSearch;
    private javax.swing.JPanel panelToolBar;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton writeFlileButton;
    // End of variables declaration//GEN-END:variables

        public JTextField getAuthorIdTextField() {
        return authorIdTextField;
    }

    public void setAuthorIdTextField(JTextField authorIdTextField) {
        this.authorIdTextField = authorIdTextField;
    }

    public JTextField getAuthorNameTextField() {
        return authorNameTextField;
    }

    public void setAuthorNameTextField(JTextField authorNameTextField) {
        this.authorNameTextField = authorNameTextField;
    }

    public JTable getAuthorTable() {
        return authorTable;
    }

    public void setAuthorTable(JTable authorTable) {
        this.authorTable = authorTable;
    }

    public JButton getDeleteButton() {
        return deleteButton;
    }

    public void setDeleteButton(JButton deleteButton) {
        this.deleteButton = deleteButton;
    }

}