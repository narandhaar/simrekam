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
public class arrayList_dosen {
    private int nip;
    private String nama_dosen;
    private String tanggalLahir;
    private String nama_jabatan;
    
    public arrayList_dosen(int nip, String nama_dosen, String tanggalLahir, String nama_jabatan){
        this.nip=nip;
        this.nama_dosen=nama_dosen;
        this.tanggalLahir=tanggalLahir;
        this.nama_jabatan=nama_jabatan;
    }

    public int getNip() {
        return nip;
    }

    public String getNama_dosen() {
        return nama_dosen;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public String getNama_jabatan() {
        return nama_jabatan;
    }
    
    
    
}
