package com.ugurtech.library.view;

import com.ugurtech.library.controller.LoginFormController;
import java.awt.Color;
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.*;

public class LoginForm extends JFrame {
    private final LoginFormController loginFormController;
    private static LoginForm loginForm;
    
    private LoginForm() {
        initComponents();
        loginFormController = new LoginFormController(this);
        userNameField.setText(" ");
        userPaswordField.setText(" ");
    }
    
    public static LoginForm getInstance(){
        if(loginForm==null)
            return loginForm=new LoginForm();
        else
            return loginForm;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon iconBackPanel = new ImageIcon(getClass().getResource("/images/back.jpg"));
        final Image imgBackPanel = iconBackPanel.getImage();
        mainPanel = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                g.drawImage(imgBackPanel, 0, 0, getWidth(),getHeight(),this);
            }};
            ImageIcon iconText2 = new ImageIcon(getClass().getResource("/images/text.png"));
            final Image imgText2 = iconText2.getImage();
            passwordPanel = new javax.swing.JPanel(){
                public void paintComponent(Graphics g){
                    g.drawImage(imgText2, 0, 0, getWidth(),getHeight(),this);
                }};
                userPaswordField = new javax.swing.JPasswordField();
                ImageIcon iconText1 = new ImageIcon(getClass().getResource("/images/text.png"));
                final Image imgText1 = iconText1.getImage();
                userNamePanel = new javax.swing.JPanel(){
                    public void paintComponent(Graphics g){
                        g.drawImage(imgText1, 0, 0, getWidth(),getHeight(),this);
                    }};
                    userNameField = new javax.swing.JTextField();
                    userNameLable = new javax.swing.JLabel();
                    passwordLable = new javax.swing.JLabel();
                    infolabel = new javax.swing.JLabel();
                    loginButton = new javax.swing.JButton();
                    closeButton = new javax.swing.JButton();

                    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                    setUndecorated(true);
                    setSize(new java.awt.Dimension(400, 200));

                    mainPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

                    passwordPanel.setPreferredSize(new java.awt.Dimension(157, 37));

                    userPaswordField.setBackground(new Color(0,0,0,0));
                    userPaswordField.setBorder(null);
                    userPaswordField.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                            userPaswordFieldKeyReleased(evt);
                        }
                    });

                    javax.swing.GroupLayout passwordPanelLayout = new javax.swing.GroupLayout(passwordPanel);
                    passwordPanel.setLayout(passwordPanelLayout);
                    passwordPanelLayout.setHorizontalGroup(
                        passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(passwordPanelLayout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(userPaswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addGap(5, 5, 5))
                    );
                    passwordPanelLayout.setVerticalGroup(
                        passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, passwordPanelLayout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(userPaswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addGap(5, 5, 5))
                    );

                    userNamePanel.setPreferredSize(new java.awt.Dimension(157, 37));

                    userNameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
                    userNameField.setBackground(new Color(0,0,0,0));
                    userNameField.setBorder(null);
                    userNameField.setPreferredSize(new java.awt.Dimension(50, 20));
                    userNameField.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                            userNameFieldKeyReleased(evt);
                        }
                    });

                    javax.swing.GroupLayout userNamePanelLayout = new javax.swing.GroupLayout(userNamePanel);
                    userNamePanel.setLayout(userNamePanelLayout);
                    userNamePanelLayout.setHorizontalGroup(
                        userNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(userNamePanelLayout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(userNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addGap(5, 5, 5))
                    );
                    userNamePanelLayout.setVerticalGroup(
                        userNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(userNamePanelLayout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(userNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addGap(5, 5, 5))
                    );

                    userNameLable.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
                    userNameLable.setForeground(new java.awt.Color(255, 255, 255));
                    userNameLable.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                    userNameLable.setText("Kullanıcı Adı");

                    passwordLable.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
                    passwordLable.setForeground(new java.awt.Color(255, 255, 255));
                    passwordLable.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                    passwordLable.setText("Şifre");

                    infolabel.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
                    infolabel.setForeground(java.awt.Color.black);
                    infolabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    infolabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

                    loginButton.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
                    loginButton.setForeground(new java.awt.Color(255, 255, 255));
                    loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/giris.png"))); // NOI18N
                    loginButton.setText("Giriş");
                    loginButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                    loginButton.setBorderPainted(false);
                    loginButton.setFocusPainted(false);
                    loginButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    loginButton.setRolloverEnabled(false);
                    loginButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/girisClick.png"))); // NOI18N
                    loginButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            loginButtonActionPerformed(evt);
                        }
                    });

                    closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cikis.png"))); // NOI18N
                    closeButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                    closeButton.setBorderPainted(false);
                    closeButton.setFocusPainted(false);
                    closeButton.setPreferredSize(new java.awt.Dimension(40, 40));
                    closeButton.setRolloverEnabled(false);
                    closeButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cikisClick.png"))); // NOI18N
                    closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            loginExit(evt);
                        }
                    });

                    javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
                    mainPanel.setLayout(mainPanelLayout);
                    mainPanelLayout.setHorizontalGroup(
                        mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                            .addContainerGap(61, Short.MAX_VALUE)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(passwordLable, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                        .addComponent(userNameLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(userNamePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(loginButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, Short.MAX_VALUE)
                                    .addComponent(infolabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGap(27, 27, 27)
                            .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                    );
                    mainPanelLayout.setVerticalGroup(
                        mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(userNameLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(userNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)))
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(passwordLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(passwordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(infolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                    );

                    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                    getContentPane().setLayout(layout);
                    layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    );
                    layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    );

                    pack();
                    setLocationRelativeTo(null);
                }// </editor-fold>//GEN-END:initComponents

    private void loginExit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginExit
        this.dispose();
        MainFrame.getInstance().dispose();
    }//GEN-LAST:event_loginExit

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
            userLogin();
    }//GEN-LAST:event_loginButtonActionPerformed

    private void userNameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userNameFieldKeyReleased
            enterKey(evt);
    }//GEN-LAST:event_userNameFieldKeyReleased

    private void userPaswordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userPaswordFieldKeyReleased
            enterKey(evt);
    }//GEN-LAST:event_userPaswordFieldKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel infolabel;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel passwordLable;
    private javax.swing.JPanel passwordPanel;
    private javax.swing.JTextField userNameField;
    private javax.swing.JLabel userNameLable;
    private javax.swing.JPanel userNamePanel;
    private javax.swing.JPasswordField userPaswordField;
    // End of variables declaration//GEN-END:variables

    private void enterKey(java.awt.event.KeyEvent evt) {
        infolabel.setText("");
        if (evt.getKeyCode() == 10) {
            userLogin();
        }
    }
    
    private void userLogin(){
        loginFormController.userEnter();
    }

    public JButton getCloseButton() {
        return closeButton;
    }

    public void setCloseButton(JButton closeButton) {
        this.closeButton = closeButton;
    }

    public JLabel getInfolabel() {
        return infolabel;
    }

    public void setInfolabel(JLabel infolabel) {
        this.infolabel = infolabel;
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(JButton loginButton) {
        this.loginButton = loginButton;
    }

    public JTextField getUserNameField() {
        return userNameField;
    }

    public void setUserNameField(JTextField userNameField) {
        this.userNameField = userNameField;
    }

    public JPasswordField getUserPaswordField() {
        return userPaswordField;
    }

    public void setUserPaswordField(JPasswordField userPaswordField) {
        this.userPaswordField = userPaswordField;
    } 
}