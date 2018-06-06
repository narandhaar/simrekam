/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller;

import app.model.dosen;
import app.model.md_login;
import app.view.home_admin;
import app.view.login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


/**
 *
 * @author ran
 */


public class ManajemenUser {
       private md_login lg;
       private login login;
       
     public ManajemenUser(){
       
     } 
      
     public ManajemenUser(login login, md_login lg){
         this.login=login;
         this.lg=lg;
         
         this.login.setVisible(true);
         
         this.login.getLogin(new loginListener());
     }
     
     public class loginListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int username = Integer.parseInt(login.getUsername());
                String password = login.getPassword();
                String level = lg.login(username, password);
                
                if(level.equalsIgnoreCase("admin")){
                    new ManajemenAdmin(new home_admin(), new dosen());
                    login.dispose();
                            
                } else if (level.equalsIgnoreCase("dosen")){
                    new ManajemenDosen();
                    login.dispose();
                } else {
                    JOptionPane.showMessageDialog(login, "Username atau Password Salah");
                } 
        }
         
     }
                
              
                
                
            }
        
    
    
    
    
    

