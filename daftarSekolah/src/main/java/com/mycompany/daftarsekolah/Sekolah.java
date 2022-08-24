/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.daftarsekolah;

/**
 *
 * @author ASUS
 */
public class Sekolah {
    private String NamaSekolah;
    private String Jenjang;
    private int Jumlah;
   
    
    public void tambahSiswa(int tambah){
       this.Jumlah = this.Jumlah+tambah;
    
    } 
    
    //constructor
    public Sekolah(String NamaSekolah, String Jenjang, int Jumlah) {
        this.NamaSekolah = NamaSekolah;
        this.Jenjang = Jenjang;
        this.Jumlah = Jumlah;
    }
    //setter
    public  void setNamaSekolah(String NamaSekolah){
         this.NamaSekolah = NamaSekolah;
    }
    //getter
    public String getNamaSekolah(){
            return this.NamaSekolah;
    
    }

    public String getJenjang() {
        return Jenjang;
    }

    public void setJenjang(String Jenjang) {
        this.Jenjang = Jenjang;
    }

    public int getJumlah() {
        return Jumlah;
    }

    public void setJumlah(int Jumlah) {
        this.Jumlah = Jumlah;
    }
    
}
