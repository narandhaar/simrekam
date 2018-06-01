/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller;

import app.view.home_admin;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

    private int selectedRow = 0;
    private int tampil;
    private String nama_dosen;
    private String jabatan;
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
        ha.dosenButton().addActionListener(new kembaliDosen());
        ha.hapusDosen().addActionListener(new hapusDosen());
        ha.confirmUbahDosen().addActionListener(new ubahDataDosen());
        ha.setTabel(ha.tabelDosen(), ds.tabelDosen());
    }

    private class ubahDataDosen implements ActionListener {

        public ubahDataDosen() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String namaDosen = ha.getNama();
            String tglLahir = ha.getTanggallhr();
            String jabatan = ha.getJabatan();
            int nip = Integer.parseInt(ha.getNip());
            
            try{
                ds.updateData(namaDosen, jabatan, nip, tanggalLahir);
                ha.setTabel(ha.tabelDosen(), ds.tabelDosen());
                ha.showCard("dosen");
                
            } catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }

    private class menuDosen implements ActionListener {

        public menuDosen() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            ha.setTabel(ha.tabelDosen(), ds.tabelDosen());
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
            try {
                ds.hapusDosen(tampil);
                ha.setTabel(ha.tabelDosen(), ds.tabelDosen());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private class ubahDosen implements ActionListener {

        public ubahDosen() {
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (tampil == 0) {
                JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu");
            } else {
                ha.setNip().setText(Integer.toString(tampil));
                ha.setNama().setText(nama_dosen);
                ha.jabatan().setText(jabatan);
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
            selectedRow = ha.getBaris();
            tampil = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
            nama_dosen = model.getValueAt(selectedRow, 1).toString();
            jabatan = model.getValueAt(selectedRow, 2).toString();
            tanggalLahir = model.getValueAt(selectedRow, 3).toString();

            System.out.println(tampil);
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
            String jabatan = ha.getJabatan();
            int nip = Integer.parseInt(ha.getNip());
//           String username = ha.getUsername();
//           
            System.out.println(namaDosen + jabatan + nip + tglLahir);

            if (ds.insertDosen(namaDosen, jabatan, nip, tglLahir)) {
                JOptionPane.showMessageDialog(ha, "Pendaftaran Berhasil");
                ha.setTabel(ha.tabelDosen(), ds.tabelDosen());
                ha.showCard("dosen");

            } else {
                JOptionPane.showMessageDialog(ha, "Pendaftaran Gagal");
            }

        }
    }

    private int ambilNIP() {
        return tampil;
    }

   

}
