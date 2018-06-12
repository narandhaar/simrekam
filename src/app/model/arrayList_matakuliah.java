/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.model;

/**
 *
 * @author ran
 */
public class arrayList_matakuliah {
    private String kode_matakuliah;
    private String nama_matakuliah;
    private String jenis_matkuliah;
    private String semester;
    private int id_matkul;
    private int jumlahSks;
    
    
    public arrayList_matakuliah(String kode_matakuliah, String nama_matakuliah, String jenis_matakuliah, String semester, int jumlahSks ){
        this.kode_matakuliah = kode_matakuliah;
        this.nama_matakuliah = nama_matakuliah;
        this.jenis_matkuliah = jenis_matakuliah;
        this.semester = semester;
        this.jumlahSks = jumlahSks;
    }

    public String getKode_matakuliah() {
        return kode_matakuliah;
    }

    public String getNama_matakuliah() {
        return nama_matakuliah;
    }

    public String getJenis_matkuliah() {
        return jenis_matkuliah;
    }

    public String getSemester() {
        return semester;
    }

    public int getId_matkul() {
        return id_matkul;
    }

    public int getJumlahSks() {
        return jumlahSks;
    }
    
    
}
