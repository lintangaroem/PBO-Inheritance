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

    class JenisMapel extends Mapel{
    private String JenisMapel;
    
    public JenisMapel(String JenisMapel, String mapel, String namaGuru, String modul, int jamPelajaran){
        super(mapel, namaGuru, modul, jamPelajaran);
        this.JenisMapel = JenisMapel;
    }
    
    public void info(){
        System.out.println();
        System.out.println("Jenis Pelajaran      : " + this.JenisMapel);
        super.info();
    }
}
public class Konstruktor {
    public static void main(String[]args){
        Pilihan cetak = new Pilihan();
        cetak.info();
        
    }
}
    
