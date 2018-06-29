/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller;

import app.model.dosen;
import app.model.matakuliah;
import app.view.home_admin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ran
 */
public class ManajemenMenu {
    private home_admin ha;
    private matakuliah mk;
    private dosen ds;
    
    public ManajemenMenu(home_admin home ){
        this.ha = home;
        
        ha.setVisible(true);
        ha.showCard("menu");
        
        ha.menuMk().addActionListener(new menuMk());
        ha.menuDosen().addActionListener(new menuDosen());
    }

    private class menuDosen implements ActionListener {

        public menuDosen() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            ds = new dosen();
            new ManajemenDosen(ha, ds);
        }
    }

    public class menuMk implements ActionListener {

        public menuMk() {
            
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            mk = new matakuliah();
           new ManajemenMataKuliah(ha, mk);
        }
    }
    
}
