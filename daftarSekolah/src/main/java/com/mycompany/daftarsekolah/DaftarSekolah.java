/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.daftarsekolah;

import java.util.Scanner;

/**
 *
 * @author nia
 */
public class DaftarSekolah {

    public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         String NamaSekolah = input.nextLine();
//         String Jenjang = input.nextLine();
//         int Jumlah = input.nextInt();
//         int tambah = input.nextInt();
//         input.nextLine();
//         String Nama = input.nextLine();
//         int Umur = input.nextInt();
//         input.nextLine();
//         String Gender = input.nextLine();
//         String TTL = input.nextLine();
//         //int baru = input.nextInt();
//        //inisialisasi objek
//        int baru =1;
       // Sekolah sekolah=new Sekolah("SMAN 9 BDL"," SMA", 350);
        //Sekolah sekolah=new Sekolah(NamaSekolah,Jenjang,Jumlah);
        //wargaSekolah warga=new wargaSekolah(Nama,Umur,Gender,TTL);
        wargaSekolah wargaSekolah = new wargaSekolah("Ervan Chodry", 20, "Laki-Laki", "29 September 2020");
        Siswa Siswa = new Siswa("Kurnia", 19,"Perempuan", "111103", 12345, "89");
        
     
        //setter&getter
       // sekolah.setNamaSekolah("SMAN 9 BDL");
       // System.out.println(sekolah.getNamaSekolah());
//        System.out.println("Nama Sekolah :" +sekolah.getNamaSekolah());
//        System.out.println("Jenjang :" +sekolah.getJenjang());
//        System.out.println("Jumlah :" +sekolah.getJumlah());
//        sekolah.tambahSiswa(tambah);
//        System.out.println("Jumlah Siswa Total :" +sekolah.getJumlah());
//        System.out.println("Nama :" +warga.getNama());
//        System.out.println("Umur :" +warga.getUmur());
//        System.out.println("Gender :" +warga.getGender());
//        System.out.println("TTL :" +warga.getTTL());
//        warga.umurBaru(baru);
//        System.out.println("Umur Baru :" +warga.getUmur());
        // System.out.print(wargaSekolah.getNama());
      //System.out.print(wargaSekolah.getNip());
        System.out.println(Siswa.getNama());
        System.out.println(Siswa.getUmur());
        System.out.println(Siswa.getGender());
        System.out.println(Siswa.getTTL());
        System.out.println(Siswa.getNisn());
        System.out.println(Siswa.getNilai());
  
    }
}
