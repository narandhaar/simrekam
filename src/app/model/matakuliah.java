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
                + "	FROM public.matakuliah;";

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
        String query = "INSERT INTO public.matakuliah(\n"
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

    public void updateData(String kodeMatakuliah, String namaMatakuliah, String jenisMatakuliah, String semester, int jumlahSks) throws SQLException {
        String sql = "UPDATE public.matakuliah\n"
                + "	SET nama_matakuliah=?, jenis_matakuliah=?, semester=?, jumlah_sks=?\n"
                + "	WHERE kode_matakuliah=?";
        PreparedStatement st = conn.prepareStatement(sql);

        st.setString(1, namaMatakuliah);
        st.setString(2, jenisMatakuliah);
        st.setString(3, semester);
        st.setInt(4, jumlahSks);
        st.setString(5, kodeMatakuliah);

        st.executeUpdate();
    }

    public void hapusMatakuliah(String kode_matakuliah) throws SQLException {
        String sql = "DELETE FROM public.matakuliah\n"
                + "	WHERE kode_matakuliah=?;";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, kode_matakuliah);
        st.executeUpdate();
        
    }
}
