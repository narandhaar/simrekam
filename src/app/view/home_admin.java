package app.view;

import com.toedter.calendar.JDateChooser;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

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
    public home_admin() {
        initComponents();

        CardLayout cl = (CardLayout) (mainPanel.getLayout());

        mainPanel.add("menu", menu);
        mainPanel.add("dosen", dosen);
        mainPanel.add("tb_dosen", tb_dosen);
        mainPanel.add("matakuliah", matakuliah);
        mainPanel.add("tb_matakuliah", tb_matakuliah);
        mainPanel.add("jadwal", jadwal);
        mainPanel.add("tb_jadwal", tb_jadwal);
        mainPanel.add("dosen", dosen);
        mainPanel.add("rk_dosen", rekapanDosen);
        mainPanel.add("rk_mahasiswa", rekapanMahasiswa);
        
//
//        comboBox();

    }

    public void showCard(String key) {
        CardLayout cl = (CardLayout) (mainPanel.getLayout());
        cl.show(mainPanel, key);
    }
//
//    public void comboBox() {
//
//        HashMap<String, Integer> map = ds.jabatanCombo();
//        for (String s : map.keySet()) {
//            jabatan_comboBox.addItem(s);
//            System.out.println(s);
//
//        }
//    }

    public void setJabatan(String jabatan) {
        jabatan_comboBox().addItem(jabatan);
    }

    public JComboBox jabatan_comboBox() {
        return jabatan_comboBox;
    }

    public JTextField setNip() {
        return nip;
    }

    public JTextField setNama() {
        return namaDosen;
    }

    public JDateChooser tanggalLahir() {
        return tglLahir;
    }

    public String getNip() {
        return nip.getText();
    }

    public String getNama() {
        return namaDosen.getText();
    }

    public String getPassword() {
        return password.getText();
    }

    public JTextField setPassword() {
        return password;
    }

    public JButton getSimpanDosen() {
        return simpanDosen;
    }

    public JButton getUbahDosen() {
        return ubah;
    }

    public int getBaris() {
        return tabelDosen.getSelectedRow();
    }

    public JButton confirmUbahDosen() {
        return ubahDosen;
    }

//    public int ambilID(int baris){
//        return Integer.parseInt(tabelDosen.getValueAt(baris, 0).toString());
//    }
//    
    public void setTabel(JTable t, DefaultTableModel tabel) {
        t.setModel(tabel);
    }

    public JButton menuDosen() {
        return t_dosen;
    }

    public JButton t_tambahDosen() {
        return t_tambahDosen;
    }

    public String getTanggallhr() {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        String tanggal = dateFormat.format(tglLahir.getDate());
        return tanggal;

    }

//    public void setTabel(DefaultTableModel t){
//        tabelDosen.setModel(t);
//    }
    public JButton getKembaliDosen() {
        return kembaliDosen;
    }

    public void tabelListener(MouseListener m) {
        tabelDosen.addMouseListener(m);
    }

    public void isiUsername(KeyListener k) {
        nip.addKeyListener(k);
    }

    public JButton hapusDosen() {
        return hapusDosen;
    }

    public JTable tabelDosen() {
        return tabelDosen;
    }

    public JButton t_dosen() {
        return t_dosen;
    }

    public JButton kembaliMenu() {
        return kembaliMenu;
    }

    //TAMBAH MATAKULIAH
    public JButton menuMatakuliah() {
        return t_matakuliah;
    }

    public JTable tabelMatakuliah() {
        return tabelMatakuliah;
    }

    public JButton simpan_tbMk() {
        return simpan_tbMk;
    }

    public String getKodeMk() {
        return txt_kode_matakuliah.getText();
    }

    public String getNamaMk() {
        return txt_nama_matakuliah.getText();
    }

    public JComboBox jenisMk() {
        return jenis_matakuliah;
    }

    public JComboBox semester() {
        return semester;
    }

    public JComboBox jumlahsks() {
        return jumlah_sks;
    }

    public JButton t_TambahMk() {
        return t_tambahMk;
    }

    public JButton t_ubahMk() {
        return t_ubah;
    }

    public JTextField kodeMatakuliah(){
        return txt_kode_matakuliah;
    }

    public JTextField namaMatakuliah() {
        return txt_nama_matakuliah;
    }
    
    public JButton simpan_ubahMk(){
        return simpan_ubahMk;
    }
    
    public JButton t_batalMk(){
        return t_batalMk;
    }
    
    public JButton t_kembaliMk(){
        return t_kembaliMk;
    }
    
    public JButton t_hapusMk(){
        return t_hapusMk;
    }
  
    public JButton menuMk(){
        return t_matakuliah;
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
        menu = new javax.swing.JPanel();
        t_dosen = new javax.swing.JButton();
        t_matakuliah = new javax.swing.JButton();
        t_rekapDosen = new javax.swing.JButton();
        t_rekapMahasiswa = new javax.swing.JButton();
        t_jadwal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        tb_dosen = new javax.swing.JPanel();
        nip = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        namaDosen = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tglLahir = new com.toedter.calendar.JDateChooser();
        kembaliDosen = new javax.swing.JButton();
        simpanDosen = new javax.swing.JButton();
        ubahDosen = new javax.swing.JButton();
        jabatan_comboBox = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jadwal = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        hapusDosen3 = new javax.swing.JButton();
        t_tambahMhs1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        t_tambahMhs2 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
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
        jLabel14 = new javax.swing.JLabel();
        matakuliah = new javax.swing.JPanel();
        jTextField13 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelMatakuliah = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton10 = new javax.swing.JButton();
        t_hapusMk = new javax.swing.JButton();
        t_tambahMk = new javax.swing.JButton();
        t_kembaliMk = new javax.swing.JButton();
        t_ubah = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        tb_matakuliah = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        txt_kode_matakuliah = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jumlah_sks = new javax.swing.JComboBox<>();
        semester = new javax.swing.JComboBox<>();
        jenis_matakuliah = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txt_nama_matakuliah = new javax.swing.JTextField();
        t_batalMk = new javax.swing.JButton();
        simpan_tbMk = new javax.swing.JButton();
        simpan_ubahMk = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        rekapanDosen = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        rekapanMahasiswa = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();
        biodata = new javax.swing.JPanel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel34 = new javax.swing.JLabel();
        namaDosen1 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        simpanDosen1 = new javax.swing.JButton();
        dosen = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        hapusDosen = new javax.swing.JButton();
        t_tambahDosen = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        kembaliMenu = new javax.swing.JButton();
        bgTable = new javax.swing.JScrollPane();
        tabelDosen = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        panelAtas = new javax.swing.JPanel();
        jButton16 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setPreferredSize(new java.awt.Dimension(1355, 615));
        mainPanel.setLayout(new java.awt.CardLayout());

        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t_dosen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/dsn.png"))); // NOI18N
        t_dosen.setBorder(null);
        t_dosen.setBorderPainted(false);
        t_dosen.setContentAreaFilled(false);
        t_dosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_dosenActionPerformed(evt);
            }
        });
        menu.add(t_dosen, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, -1));

        t_matakuliah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/matkul.png"))); // NOI18N
        t_matakuliah.setBorder(null);
        t_matakuliah.setBorderPainted(false);
        t_matakuliah.setContentAreaFilled(false);
        menu.add(t_matakuliah, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, -1, -1));

        t_rekapDosen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/rekap dsn.png"))); // NOI18N
        t_rekapDosen.setBorder(null);
        t_rekapDosen.setBorderPainted(false);
        t_rekapDosen.setContentAreaFilled(false);
        t_rekapDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_rekapDosenActionPerformed(evt);
            }
        });
        menu.add(t_rekapDosen, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, -1, -1));

        t_rekapMahasiswa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/rekap mhs.png"))); // NOI18N
        t_rekapMahasiswa.setBorder(null);
        t_rekapMahasiswa.setBorderPainted(false);
        t_rekapMahasiswa.setContentAreaFilled(false);
        t_rekapMahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_rekapMahasiswaActionPerformed(evt);
            }
        });
        menu.add(t_rekapMahasiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 310, -1, -1));

        t_jadwal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/jdwl.png"))); // NOI18N
        t_jadwal.setBorder(null);
        t_jadwal.setBorderPainted(false);
        t_jadwal.setContentAreaFilled(false);
        menu.add(t_jadwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 90, 160, 160));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/panel.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(1366, 618));
        menu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 1080, 620));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 51, 51));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Admin");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 287, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/prof.png"))); // NOI18N
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menu.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mainPanel.add(menu, "card3");

        tb_dosen.setPreferredSize(new java.awt.Dimension(1366, 618));
        tb_dosen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        tb_dosen.add(nip, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 320, 30));

        jLabel5.setText("NIP");
        tb_dosen.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        jLabel6.setText("Nama");
        tb_dosen.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        jLabel7.setText("Tanggal Lahir");
        tb_dosen.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        jLabel8.setText("Jabatan");
        tb_dosen.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));
        tb_dosen.add(namaDosen, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 320, 30));
        tb_dosen.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 320, 30));

        jLabel9.setText("Password");
        tb_dosen.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, -1));
        tb_dosen.add(tglLahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 267, 320, 30));

        kembaliDosen.setText("Kembali");
        kembaliDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliDosenActionPerformed(evt);
            }
        });
        tb_dosen.add(kembaliDosen, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 130, 40));

        simpanDosen.setText("Simpan");
        simpanDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanDosenActionPerformed(evt);
            }
        });
        tb_dosen.add(simpanDosen, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 130, 40));

        ubahDosen.setText("Ubah");
        ubahDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahDosenActionPerformed(evt);
            }
        });
        tb_dosen.add(ubahDosen, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, 80, -1));

        tb_dosen.add(jabatan_comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 320, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/tmbh dsn.png"))); // NOI18N
        tb_dosen.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 620));

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

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/jdwl_1.png"))); // NOI18N
        jadwal.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 620));

        mainPanel.add(jadwal, "card7");

        tb_jadwal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        tb_jadwal.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 290, 34));

        jLabel23.setText("Jam Mulai                    :");
        tb_jadwal.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        jLabel10.setText("Hari                             :");
        tb_jadwal.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        jLabel11.setText("Jam Mulai                    :");
        tb_jadwal.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));
        tb_jadwal.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 290, 34));

        jLabel18.setText("Matakuliah                 :");
        tb_jadwal.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 180, -1));

        jLabel19.setText("Dosen                        :");
        tb_jadwal.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 197, -1));

        jLabel21.setText("Ruang                        :");
        tb_jadwal.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 175, -1));

        jLabel22.setText("Kelas                         :");
        tb_jadwal.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 166, -1));

        jButton3.setText("Batal");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        tb_jadwal.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 530, -1, -1));

        jButton9.setText("Simpan");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        tb_jadwal.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 530, -1, -1));
        tb_jadwal.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 290, 34));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pemrograman Berorientasi Obyek 2", "Item 2", "Item 3", "Item 4" }));
        tb_jadwal.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 290, 40));
        tb_jadwal.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 290, 34));
        tb_jadwal.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 290, 34));
        tb_jadwal.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 290, 34));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/tmbh jdwl.png"))); // NOI18N
        tb_jadwal.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 620));

        mainPanel.add(tb_jadwal, "card9");

        matakuliah.setPreferredSize(new java.awt.Dimension(1081, 618));
        matakuliah.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField13.setText("Cari ...");
        matakuliah.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 280, 30));

        tabelMatakuliah.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Matakuliah", "Nama Matakuliah", "Jenis Matakuliah", "Jumlah SKS", "Semester"
            }
        )
    );
    jScrollPane3.setViewportView(tabelMatakuliah);

    matakuliah.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 1220, 190));

    jLabel20.setText("Filter");
    matakuliah.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

    jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kode Matakuliah", "Item 2", "Item 3", "Item 4" }));
    matakuliah.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 160, 30));

    jButton10.setText("Cari");
    matakuliah.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 70, 30));

    t_hapusMk.setText("Hapus");
    t_hapusMk.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            t_hapusMkActionPerformed(evt);
        }
    });
    matakuliah.add(t_hapusMk, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 450, 80, -1));

    t_tambahMk.setText("Tambah");
    matakuliah.add(t_tambahMk, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 450, -1, -1));

    t_kembaliMk.setText("Kembali");
    matakuliah.add(t_kembaliMk, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

    t_ubah.setText("Ubah");
    matakuliah.add(t_ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 450, 80, -1));

    jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/matkul_1.png"))); // NOI18N
    matakuliah.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 620));

    mainPanel.add(matakuliah, "card3");

    tb_matakuliah.setPreferredSize(new java.awt.Dimension(1081, 618));
    tb_matakuliah.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel25.setText("Kode Matakuliah        :");
    tb_matakuliah.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));
    tb_matakuliah.add(txt_kode_matakuliah, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 290, 34));

    jLabel26.setText("Nama Matakuliah       :");
    tb_matakuliah.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

    jLabel28.setText("Semester                   :");
    tb_matakuliah.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, -1, -1));

    jumlah_sks.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
    jumlah_sks.setSelectedIndex(-1);
    tb_matakuliah.add(jumlah_sks, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 290, 40));

    semester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", " " }));
    semester.setSelectedIndex(-1);
    tb_matakuliah.add(semester, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 290, 40));

    jenis_matakuliah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Universitas", "Fakultas", "Program Studi" }));
    jenis_matakuliah.setSelectedIndex(-1);
    tb_matakuliah.add(jenis_matakuliah, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 290, 40));

    jLabel30.setText("Jenis Matakuliah        :");
    tb_matakuliah.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

    jLabel31.setText("Jumlah SKS                 :");
    tb_matakuliah.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, -1, -1));
    tb_matakuliah.add(txt_nama_matakuliah, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 290, 34));

    t_batalMk.setText("Batal");
    tb_matakuliah.add(t_batalMk, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 100, 40));

    simpan_tbMk.setText("Simpan");
    tb_matakuliah.add(simpan_tbMk, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, 100, 40));

    simpan_ubahMk.setText("Simpan");
    tb_matakuliah.add(simpan_ubahMk, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, 100, 40));
    tb_matakuliah.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 620));

    mainPanel.add(tb_matakuliah, "card3");

    rekapanDosen.setMaximumSize(new java.awt.Dimension(1081, 618));
    rekapanDosen.setMinimumSize(new java.awt.Dimension(1081, 618));
    rekapanDosen.setPreferredSize(new java.awt.Dimension(1366, 618));
    rekapanDosen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jTextField2.setText("Cari ...");
    rekapanDosen.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 280, 30));

    jLabel17.setText("Filter");
    rekapanDosen.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

    jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matakuliah", "Item 2", "Item 3", "Item 4" }));
    rekapanDosen.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 160, 30));

    jButton6.setText("Cari");
    rekapanDosen.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 70, 30));

    jButton7.setText("Kembali");
    jButton7.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton7ActionPerformed(evt);
        }
    });
    rekapanDosen.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

    jTable5.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null}
        },
        new String [] {
            "No", "Hari", "Tanggal", "Kode Matakuliah", "Matakuliah", "Dosen", "Pertemuan", "Materi"
        }
    ));
    jScrollPane5.setViewportView(jTable5);

    rekapanDosen.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 1260, 90));

    jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/rekap_1.png"))); // NOI18N
    rekapanDosen.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 620));

    mainPanel.add(rekapanDosen, "card3");

    rekapanMahasiswa.setMaximumSize(new java.awt.Dimension(1081, 618));
    rekapanMahasiswa.setMinimumSize(new java.awt.Dimension(1081, 618));
    rekapanMahasiswa.setPreferredSize(new java.awt.Dimension(1081, 618));
    rekapanMahasiswa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jTextField7.setText("Cari ...");
    rekapanMahasiswa.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 280, 30));

    jLabel27.setText("Filter");
    rekapanMahasiswa.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

    jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matakuliah", "Item 2", "Item 3", "Item 4" }));
    rekapanMahasiswa.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 160, 30));

    jButton8.setText("Cari");
    rekapanMahasiswa.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 70, 30));

    jButton15.setText("Kembali");
    jButton15.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton15ActionPerformed(evt);
        }
    });
    rekapanMahasiswa.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

    jTable6.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null}
        },
        new String [] {
            "No", "NIM", "Nama ", "Sakit", "Ijin", "Alpha", "Total Kehadiran", "Persentase", "Status"
        }
    ));
    jScrollPane6.setViewportView(jTable6);

    rekapanMahasiswa.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 1260, 90));

    jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/rekap_1.png"))); // NOI18N
    rekapanMahasiswa.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 620));

    mainPanel.add(rekapanMahasiswa, "card3");

    biodata.setPreferredSize(new java.awt.Dimension(1366, 618));
    biodata.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    biodata.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 320, 30));

    jRadioButton1.setText("Perempuan");
    biodata.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, -1, -1));

    jRadioButton2.setText("Laki-laki");
    biodata.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

    jLabel34.setText("Nama                        :");
    biodata.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));
    biodata.add(namaDosen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 320, 30));

    jLabel35.setText("Tanggal Lahir          :");
    biodata.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, -1));

    jLabel36.setText("Jenis Kelamin           :");
    biodata.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

    jButton17.setText("Kembali");
    jButton17.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton17ActionPerformed(evt);
        }
    });
    biodata.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, -1, -1));

    simpanDosen1.setText("Simpan");
    simpanDosen1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            simpanDosen1ActionPerformed(evt);
        }
    });
    biodata.add(simpanDosen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, -1, -1));

    mainPanel.add(biodata, "card4");

    dosen.setMaximumSize(new java.awt.Dimension(1081, 618));
    dosen.setMinimumSize(new java.awt.Dimension(1081, 618));
    dosen.setPreferredSize(new java.awt.Dimension(1355, 615));
    dosen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jTextField1.setText("Cari ...");
    jTextField1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField1ActionPerformed(evt);
        }
    });
    dosen.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 280, 30));

    jLabel4.setText("Filter");
    dosen.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, 30));

    jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NIP", "Item 2", "Item 3", "Item 4" }));
    dosen.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 90, 30));

    jButton1.setText("Cari");
    dosen.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 70, 30));

    hapusDosen.setText("Hapus");
    hapusDosen.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            hapusDosenActionPerformed(evt);
        }
    });
    dosen.add(hapusDosen, new org.netbeans.lib.awtextra.AbsoluteConstraints(966, 360, 90, -1));

    t_tambahDosen.setText("Tambah");
    t_tambahDosen.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            t_tambahDosenActionPerformed(evt);
        }
    });
    dosen.add(t_tambahDosen, new org.netbeans.lib.awtextra.AbsoluteConstraints(1188, 360, 100, -1));

    ubah.setText("Update");
    dosen.add(ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(1083, 360, 90, -1));

    kembaliMenu.setText("Kembali");
    kembaliMenu.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            kembaliMenuActionPerformed(evt);
        }
    });
    dosen.add(kembaliMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

    tabelDosen.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
        new String [] {
            "Title 1", "Title 2", "Title 3", "Title 4"
        }
    ));
    bgTable.setViewportView(tabelDosen);

    dosen.add(bgTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 1250, 110));

    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/dsn_1.png"))); // NOI18N
    dosen.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 620));

    mainPanel.add(dosen, "card3");

    getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1355, 615));

    panelAtas.setLayout(null);

    jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/logout(3).png"))); // NOI18N
    jButton16.setBorderPainted(false);
    jButton16.setContentAreaFilled(false);
    jButton16.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton16ActionPerformed(evt);
        }
    });
    panelAtas.add(jButton16);
    jButton16.setBounds(1150, 0, 170, 150);

    jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/panelAtas.png"))); // NOI18N
    panelAtas.add(jLabel3);
    jLabel3.setBounds(10, 0, 1330, 149);

    getContentPane().add(panelAtas, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1380, 150));

    jLabel38.setText("jLabel38");
    getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 678));

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_dosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_dosenActionPerformed
        CardLayout cl = (CardLayout) (mainPanel.getLayout());
        cl.show(mainPanel, "");
    }//GEN-LAST:event_t_dosenActionPerformed

    private void kembaliDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliDosenActionPerformed
//        CardLayout cl = (CardLayout)(mainPanel.getLayout());
//        cl.show(mainPanel,"dosen");
    }//GEN-LAST:event_kembaliDosenActionPerformed

    private void hapusDosen3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusDosen3ActionPerformed

    }//GEN-LAST:event_hapusDosen3ActionPerformed

    private void t_tambahMhs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_tambahMhs1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_tambahMhs1ActionPerformed

    private void t_tambahMhs2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_tambahMhs2ActionPerformed

    }//GEN-LAST:event_t_tambahMhs2ActionPerformed

    private void t_hapusMkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_hapusMkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_hapusMkActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

    }//GEN-LAST:event_jButton11ActionPerformed

    private void simpanDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanDosenActionPerformed

    }//GEN-LAST:event_simpanDosenActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void t_rekapDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_rekapDosenActionPerformed

    }//GEN-LAST:event_t_rekapDosenActionPerformed

    private void t_rekapMahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_rekapMahasiswaActionPerformed

    }//GEN-LAST:event_t_rekapMahasiswaActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed

    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void simpanDosen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanDosen1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_simpanDosen1ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        int close = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin keluar?", "Pesan keluar", JOptionPane.YES_NO_OPTION);

        if (close == JOptionPane.YES_OPTION) {
            System.exit(0);
        }

    }//GEN-LAST:event_jButton16ActionPerformed

    private void ubahDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahDosenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ubahDosenActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void hapusDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusDosenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hapusDosenActionPerformed

    private void t_tambahDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_tambahDosenActionPerformed

    }//GEN-LAST:event_t_tambahDosenActionPerformed

    private void kembaliMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliMenuActionPerformed

    }//GEN-LAST:event_kembaliMenuActionPerformed

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
    private javax.swing.JScrollPane bgTable;
    private javax.swing.JPanel biodata;
    public javax.swing.JPanel dosen;
    private javax.swing.JButton hapusDosen;
    private javax.swing.JButton hapusDosen3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox7;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JComboBox<String> jabatan_comboBox;
    private javax.swing.JPanel jadwal;
    private javax.swing.JComboBox<String> jenis_matakuliah;
    private javax.swing.JComboBox<String> jumlah_sks;
    private javax.swing.JButton kembaliDosen;
    private javax.swing.JButton kembaliMenu;
    public javax.swing.JPanel mainPanel;
    private javax.swing.JPanel matakuliah;
    private javax.swing.JPanel menu;
    private javax.swing.JTextField namaDosen;
    private javax.swing.JTextField namaDosen1;
    private javax.swing.JTextField nip;
    private javax.swing.JPanel panelAtas;
    private javax.swing.JTextField password;
    public javax.swing.JPanel rekapanDosen;
    public javax.swing.JPanel rekapanMahasiswa;
    private javax.swing.JComboBox<String> semester;
    private javax.swing.JButton simpanDosen;
    private javax.swing.JButton simpanDosen1;
    private javax.swing.JButton simpan_tbMk;
    private javax.swing.JButton simpan_ubahMk;
    private javax.swing.JButton t_batalMk;
    private javax.swing.JButton t_dosen;
    private javax.swing.JButton t_hapusMk;
    private javax.swing.JButton t_jadwal;
    private javax.swing.JButton t_kembaliMk;
    private javax.swing.JButton t_matakuliah;
    private javax.swing.JButton t_rekapDosen;
    private javax.swing.JButton t_rekapMahasiswa;
    private javax.swing.JButton t_tambahDosen;
    private javax.swing.JButton t_tambahMhs1;
    private javax.swing.JButton t_tambahMhs2;
    private javax.swing.JButton t_tambahMk;
    private javax.swing.JButton t_ubah;
    private javax.swing.JTable tabelDosen;
    private javax.swing.JTable tabelMatakuliah;
    private javax.swing.JPanel tb_dosen;
    private javax.swing.JPanel tb_jadwal;
    private javax.swing.JPanel tb_matakuliah;
    private com.toedter.calendar.JDateChooser tglLahir;
    private javax.swing.JTextField txt_kode_matakuliah;
    private javax.swing.JTextField txt_nama_matakuliah;
    private javax.swing.JButton ubah;
    private javax.swing.JButton ubahDosen;
    // End of variables declaration//GEN-END:variables
}
