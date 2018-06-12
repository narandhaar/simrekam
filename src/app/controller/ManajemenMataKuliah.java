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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ran
 */
public final class ManajemenMataKuliah {

    private home_admin ha;
    private matakuliah mk;

    public ManajemenMataKuliah(home_admin home, matakuliah matakuliah) {
        this.ha = home;
        this.mk = matakuliah;

        ha.setVisible(true);
        ha.showCard("matakuliah");

        setMatakuliah();
        ha.simpanMk().addActionListener(new tambahMk());
        ha.masukTambakMk().addActionListener(new masukTambahMk());

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

    private class masukTambahMk implements ActionListener {

        public masukTambahMk() {
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
            String kode_matakuliah = ha.getKodeMk();
            String nama_matakuliah = ha.getNamaMk();
            String jenis_matakuliah = ha.getJenisMk().getSelectedItem().toString();
            String semester = ha.getSemester().getSelectedItem().toString();
            int jumlah_sks = Integer.parseInt(ha.getSemester().getSelectedItem().toString());

            if (kode_matakuliah.trim().isEmpty() || nama_matakuliah.trim().isEmpty()) {
                JOptionPane.showMessageDialog(ha, "Lengkapi data");
            } else {
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

}
