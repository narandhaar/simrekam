/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.model;

import app.controller.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ran
 */
public class md_login {
    private Connection koneksi;

    public md_login(){
        koneksi = new db().connect();
    }
    
    public String login(int username, String password){
        String query = "SELECT level FROM public.user WHERE username=? AND password=?;";
        String level= "kosong";
        try {
            PreparedStatement st = koneksi.prepareStatement(query);
            st.setInt(1, username);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                level = rs.getString("level");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            e.getMessage();
        }
        return level;
    }
    
//        String usr_adm = "admin";
//        String pass_adm = "admin";
//        String usr_ds = "dosen";
//        String pass_ds = "dosen";
//        String usr_mhs = "mahasiswa";
//        String pass_mhs = "mahasiswa";
//        
//    public String getUsr_adm() {
//        return usr_adm;
//    }
//
//    public String getPass_adm() {
//        return pass_adm;
//    }
//
//    public String getUsr_ds() {
//        return usr_ds;
//    }
//
//    public String getPass_ds() {
//        return pass_ds;
//    }
//
//    public String getUsr_mhs() {
//        return usr_mhs;
//    }
//
//    public String getPass_mhs() {
//        return pass_mhs;
//    }
//        
        
}
