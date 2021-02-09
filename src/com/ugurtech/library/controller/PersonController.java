/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ugurtech.library.controller;

import com.ugurtech.library.dao.PersonDao;
import com.ugurtech.library.dao.PersonDaoImpl;
import com.ugurtech.library.generalclasses.UserInfoMessages;
import com.ugurtech.library.model.PersonModel;
import com.ugurtech.library.view.person.PersonForm;
import java.sql.Date;

/**
 *
 * @author ugur
 */
public class PersonController {
    private final PersonModel personModel;
    private final PersonDao personDao;
    private final PersonForm personForm;
    
    public PersonController(PersonForm personForm) {
        personModel = new PersonModel();
        personDao = new PersonDaoImpl();
        this.personForm=personForm;
    }

    public void insertPerson() {
        personModel.setFirstName(personForm.getFirstNameTextField().getText());
        personModel.setLastName(personForm.getLastNameTextField().getText());
        personModel.setBirthDate(personForm.getBirthDateChooser().getDate()==null?null:new Date(personForm.getBirthDateChooser().getDate().getTime()));
        personModel.setPhone(personForm.getPhoneTextField().getText());
        personModel.setAddress(personForm.getAddressTextArea().getText());
        if(checkField()){
            personDao.insertPerson(personModel);
            personForm.clearAllForm();
        }else{UserInfoMessages.getInstance().showInfoMessages("Lütfen Ad,Soyad,Telefon ve Adres Alanlarını Boş Bırakmayın.");}
    }
    
    public boolean checkField(){
        return  !"".equals(personModel.getFirstName())&&
                !"".equals(personModel.getLastName())&&
                !"".equals(personModel.getAddress())&&
                !"".equals(personModel.getPhone());
    }
}
