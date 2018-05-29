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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ran
 */
public class dosen {

    Connection conn;

    public dosen()

    {
        conn = new db().connect();
        
    }
    
    public boolean insertDosen(String namaDosen, String jabatan, String nip){
        String query = "INSERT INTO dosen(nip, nama_dosen, jabatan) VALUES( ?, ?, ?);";

        boolean hasil = false;
        try {
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, nip);
            st.setString(2, namaDosen);
            st.setString(3, jabatan);
//            st.setString(4, tglLahir);

            int insert = st.executeUpdate();
 
            if (insert > 0 ) {
                hasil = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            e.getMessage();
        }
        return hasil;
    }
    
    public DefaultTableModel bacaTabelDosen(){
        String query = "SELECT nip, nama_dosen, jabatan FROM dosen;";
        String namaKolom[] = {"NIP", "Nama Dosen", "Jabatan"};
        DefaultTableModel tabel = new DefaultTableModel(null, namaKolom);
        try {
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                Object data[] = new Object[3];
                
                data[0]=rs.getString(1);
                data[1]=rs.getString(2);
                data[2]=rs.getString(3);
                
                tabel.addRow(data);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            e.getMessage();
        }
        
        return tabel;
    }
    
}
