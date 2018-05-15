package app.view;

import app.controller.ManajemenDosen;
import java.awt.CardLayout;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ran
 */
public class home_mahasiswa extends javax.swing.JFrame {

    /**
     * Creates new form home_admin
     */
    private ManajemenDosen ctrl_adm;
    
    public home_mahasiswa() {
        initComponents();

        
       
        mainPanel.add("menu",menu);
        mainPanel.add("jadwal",jadwal);
        
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel,"menu");
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jadwal = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        hapusDosen3 = new javax.swing.JButton();
        t_tambahMhs1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        t_tambahMhs2 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        menu = new javax.swing.JPanel();
        t_krs = new javax.swing.JButton();
        t_jadwal = new javax.swing.JButton();
        t_presensi = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        panelAtas = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setPreferredSize(new java.awt.Dimension(1366, 618));
        mainPanel.setLayout(new java.awt.CardLayout());

        jadwal.setPreferredSize(new java.awt.Dimension(1081, 618));
        jadwal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Hari", "Jam Mulai", "Jam Selesai", "Kode Matakuliah", "Nama Matakuliah", "Dosen", "Kelas", "Ruang"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jadwal.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 1280, 90));

        hapusDosen3.setText("Hapus");
        hapusDosen3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusDosen3ActionPerformed(evt);
            }
        });
        jadwal.add(hapusDosen3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 280, -1, -1));

        t_tambahMhs1.setText("Ubah");
        t_tambahMhs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_tambahMhs1ActionPerformed(evt);
            }
        });
        jadwal.add(t_tambahMhs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 280, -1, -1));

        jButton4.setText("Lihat presensi");
        jadwal.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 280, -1, -1));

        t_tambahMhs2.setText("Tambah");
        t_tambahMhs2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_tambahMhs2ActionPerformed(evt);
            }
        });
        jadwal.add(t_tambahMhs2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 280, -1, -1));

        jButton11.setText("Kembali");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jadwal.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        mainPanel.add(jadwal, "card7");

        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t_krs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/menu_jadwal.png"))); // NOI18N
        t_krs.setBorder(null);
        t_krs.setBorderPainted(false);
        t_krs.setContentAreaFilled(false);
        t_krs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_krsActionPerformed(evt);
            }
        });
        menu.add(t_krs, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, -1, -1));

        t_jadwal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/menu_jadwal.png"))); // NOI18N
        t_jadwal.setBorder(null);
        t_jadwal.setBorderPainted(false);
        t_jadwal.setContentAreaFilled(false);
        t_jadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_jadwalActionPerformed(evt);
            }
        });
        menu.add(t_jadwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, -1, -1));

        t_presensi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/menu_jadwal.png"))); // NOI18N
        t_presensi.setBorder(null);
        t_presensi.setBorderPainted(false);
        t_presensi.setContentAreaFilled(false);
        t_presensi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_presensiActionPerformed(evt);
            }
        });
        menu.add(t_presensi, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 220, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        menu.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 620));

        mainPanel.add(menu, "card3");

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1366, 618));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/panelAtas.png"))); // NOI18N

        javax.swing.GroupLayout panelAtasLayout = new javax.swing.GroupLayout(panelAtas);
        panelAtas.setLayout(panelAtasLayout);
        panelAtasLayout.setHorizontalGroup(
            panelAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelAtasLayout.setVerticalGroup(
            panelAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAtasLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        getContentPane().add(panelAtas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_jadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_jadwalActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel,"matakuliah");
    }//GEN-LAST:event_t_jadwalActionPerformed

    private void t_presensiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_presensiActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel,"jadwal");
    }//GEN-LAST:event_t_presensiActionPerformed

    private void t_krsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_krsActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel,"dosen");
    }//GEN-LAST:event_t_krsActionPerformed

    private void hapusDosen3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusDosen3ActionPerformed

    }//GEN-LAST:event_hapusDosen3ActionPerformed

    private void t_tambahMhs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_tambahMhs1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_tambahMhs1ActionPerformed

    private void t_tambahMhs2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_tambahMhs2ActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel,"tb_jadwal");
    }//GEN-LAST:event_t_tambahMhs2ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel,"menu");
    }//GEN-LAST:event_jButton11ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(home_mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home_mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home_mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home_mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home_mahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hapusDosen3;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable4;
    private javax.swing.JPanel jadwal;
    public javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel panelAtas;
    private javax.swing.JButton t_jadwal;
    private javax.swing.JButton t_krs;
    private javax.swing.JButton t_presensi;
    private javax.swing.JButton t_tambahMhs1;
    private javax.swing.JButton t_tambahMhs2;
    // End of variables declaration//GEN-END:variables
}
