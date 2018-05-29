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
import javax.swing.JOptionPane;

/**
 *
 * @author ran
 */
public class ManajemenAdmin extends ManajemenUser {

    private home_admin ha;
    private app.model.dosen ds;

    public ManajemenAdmin() {
        ha = new home_admin();
        ha.setVisible(true);

        ds = new app.model.dosen();

        ha.getSimpanDosen().addActionListener(new simpanListener());
        bacaTabel();
        
        ha.getKembaliDosen().addActionListener(new refreshDosen());

    }

    private class refreshDosen implements ActionListener {

        public refreshDosen() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
          ha.setTabel(ds.bacaTabelDosen());
            CardLayout cl = (CardLayout)(ha.mainPanel.getLayout());
            cl.show(ha.mainPanel, "dosen");
        }
    }

    private class simpanListener implements ActionListener {

        public simpanListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String namaDosen = ha.getNama();
//           String password = ha.getPassword();
//           String tglLahir = ha.getTanggallhr();
            String jabatan = ha.getJabatan();
            String nip = ha.getNip();
//           String username = ha.getUsername();
//           
            System.out.println(namaDosen + jabatan + nip);

            if (ds.insertDosen(namaDosen, jabatan, nip)) {
                JOptionPane.showMessageDialog(ha, "Pendaftaran Berhasil");
            } else {
                JOptionPane.showMessageDialog(ha, "Pendaftaran Gagal");
            }

        }
    }

    private void bacaTabel() {
        ha.setTabel(ds.bacaTabelDosen());
    }

}
