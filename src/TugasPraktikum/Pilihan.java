/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class Pilihan {
    void info(){  
        Scanner input = new Scanner(System.in);
    
        System.out.println("========== DAFTAR BIDANG PELAJARAN ==========");
        System.out.println("1. Agama");
        System.out.println("2. Bahasa");
        System.out.println("3. Kesehatan");
        System.out.println("4. Produktif");
        System.out.println("5. Sains");
        System.out.println("6. Seni");
        System.out.println("7. Sosial");
        System.out.print("Masukkan Pilihan Anda : ");
        int a = input.nextInt();
        
        if(a >= 1 && a<=8){
            if(a == 1){
                JenisMapel cetak1 = new JenisMapel ("Agama", "Pendidikan Agama Islam", "M. Masyis Dzul Hilmi, M.Pd", "LMS", 2);
                cetak1.info();
            }
            if(a == 2){
                JenisMapel cetak2 = new JenisMapel ("Bahasa", "Bahasa Indonesia","Noer Hidayat, S.Pd.", "LMS", 2);
                cetak2.info();
            }
            if(a == 3){
                JenisMapel cetak3 = new JenisMapel ("Kesehatan", "Pendidikan Jasmani, Olahraga, dan Kesehatan", "Rofiqut Thoriq, S.Pd", "LMS", 2);
                cetak3.info();
            }
            if(a == 4){
                JenisMapel cetak4 = new JenisMapel ("Produktif", "Produktif RPL", "Mokhamad Hadi Wijaya, S.Kom, M.T.", "LMS", 5);
                cetak4.info();
            }
            if(a == 5){
                JenisMapel cetak5 = new JenisMapel("Sains", "Fisika", "Diaur Rahman, S.Pd.", "LMS", 2);
                cetak5.info();
            }
            if(a == 6){
                JenisMapel cetak6 = new JenisMapel("Seni", "Seni Budaya", "Hery Yudianto, S.Pd.", "LMS", 2);
                cetak6.info();
            }
            if(a == 7){
                JenisMapel cetak7 = new JenisMapel("Sosial", "Sejarah Indonesia", "Ana Wahyuning S., S.Pd.", " LMS", 2);
                cetak7.info();
            }
        }else{
            System.out.println("Maaf Pilihan Tidak Tersedia");
        }
    }
  
}
