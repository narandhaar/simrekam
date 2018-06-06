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
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
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

    public boolean insertDosen(String namaDosen, int jabatan, int nip, String tanggalLahir, String password) {
        String query = "INSERT INTO public.\"dataDosen\"(\n"
                + "	nip, nama_dosen, \"tanggalLahir\", id_jabatan)\n"
                + "	VALUES (?, ?, ?::date, ?);";

        String query2 = "INSERT INTO public.\"user\"(\n"
                + "	username, password, level, id_user)\n"
                + "	VALUES (?, ?, ?, DEFAULT);";

        boolean hasil = false;
        String level = "dosen";

        try {
            PreparedStatement st = conn.prepareStatement(query);
            st.setInt(1, nip);
            st.setString(2, namaDosen);
            st.setString(3, tanggalLahir);
            st.setInt(4, jabatan);
            st.executeUpdate();

            PreparedStatement st2 = conn.prepareStatement(query2);
            st2.setInt(1, nip);
            st2.setString(2, password);
            st2.setString(3, level);

            st2.executeUpdate();

            hasil = true;

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
    public void updateData(String namaDosen, int jabatan, int nip, String tanggalLahir) throws SQLException {
        String sql = "UPDATE public.\"dataDosen\"\n"
                + "	SET nama_dosen=?, \"tanggalLahir\"=?::date, id_jabatan=?\n"
                + "	WHERE nip=?";
        PreparedStatement st = conn.prepareStatement(sql);

        st.setString(1, namaDosen);
        st.setString(2, tanggalLahir);
        st.setInt(3, jabatan);
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

//    public DefaultTableModel tabelDosen() {
//        DefaultTableModel model = new DefaultTableModel();
//        model.addColumn("NIP");
//        model.addColumn("Nama Dosen");
//        model.addColumn("Tanggal Lahir");
//        model.addColumn("Jabatan");
//        try {
//            String sql = "SELECT d.nip, d.nama_dosen, d.\"tanggalLahir\", j.nama_jabatan\n"
//                    + "	FROM public.\"dataDosen\" d JOIN public.\"jabatan\" j\n"
//                    + "	ON d.id_jabatan = j.id_jabatan;";
//            Statement st = conn.createStatement();
//            ResultSet rs = st.executeQuery(sql);
//            ResultSetMetaData rsmt = rs.getMetaData();
//            int c = rsmt.getColumnCount();
//            Vector column = new Vector(c);
//            for(int i=0; i<=c; i++){
//                column.add(rsmt.getColumnName(i));
//            }
//            Vector data = new Vector();
//            Vector row = new Vector();
//            
//            while (rs.next()) {
//                no++;
//                model.addRow(new Object[]{
//                    rs.getInt("d.nip"), rs.getString("d.nama_dosen"), rs.getString("d.\"tanggalLahir\""), rs.getString("j.nama_jabatan")
//                });
//            }
//
//        } catch (SQLException e) {
//            e.getMessage();
//        }
//        return model;
//
//    }
    public ArrayList<arrayList_dosen> getDosen() {
        ArrayList<arrayList_dosen> dosen = new ArrayList<arrayList_dosen>();
        Statement st;
        ResultSet rs;
        arrayList_dosen ad;

        try {
            String sql = "SELECT d.nip, d.nama_dosen, d.\"tanggalLahir\", j.nama_jabatan\n"
                    + "	FROM public.\"dataDosen\" d JOIN public.\"jabatan\" j\n"
                    + "	ON d.id_jabatan = j.id_jabatan;";
            st = conn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                ad = new arrayList_dosen(
                        rs.getInt("nip"),
                        rs.getString("nama_dosen"),
                        rs.getString("tanggalLahir"),
                        rs.getString("nama_jabatan")
                );

                dosen.add(ad);
            }
        } catch (SQLException ex) {
            Logger.getLogger(dosen.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dosen;
    }

    public HashMap<String, Integer> jabatanCombo() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        String sql = "SELECT id_jabatan, nama_jabatan\n"
                + "	FROM public.jabatan;";
        Statement st;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            combo_jabatan cj;

            while (rs.next()) {
                cj = new combo_jabatan(rs.getInt(1), rs.getString(2));
                map.put(cj.getJabatan(), cj.getId());
            }
        } catch (SQLException ex) {
            Logger.getLogger(dosen.class.getName()).log(Level.SEVERE, null, ex);
        }
        return map;
    }

//       public String[][] getJabatan() {
//        String sql = "SELECT id_jabatan, nama_jabatan\n"
//                + "	FROM public.jabatan;";
//        String jn[][] = null;
//        try {
//            PreparedStatement st = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
//            ResultSet rs = st.executeQuery();
//            rs.last();
//            jn = new String[2][rs.getRow()];
//            rs.beforeFirst();
//            int i = 0;
//            while (rs.next()) {
//                jn[0][i] = rs.getString("nama_jabatan");
//                jn[1][i] = rs.getString("id_jabatan");
//                i++;
//            }
//
//        } catch (SQLException ex) {
//            ex.getMessage();
//            ex.printStackTrace();
//        }
//        return jn;
//    }
    public int idJabatan(int nip) {
        int idJabatan = 0;

        try {
            String sql = "SELECT id_jabatan\n"
                    + "	FROM public.\"dataDosen\" \n"
                    + "	WHERE nip=?;";
            PreparedStatement st;
            st = conn.prepareStatement(sql);
            st.setInt(1, nip);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {;
                idJabatan = rs.getInt("id_jabatan");
            }
        } catch (SQLException ex) {
            Logger.getLogger(dosen.class.getName()).log(Level.SEVERE, null, ex);
        }

        return idJabatan;

    }

    public void updatePassword(String password, int nip) throws SQLException {
        String sql = "UPDATE public.\"user\"\n"
                + "	SET password=?\n"
                + "	WHERE nip=?;";
        PreparedStatement st = conn.prepareStatement(sql);

        st.setString(1, password);
        st.setInt(2, nip);

        st.executeUpdate();
    }

    public String getPassword(int nip) {
        String password = "kosong";

        try {
            String sql = "SELECT password\n"
                    + "	FROM public.\"user\" \n"
                    + "	WHERE username=?;";
            PreparedStatement st;
            st = conn.prepareStatement(sql);
            st.setInt(1, nip);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {;
               password = rs.getString("password");
            }
        } catch (SQLException ex) {
            Logger.getLogger(dosen.class.getName()).log(Level.SEVERE, null, ex);
        }
        return password;
    }
}
