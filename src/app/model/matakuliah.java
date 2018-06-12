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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ran
 */
public class matakuliah {

    Connection conn;

    public matakuliah() {
        conn = new db().connect();
    }

    public ArrayList<arrayList_matakuliah> getMatakuliah() {
        ArrayList<arrayList_matakuliah> matakuliah = new ArrayList<arrayList_matakuliah>();
        Statement st;
        ResultSet rs;
        arrayList_matakuliah mk;

        String sql = "SELECT kode_matakuliah, nama_matakuliah, jenis_matakuliah, semester, jumlah_sks\n"
                + "	FROM public.mata_kuliah;";

        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                mk = new arrayList_matakuliah(rs.getString("kode_matakuliah"),
                        rs.getString("nama_matakuliah"),
                        rs.getString("jenis_matakuliah"),
                        rs.getString("semester"),
                        rs.getInt("jumlah_sks"));

                matakuliah.add(mk);
            }

        } catch (SQLException ex) {
            Logger.getLogger(matakuliah.class.getName()).log(Level.SEVERE, null, ex);
        }

        return matakuliah;
    }

    public boolean insertMatakuliah(String kode_matakuliah, String nama_matakuliah, String jenis_matakuliah, String semester, int jumlah_sks) {
        String query = "INSERT INTO public.mata_kuliah(\n"
                + "	kode_matakuliah, nama_matakuliah, jenis_matakuliah, semester, id_matkul, jumlah_sks)\n"
                + "	VALUES (?, ?, ?, ?, DEFAULT, ?);";

        boolean hasil = false;

        try {
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, kode_matakuliah);
            st.setString(2, nama_matakuliah);
            st.setString(3, jenis_matakuliah);
            st.setString(4, semester);
            st.setInt(5, jumlah_sks);
            st.executeUpdate();

            hasil = true;

        } catch (SQLException ex) {
            Logger.getLogger(matakuliah.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        return hasil;
    }

}
