/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ugurtech.library;

import com.ugurtech.library.view.LoginForm;
import javax.swing.JOptionPane;

/**
 *
 * @author ugur
 */
public class StartApplication {
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog( null,ex.getMessage(), "Application Start Error", JOptionPane.ERROR_MESSAGE );
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            LoginForm.getInstance().setVisible(true);
        });
    }
}
