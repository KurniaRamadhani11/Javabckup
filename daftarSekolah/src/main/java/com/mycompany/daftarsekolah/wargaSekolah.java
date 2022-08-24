/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.daftarsekolah;

/**
 *
 * @author ASUS
 */
public class wargaSekolah {
    private String Nama;
    private int Umur;
    private String Gender;
    private String TTL;
   
    public void umurBaru(int baru){
    Umur++;
    }
    

//constructor
public wargaSekolah(String Nama, int Umur, String Gender, String TTL){
    this.Nama = Nama;
    this.Umur = Umur;
    this.Gender = Gender;
    this.TTL = TTL;
}
//SETTER GETTER
    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public int getUmur() {
        return Umur;
    }

    public void setUmur(int Umur) {
        this.Umur = Umur;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getTTL() {
        return TTL;
    }

    public void setTTL(String TTL) {
        this.TTL = TTL;
    }

}