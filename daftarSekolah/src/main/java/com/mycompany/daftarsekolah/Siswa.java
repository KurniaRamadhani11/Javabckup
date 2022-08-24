/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.daftarsekolah;

/**
 *
 * @author ASUS
 */
public class Siswa extends wargaSekolah {
    
    public Siswa(String Nama, int Umur, String Gender, String TTL, int Nisn, String Nilai){
        super(Nama, Umur, Gender, TTL);
        this.Nisn = Nisn;
        this.Nilai = Nilai;
    }
    protected int Nisn;
    protected String Nilai;
    
    public int getNisn() {
        return Nisn;
    
}
    public String getNilai() {
        return Nilai;
    
}
    public void setNisn(int Nisn) {
        this.Nisn = Nisn;
    }
    public void setNisn(String Nilai) {
        this.Nilai = Nilai;
    }
}
