/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author MOKLET-1
 */
public class Mapel {
    private String mapel;
    private String namaGuru;
    private String modul;
    private int jamPelajaran;

    public Mapel(String mapel, String namaGuru, String modul, int jamPelajaran){
        this.mapel = mapel;
        this.namaGuru = namaGuru;
        this.modul = modul;
        this.jamPelajaran = jamPelajaran;
    }
    
    public void info(){
        System.out.println("Mata Pelajaran       : " + this.mapel);
        System.out.println("Guru Pengajar        : " + this.namaGuru);
        System.out.println("Modul                : " + this.modul);
        System.out.println("Durasi               : " + this.jamPelajaran + " jam");
    }
    
}
