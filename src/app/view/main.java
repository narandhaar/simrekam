/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.adm
 */
package app.view;

import app.controller.ManajemenDosen;
import app.controller.ManajemenUser;
import app.controller.db;
import app.model.md_login;

/**
 *
 * @author ran
 */
public class main {
    public static void main(String [] args){
//        home_admin adm = new home_admin();
//        adm.setVisible(true);

//            login lg = new login();
//            lg.setVisible(true);

       new ManajemenUser (new login(), new md_login());
    }
    
}
