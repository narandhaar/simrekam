/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller;

import app.model.md_login;
import app.view.login;


/**
 *
 * @author ran
 */


public class ManajemenUser {
    private login lg; 
    private md_login usr;
    String status="";
    
    public ManajemenUser(login lg){
        this.lg = lg;
    }
    
    public void cekLogin(){       
        String usr_adm = "admin";
        String pass_adm = "admin";
        String usr_ds = "dosen";
        String pass_ds = "dosen";
        String usr_mhs = "mahasiswa";
        String pass_mhs = "mahasiswa";
        
        if(lg.getUsername().equalsIgnoreCase(usr_adm) && lg.getPassword().equalsIgnoreCase(pass_adm)){
            status = "adm";
        } else if (lg.getUsername().equalsIgnoreCase(usr_ds) && lg.getPassword().equalsIgnoreCase(pass_ds)){
            status = "dsn";
        } else if (lg.getUsername().equalsIgnoreCase(usr_mhs) && lg.getPassword().equalsIgnoreCase(pass_mhs)){
            status = "usr";
        }
        
    }

    public String getStatus() {
        return status;
    }
    
    
    
}
