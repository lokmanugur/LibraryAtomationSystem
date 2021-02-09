/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ugurtech.library.controller;

import com.ugurtech.library.model.CurrentUserModel;
import com.ugurtech.library.view.LoginForm;
import com.ugurtech.library.view.MainFrame;
import com.ugurtech.library.dao.UserDaoImpl;


/**
 *
 * @author ugur
 * 
 */
public class LoginFormController{
    
    private final LoginForm loginForm;
    private final UserDaoImpl userDao;
    private final CurrentUserModel sysUser;
    
    public LoginFormController(LoginForm loginForm){
        sysUser = CurrentUserModel.getInstance();
        userDao = new UserDaoImpl();
        this.loginForm=loginForm;
    }
    
    public void userEnter() {
        sysUser.setUserName(loginForm.getUserNameField().getText());
        sysUser.setUserPassword(String.valueOf(loginForm.getUserPaswordField().getPassword()));
        if(userDao.checkUser(sysUser)){
            loginForm.getInfolabel().setText("");
            MainFrame.getInstance().getUserLabel().setText(sysUser.getFirstName()+" "+sysUser.getLastName());
            MainFrame.getInstance().setVisible(true);
            loginForm.setVisible(false);
            loginForm.getUserNameField().setText("");
            loginForm.getUserPaswordField().setText("");
        } else {
            loginForm.getInfolabel().setText("Yanliş Kulanici veya Şifre");
        }
    }
}
