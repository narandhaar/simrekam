/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller;

import app.model.matakuliah;
import app.view.home_admin;
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
public final class ManajemenMataKuliah extends ManajemenMenu{

    private home_admin ha;
    private matakuliah mk;

    String kode_matakuliah;
    String nama_matakuliah;
    String jenis_matakuliah;
    String semester;
    int jumlah_sks;

    public ManajemenMataKuliah(home_admin home, matakuliah matakuliah) {
        super(home);
        
        this.ha = home;
        this.mk = matakuliah;
        ha.showCard("matakuliah");
        
        setMatakuliah();
        ha.simpan_tbMk().addActionListener(new tambahMk());
        ha.t_TambahMk().addActionListener(new formTambahMk());
        ha.t_ubahMk().addActionListener(new formUbahMk());
        ha.tabelMatakuliah().addMouseListener(new getData());
        ha.t_ubahMk().addActionListener(new t_ubah());
        ha.simpan_ubahMk().addActionListener(new confirmUbahMk());
        ha.t_batalMk().addActionListener(new batal());
        ha.t_kembaliMk().addActionListener(new menuUtama());
        ha.t_hapusMk().addActionListener(new hapusData());

    }

    


    private static class menuMatakuliah implements ActionListener {

        public menuMatakuliah() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public void setMatakuliah() {
        DefaultTableModel model = new DefaultTableModel();
        Object[] columnsName = new Object[5];

        columnsName[0] = "Kode Matakuliah";
        columnsName[1] = "Nama Matakuliah";
        columnsName[2] = "Jenis Matakuliah";
        columnsName[3] = "Semester";
        columnsName[4] = "Jumlah SKS";

        model.setColumnIdentifiers(columnsName);

        Object[] rowData = new Object[5];

        for (int i = 0; i < mk.getMatakuliah().size(); i++) {
            rowData[0] = mk.getMatakuliah().get(i).getKode_matakuliah();
            rowData[1] = mk.getMatakuliah().get(i).getNama_matakuliah();
            rowData[2] = mk.getMatakuliah().get(i).getJenis_matkuliah();
            rowData[3] = mk.getMatakuliah().get(i).getSemester();
            rowData[4] = mk.getMatakuliah().get(i).getJumlahSks();

            System.out.println(rowData[0]);

            model.addRow(rowData);
        }
        ha.tabelMatakuliah().setModel(model);
    }

    private class hapusData implements ActionListener {

        public hapusData() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
           if (ha.tabelMatakuliah().getSelectedRow() < 0) {
                JOptionPane.showMessageDialog(ha, "Pilih data terlebih dahulu");
            } else {
                int tombol = JOptionPane.YES_NO_OPTION;
                int pilih = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin untuk menghapus data ini?", "Hapus", tombol);
                if (pilih == JOptionPane.YES_OPTION) {
                  
                    try {
                        mk.hapusMatakuliah(kode_matakuliah);
                    } catch (SQLException ex) {
                        ex.getMessage();
                    }
                        setMatakuliah();
                } else if (pilih == JOptionPane.NO_OPTION){
                    ha.showCard("matakuliah");
                }
//            ds.tabelDosen();
                ha.tabelDosen().clearSelection();
                ha.tabelDosen().setEnabled(true);
        }
    }
    }

    private class menuUtama implements ActionListener {

        public menuUtama() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            new ManajemenMenu(ha);
        }
    }

    private class batal implements ActionListener {

        public batal() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            ha.showCard("matakuliah");
            setMatakuliah();
        }
    }

 
    private class confirmUbahMk implements ActionListener {

        public confirmUbahMk() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            nama_matakuliah = ha.getNamaMk();
            jenis_matakuliah = ha.jenisMk().getSelectedItem().toString();
            semester = ha.semester().getSelectedItem().toString();
            jumlah_sks = Integer.parseInt(ha.jumlahsks().getSelectedItem().toString());

            try {
                int button = JOptionPane.YES_NO_OPTION;
                int pilih = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin untuk mengubah data ini?", "Ubah", button);
                if (pilih == JOptionPane.YES_OPTION) {

                    mk.updateData(kode_matakuliah, nama_matakuliah, jenis_matakuliah, semester, jumlah_sks);

                    JOptionPane.showMessageDialog(ha, "Data berhasil diubah");

                    ha.showCard("matakuliah");
                    setMatakuliah();
                    ha.tabelMatakuliah().clearSelection();
                    clearAll();
                } else if (pilih == JOptionPane.NO_OPTION) {
                    ha.showCard("tb_matakuliah");
                }

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    private class t_ubah implements ActionListener {

        public t_ubah() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (ha.tabelMatakuliah().getSelectedRow() < 0) {
                JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu");
            } else {
                DefaultTableModel model = (DefaultTableModel) ha.tabelDosen().getModel();
                ha.kodeMatakuliah().setText(kode_matakuliah);
                ha.kodeMatakuliah().setEditable(false);
                ha.namaMatakuliah().setText(nama_matakuliah);
                ha.jenisMk().setSelectedItem(jenis_matakuliah);
                ha.semester().setSelectedItem(semester);
                ha.jumlahsks().setSelectedItem(String.valueOf(jumlah_sks));

                ha.showCard("tb_matakuliah");
                ha.simpan_ubahMk().setVisible(true);
                ha.simpan_tbMk().setVisible(false);
                ha.simpan_tbMk().invalidate();

            }
        }
    }

    private class getData implements MouseListener {

        public getData() {
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            DefaultTableModel model = (DefaultTableModel) ha.tabelMatakuliah().getModel();
            kode_matakuliah = model.getValueAt(ha.tabelMatakuliah().getSelectedRow(), 0).toString();
            nama_matakuliah = model.getValueAt(ha.tabelMatakuliah().getSelectedRow(), 1).toString();
            jenis_matakuliah = model.getValueAt(ha.tabelMatakuliah().getSelectedRow(), 2).toString();
            semester = model.getValueAt(ha.tabelMatakuliah().getSelectedRow(), 3).toString();
            jumlah_sks = Integer.parseInt(model.getValueAt(ha.tabelMatakuliah().getSelectedRow(), 4).toString());

            System.out.println(kode_matakuliah);

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

    private class formUbahMk implements ActionListener {

        public formUbahMk() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    private class formTambahMk implements ActionListener {

        public formTambahMk() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            ha.showCard("tb_matakuliah");
        }
    }

    private class tambahMk implements ActionListener {

        public tambahMk() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            ha.simpan_tbMk().setVisible(true);
            ha.simpan_ubahMk().setVisible(false);
            ha.simpan_ubahMk().invalidate();

            String kode_matakuliah = ha.getKodeMk();
            String nama_matakuliah = ha.getNamaMk();

            if (kode_matakuliah.trim().isEmpty() || nama_matakuliah.trim().isEmpty() || ha.jenisMk().getSelectedIndex() == -1 || ha.semester().getSelectedIndex() == -1 || ha.jumlahsks().getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(ha, "Lengkapi data");
            } else {
                jenis_matakuliah = ha.jenisMk().getSelectedItem().toString();
                semester = ha.semester().getSelectedItem().toString();
                jumlah_sks = Integer.parseInt(ha.jumlahsks().getSelectedItem().toString());

                if (mk.insertMatakuliah(kode_matakuliah, nama_matakuliah, jenis_matakuliah, semester, jumlah_sks)) {
                    JOptionPane.showMessageDialog(ha, "Data berhasil ditambahkan");

                    ha.showCard("matakuliah");
                    setMatakuliah();

                } else {
                    JOptionPane.showMessageDialog(ha, "Data gagal ditambahkan");
                }
            }
        }
    }

    public void clearAll() {
        kode_matakuliah = "";
        nama_matakuliah = "";
        jenis_matakuliah = "";
        semester = "";
        jumlah_sks = 0;

        ha.kodeMatakuliah().setText(kode_matakuliah);
        ha.namaMatakuliah().setText(nama_matakuliah);
        ha.jenisMk().setSelectedIndex(-1);
        ha.semester().setSelectedIndex(-1);
        ha.jumlahsks().setSelectedIndex(-1);

    }

}
