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
public class home_admin extends javax.swing.JFrame {

    /**
     * Creates new form home_admin
     */
    private ManajemenDosen ctrl_adm;
    
    public home_admin() {
        initComponents();
        ctrl_adm = new ManajemenDosen(this);
        
       
        mainPanel.add("menu",menu);
        mainPanel.add("dosen",dosen);
        mainPanel.add("tb_dosen",tb_dosen);
        mainPanel.add("matakuliah",matakuliah);
        mainPanel.add("tb_matakuliah",tb_matakuliah);
        mainPanel.add("jadwal",jadwal);
        mainPanel.add("tb_jadwal",tb_jadwal);
        mainPanel.add("dosen",dosen);
        
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel,"menu");
        
    }
    
    
    public String getNip(){
        return nip.getText();
    }
    
    public String getNama(){
        return namaDosen.getText();
    }
    
    public String getJabatan(){
        return jabatan.getText();
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
        dosen = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        hapusDosen = new javax.swing.JButton();
        t_tambahDosen = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        tb_dosen = new javax.swing.JPanel();
        nip = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        namaDosen = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jabatan = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        simpanDosen = new javax.swing.JButton();
        jadwal = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        hapusDosen3 = new javax.swing.JButton();
        t_tambahMhs1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        t_tambahMhs2 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        tb_jadwal = new javax.swing.JPanel();
        jTextField16 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jTextField15 = new javax.swing.JTextField();
        jComboBox7 = new javax.swing.JComboBox<>();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        matakuliah = new javax.swing.JPanel();
        jTextField13 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton10 = new javax.swing.JButton();
        hapusDosen2 = new javax.swing.JButton();
        t_tambahMk = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        tb_matakuliah = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        menu = new javax.swing.JPanel();
        t_dosen = new javax.swing.JButton();
        t_matakuliah = new javax.swing.JButton();
        t_jadwal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panelAtas = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setLayout(new java.awt.CardLayout());

        dosen.setMaximumSize(new java.awt.Dimension(1081, 618));
        dosen.setMinimumSize(new java.awt.Dimension(1081, 618));
        dosen.setPreferredSize(new java.awt.Dimension(1081, 618));
        dosen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setText("Cari ...");
        dosen.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 280, 30));

        jLabel4.setText("Filter");
        dosen.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NIP", "Item 2", "Item 3", "Item 4" }));
        dosen.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 90, 30));

        jButton1.setText("Cari");
        dosen.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 70, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "NIP", "Nama", "Tanggal Lahir", "Jabatan", "Username", "Password"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        dosen.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 1220, 80));

        hapusDosen.setText("Hapus");
        hapusDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusDosenActionPerformed(evt);
            }
        });
        dosen.add(hapusDosen, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 350, -1, -1));

        t_tambahDosen.setText("Tambah");
        t_tambahDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_tambahDosenActionPerformed(evt);
            }
        });
        dosen.add(t_tambahDosen, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 350, -1, -1));

        jButton5.setText("Kembali");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        dosen.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        mainPanel.add(dosen, "card3");

        tb_dosen.setPreferredSize(new java.awt.Dimension(1081, 618));
        tb_dosen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        tb_dosen.add(nip, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 320, 30));

        jLabel5.setText("NIP");
        tb_dosen.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        jLabel6.setText("Nama");
        tb_dosen.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));
        tb_dosen.add(namaDosen, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 320, 30));

        jLabel7.setText("Tanggal Lahir");
        tb_dosen.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        jLabel8.setText("Jabatan");
        tb_dosen.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));
        tb_dosen.add(jabatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 320, 30));
        tb_dosen.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 320, 30));

        jLabel9.setText("Password");
        tb_dosen.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, -1));

        jButton2.setText("Kembali");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        tb_dosen.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, -1, -1));

        simpanDosen.setText("Simpan");
        simpanDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanDosenActionPerformed(evt);
            }
        });
        tb_dosen.add(simpanDosen, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, -1, -1));

        mainPanel.add(tb_dosen, "card4");

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

        tb_jadwal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        tb_jadwal.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 290, 34));

        jLabel23.setText("Jam Mulai                    :");
        tb_jadwal.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        jLabel10.setText("Hari                             :");
        tb_jadwal.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        jLabel11.setText("Jam Mulai                    :");
        tb_jadwal.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));
        tb_jadwal.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 290, 34));

        jLabel18.setText("Matakuliah                 :");
        tb_jadwal.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 180, -1));

        jLabel19.setText("Dosen                        :");
        tb_jadwal.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 197, -1));

        jLabel21.setText("Ruang                        :");
        tb_jadwal.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 175, -1));

        jLabel22.setText("Kelas                         :");
        tb_jadwal.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 166, -1));

        jButton3.setText("Batal");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        tb_jadwal.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, -1, -1));

        jButton9.setText("Simpan");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        tb_jadwal.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, -1, -1));
        tb_jadwal.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 88, 290, 34));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pemrograman Berorientasi Obyek 2", "Item 2", "Item 3", "Item 4" }));
        tb_jadwal.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 290, 40));
        tb_jadwal.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 290, 34));
        tb_jadwal.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 290, 34));
        tb_jadwal.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 290, 34));

        mainPanel.add(tb_jadwal, "card9");

        matakuliah.setPreferredSize(new java.awt.Dimension(1081, 618));
        matakuliah.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField13.setText("Cari ...");
        matakuliah.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 280, 30));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No", "Kode Matakuliah", "Nama Matakuliah", "Jenis Matakuliah", "Jumlah SKS", "Semester"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        matakuliah.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 1280, 80));

        jLabel20.setText("Filter");
        matakuliah.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kode Matakuliah", "Item 2", "Item 3", "Item 4" }));
        matakuliah.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 160, 30));

        jButton10.setText("Cari");
        matakuliah.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 70, 30));

        hapusDosen2.setText("Hapus");
        hapusDosen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusDosen2ActionPerformed(evt);
            }
        });
        matakuliah.add(hapusDosen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 310, -1, -1));

        t_tambahMk.setText("Tambah");
        t_tambahMk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_tambahMkActionPerformed(evt);
            }
        });
        matakuliah.add(t_tambahMk, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 310, -1, -1));

        jButton12.setText("Kembali");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        matakuliah.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        mainPanel.add(matakuliah, "card3");

        tb_matakuliah.setPreferredSize(new java.awt.Dimension(1081, 618));
        tb_matakuliah.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setText("Kode Matakuliah        :");
        tb_matakuliah.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));
        tb_matakuliah.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 290, 34));
        tb_matakuliah.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 290, 34));

        jLabel26.setText("Nama Matakuliah       :");
        tb_matakuliah.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        jLabel28.setText("Semester                   :");
        tb_matakuliah.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, -1, -1));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fakultas", "Item 2", "Item 3", "Item 4" }));
        tb_matakuliah.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 290, 40));

        jLabel30.setText("Jenis Matakuliah        :");
        tb_matakuliah.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        jLabel31.setText("Jumlah SKS                 :");
        tb_matakuliah.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, -1, -1));
        tb_matakuliah.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 290, 34));
        tb_matakuliah.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 290, 34));

        jButton13.setText("Batal");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        tb_matakuliah.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, -1, -1));

        jButton14.setText("Simpan");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        tb_matakuliah.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, -1, -1));

        mainPanel.add(tb_matakuliah, "card3");

        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t_dosen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/menu_dosen.png"))); // NOI18N
        t_dosen.setBorder(null);
        t_dosen.setBorderPainted(false);
        t_dosen.setContentAreaFilled(false);
        t_dosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_dosenActionPerformed(evt);
            }
        });
        menu.add(t_dosen, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, -1, -1));

        t_matakuliah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/menu_matakuliah.png"))); // NOI18N
        t_matakuliah.setBorder(null);
        t_matakuliah.setBorderPainted(false);
        t_matakuliah.setContentAreaFilled(false);
        t_matakuliah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_matakuliahActionPerformed(evt);
            }
        });
        menu.add(t_matakuliah, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, -1, -1));

        t_jadwal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/menu_jadwal.png"))); // NOI18N
        t_jadwal.setBorder(null);
        t_jadwal.setBorderPainted(false);
        t_jadwal.setContentAreaFilled(false);
        t_jadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_jadwalActionPerformed(evt);
            }
        });
        menu.add(t_jadwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 220, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/panel.png"))); // NOI18N
        menu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 1080, -1));

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

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

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

    private void t_matakuliahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_matakuliahActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel,"matakuliah");
    }//GEN-LAST:event_t_matakuliahActionPerformed

    private void t_jadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_jadwalActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel,"jadwal");
    }//GEN-LAST:event_t_jadwalActionPerformed

    private void t_dosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_dosenActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel,"dosen");
    }//GEN-LAST:event_t_dosenActionPerformed

    private void hapusDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusDosenActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_hapusDosenActionPerformed

    private void t_tambahDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_tambahDosenActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel,"tb_dosen");
    }//GEN-LAST:event_t_tambahDosenActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel,"dosen");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void hapusDosen3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusDosen3ActionPerformed

    }//GEN-LAST:event_hapusDosen3ActionPerformed

    private void t_tambahMhs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_tambahMhs1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_tambahMhs1ActionPerformed

    private void t_tambahMhs2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_tambahMhs2ActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel,"tb_jadwal");
    }//GEN-LAST:event_t_tambahMhs2ActionPerformed

    private void hapusDosen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusDosen2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hapusDosen2ActionPerformed

    private void t_tambahMkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_tambahMkActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel,"tb_matakuliah");
    }//GEN-LAST:event_t_tambahMkActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel,"menu");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel,"menu");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel,"menu");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void simpanDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanDosenActionPerformed
        ctrl_adm.simpanDosen();
    }//GEN-LAST:event_simpanDosenActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel,"jadwal");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        cl.show(mainPanel,"matakuliah");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

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
            java.util.logging.Logger.getLogger(home_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel dosen;
    private javax.swing.JButton hapusDosen;
    private javax.swing.JButton hapusDosen2;
    private javax.swing.JButton hapusDosen3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jabatan;
    private javax.swing.JPanel jadwal;
    public javax.swing.JPanel mainPanel;
    private javax.swing.JPanel matakuliah;
    private javax.swing.JPanel menu;
    private javax.swing.JTextField namaDosen;
    private javax.swing.JTextField nip;
    private javax.swing.JPanel panelAtas;
    private javax.swing.JTextField password;
    private javax.swing.JButton simpanDosen;
    private javax.swing.JButton t_dosen;
    private javax.swing.JButton t_jadwal;
    private javax.swing.JButton t_matakuliah;
    private javax.swing.JButton t_tambahDosen;
    private javax.swing.JButton t_tambahMhs1;
    private javax.swing.JButton t_tambahMhs2;
    private javax.swing.JButton t_tambahMk;
    private javax.swing.JPanel tb_dosen;
    private javax.swing.JPanel tb_jadwal;
    private javax.swing.JPanel tb_matakuliah;
    // End of variables declaration//GEN-END:variables
}
