/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller;

import app.model.matakuliah;
import app.view.home_admin;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ran
 */
public class ManajemenAdmin extends ManajemenUser {

    private home_admin ha;
    private app.model.dosen ds;
    private int nip;
    private String nama_dosen;
    private int jabatan;
    private String tanggalLahir;

    public ManajemenAdmin(home_admin home, app.model.dosen m_dosen) {
        this.ha = home;
        this.ds = m_dosen;
        ha.setVisible(true);
        ha.showCard("menu");

        ds = new app.model.dosen();

        ha.t_dosen().addActionListener(new menuDosen());

        ha.t_tambahDosen().addActionListener(new menuTambah());
        ha.getSimpanDosen().addActionListener(new simpanListener());
        ha.getUbahDosen().addActionListener(new ubahDosen());
        ha.tabelListener(new getTabel());
        ha.getKembaliDosen().addActionListener(new kembaliDosen());
        ha.dosenButton().addActionListener(new masukDosen());
        ha.hapusDosen().addActionListener(new hapusDosen());
        ha.confirmUbahDosen().addActionListener(new ubahDataDosen());
        ha.kembaliMenu().addActionListener(new kembaliMenu());
        ha.menuMatakuliah().addActionListener(new menuMatakuliah());
        comboBox();
        ha.jabatan_comboBox().addActionListener(new pilihJabatan());
        setDosen();
    }

    public final void setDosen() {
        DefaultTableModel model = new DefaultTableModel();
        Object[] columnsName = new Object[4];

        columnsName[0] = "NIP";
        columnsName[1] = "Nama Dosen";
        columnsName[2] = "Tanggal Lahir";
        columnsName[3] = "Jabatan";

        model.setColumnIdentifiers(columnsName);

        Object[] rowData = new Object[4];

        for (int i = 0; i < ds.getDosen().size(); i++) {
            rowData[0] = ds.getDosen().get(i).getNip();
            rowData[1] = ds.getDosen().get(i).getNama_dosen();
            rowData[2] = ds.getDosen().get(i).getTanggalLahir();
            rowData[3] = ds.getDosen().get(i).getNama_jabatan();

            model.addRow(rowData);
        }

        ha.tabelDosen().setModel(model);
    }

    public final void comboBox() {

        HashMap<String, Integer> map = ds.jabatanCombo();
        for (String s : map.keySet()) {
            ha.setJabatan(s);
            System.out.println(s);

        }
    }

    private class menuMatakuliah implements ActionListener {

        public menuMatakuliah() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            new ManajemenMataKuliah(new home_admin(), new matakuliah());
            ha.showCard("matakuliah");
        }
    }

    private class pilihJabatan implements ActionListener {

        public pilihJabatan() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            HashMap<String, Integer> map = ds.jabatanCombo();
            jabatan = map.get(ha.jabatan_comboBox().getSelectedItem().toString());
        }
    }

    private class masukDosen implements ActionListener {

        public masukDosen() {

        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            ha.setTabel(ha.tabelDosen(), ds.tabelDosen());
//            ha.showCard("dosen");
        }
    }

    private class kembaliMenu implements ActionListener {

        public kembaliMenu() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            ha.showCard("menu");
        }

    }

    private class ubahDataDosen implements ActionListener {

        public ubahDataDosen() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String namaDosen = ha.getNama();
            String tglLahir = ha.getTanggallhr();
            int nip = Integer.parseInt(ha.getNip());
            String password = ha.getPassword();

            try {
                ds.updateData(namaDosen, jabatan, nip, tglLahir);
                ds.updatePassword(password, nip);

                ha.showCard("dosen");
                setDosen();
                ha.tabelDosen().clearSelection();
                ha.tabelDosen().setEnabled(true);

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    private class menuDosen implements ActionListener {

        public menuDosen() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            ha.setTabel(ha.tabelDosen(), ds.tabelDosen());
            ha.tabelDosen().clearSelection();
            ha.tabelDosen().setEnabled(true);
            ha.showCard("dosen");

        }
    }

    private class menuTambah implements ActionListener {

        public menuTambah() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            ha.showCard("tb_dosen");
        }
    }

    private class hapusDosen implements ActionListener {

        public hapusDosen() {
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (ha.getBaris() < 0) {
                JOptionPane.showMessageDialog(ha, "Pilih data terlebih dahulu");
            } else {
                int pilih = JOptionPane.YES_NO_OPTION;
                JOptionPane.showConfirmDialog(null, "Apakah Anda yakin untuk menghapus data ini?", "Hapus", pilih);
                if (pilih == JOptionPane.YES_OPTION) {
                    try {
                        ds.hapusDosen(nip);
                        setDosen();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
//            ds.tabelDosen();
                ha.tabelDosen().clearSelection();
                ha.tabelDosen().setEnabled(true);
            }
        }
    }

    private class ubahDosen implements ActionListener {

        public ubahDosen() {
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (ha.getBaris() < 0) {
                JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu");
            } else {
                DefaultTableModel model = (DefaultTableModel) ha.tabelDosen().getModel();
                ha.setNip().setText(Integer.toString(nip));
                ha.setNip().setEditable(false);
                ha.setNama().setText(nama_dosen);
                int jabatan = ds.idJabatan(nip);
                ha.jabatan_comboBox().setSelectedIndex(jabatan - 1);
                String password = ds.getPassword(nip);
                ha.setPassword().setText(password);
                try {
                    Date date = new SimpleDateFormat("yyyy-MM-dd").parse(tanggalLahir);
                    ha.tanggalLahir().setDate(date);
                } catch (ParseException ex) {
                    Logger.getLogger(ManajemenAdmin.class.getName()).log(Level.SEVERE, null, ex);
                }
                ha.showCard("tb_dosen");
                ha.confirmUbahDosen().setVisible(true);
                ha.getSimpanDosen().setVisible(false);
                ha.getSimpanDosen().invalidate();
            }

        }
    }

    private class getTabel implements MouseListener {

        public getTabel() {
        }

        @Override
        public void mouseClicked(MouseEvent e) {

            DefaultTableModel model = (DefaultTableModel) ha.tabelDosen().getModel();
            ha.tabelDosen().setEnabled(false);
            nip = Integer.parseInt(model.getValueAt(ha.getBaris(), 0).toString());
            nama_dosen = model.getValueAt(ha.getBaris(), 1).toString();
            String getjabatan = model.getValueAt(ha.getBaris(), 3).toString();
            tanggalLahir = model.getValueAt(ha.getBaris(), 2).toString();

            System.out.println(nip);

            ha.tabelDosen().setEnabled(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }

    }

    private class kembaliDosen implements ActionListener {

        public kembaliDosen() {

        }

        @Override
        public void actionPerformed(ActionEvent e) {

            ha.showCard("dosen");

            DefaultTableModel model = (DefaultTableModel) ha.tabelDosen().getModel();
            ha.tabelDosen().clearSelection();
            ha.tabelDosen().setEnabled(true);
            ha.setNip().setEditable(true);
            clearTb();
        }
    }

    private class simpanListener implements ActionListener {

        public simpanListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            String namaDosen = ha.getNama();
//           String password = ha.getPassword();
            String tglLahir = ha.getTanggallhr();
            int nip = Integer.parseInt(ha.getNip());
            String password = ha.getPassword();
//           
            ds.insertDosen(namaDosen, jabatan + 1, nip, tglLahir, password);
//            ha.setTabel(ha.tabelDosen(), ds.tabelDosen());
            setDosen();
            ha.showCard("dosen");

//            System.out.println(namaDosen + jabatan + nip + tglLahir);
            if (namaDosen.trim().isEmpty() || tglLahir.trim().isEmpty() || ha.getNip().trim().isEmpty() || tanggalLahir.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Lengkapi data terlebih dahulu");
            } else {
                if (ds.insertDosen(namaDosen, jabatan, nip, tglLahir, password)) {
                    JOptionPane.showMessageDialog(ha, "Pendaftaran Berhasil");
                    setDosen();
                    ha.showCard("dosen");

                } else {
                    JOptionPane.showMessageDialog(ha, "Pendaftaran Gagal");
                }

            }
        }
    }

    public final void clearTb() {
        ha.setNip().setText("");
        ha.setNama().setText("");
        ha.tanggalLahir().setDate(null);
        ha.setPassword().setText("");
    }

}
