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
public class combo_jabatan {
    private int id_jabatan;
    private String nama_jabatan;
    
    public combo_jabatan(){}
    
    public combo_jabatan(int id_jabatan, String nama_jabatan){
        this.id_jabatan = id_jabatan;
        this.nama_jabatan = nama_jabatan;
    }
    
    public String getJabatan(){
        return nama_jabatan;
    } 
    
    public int getId(){
        return id_jabatan;
    }
    
    
}
