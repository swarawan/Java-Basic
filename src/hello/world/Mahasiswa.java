/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world;

/**
 *
 * @author rioswarawan
 */
public class Mahasiswa {
    private String nama;
    private String alamat;
    private String nim;
    private String universitas;
    private int umur;
    private boolean butaWarna;
    
    public void kuliah() {
        System.out.println("Kuliah");
    }
    
    public void bolos() {
        System.out.println("Bolos");
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setUmur(int umurMahasiswa) {
        umur = umurMahasiswa;
    }
    
    public int getUmur() {
        return umur;
    }
    
    public void setInfoMahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
}
