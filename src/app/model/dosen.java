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
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ran
 */
public class dosen {

    Connection conn;

    public dosen() {
        conn = new db().connect();

    }

    public boolean insertDosen(String namaDosen, String jabatan, int nip, String tanggalLahir) {
        String query = "INSERT INTO public.\"dataDosen\"(\n"
                + "	nip, nama_dosen, jabatan, \"tanggalLahir\")\n"
                + "	VALUES (?, ?, ?, ?::date);";

        boolean hasil = false;
        try {
            PreparedStatement st = conn.prepareStatement(query);
            st.setInt(1, nip);
            st.setString(2, namaDosen);
            st.setString(3, jabatan);
            st.setString(4, tanggalLahir);

            int insert = st.executeUpdate();

            if (insert > 0) {
                hasil = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            e.getMessage();
        }
        return hasil;
    }

//    public DefaultTableModel tabelDosen() {
//        String query = "SELECT nip, nama_dosen, jabatan, \"tanggalLahir\"\n"
//                + "	FROM public.\"dataDosen\";";
//        String namaKolom[] = {"NIP", "Nama Dosen", "Jabatan", "Tanggal Lahir"};
//        DefaultTableModel tabel = new DefaultTableModel(null, namaKolom);
//
//        try {
//            PreparedStatement st = conn.prepareStatement(query);
//            ResultSet rs = st.executeQuery();
//            while (rs.next()) {
//                Object data[] = new Object[4];
//
//                data[0] = rs.getInt(1);
//                data[1] = rs.getString(2);
//                data[2] = rs.getString(3);
//                data[3] = rs.getString(4);
//
//                tabel.addRow(data);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//            e.getMessage();
//        }
//
//        return tabel;
//    }

    public void updateData(String namaDosen, String jabatan, int nip, String tanggalLahir) throws SQLException {
        String sql = "UPDATE dataDosen SET (nama_dosen, jabatan, tanggalLahir) = (?,?,?)  WHERE nip= ?;";
        PreparedStatement st = conn.prepareStatement(sql);

        st.setString(1, namaDosen);
        st.setString(2, jabatan);
        st.setString(3, tanggalLahir);
        st.setInt(4, nip);

        st.executeUpdate();
    }

    public void hapusDosen(int nip) throws SQLException {
        String sql = "DELETE FROM public.\"dataDosen\"\n"
                + "	WHERE nip= ?;";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setInt(1, nip);
        st.executeUpdate();
        
    }

    public DefaultTableModel tabelDosen() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NIP");
        model.addColumn("Nama Dosen");
        model.addColumn("Jabatan");
        model.addColumn("Tanggal Lahir");
        try {
            String sql = "SELECT nip, nama_dosen, jabatan, \"tanggalLahir\"\n"
                    + "	FROM public.\"dataDosen\";";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            int no = 0;
            while (rs.next()) {
                no++;
                model.addRow(new Object[]{
                    rs.getInt("nip"), rs.getString("nama_dosen"), rs.getString("jabatan"), rs.getString("tanggalLahir")
                });
            }

        } catch (SQLException e) {
            e.getMessage();
        }
        return model;

    }
    
 

}
