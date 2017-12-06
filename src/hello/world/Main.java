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
public class Main {
    
    public static void main(String[] args) {
        Mahasiswa rio = new Mahasiswa();
        
        rio.setNama("Rio Swarawan");
        String namaMahasiswa = rio.getNama();
        System.out.println("Nama Mahasiswa adalah " + namaMahasiswa);
        
        rio.setUmur(18);
        System.out.println("Umur " + namaMahasiswa + " adalah " + rio.getUmur());
        
        rio.setInfoMahasiswa("Taylor Swift", 25);
        namaMahasiswa = rio.getNama();
        System.out.println("Umur " + namaMahasiswa + " adalah " + rio.getUmur());
    }
}
