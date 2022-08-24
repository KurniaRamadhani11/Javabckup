/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.daftarsekolah;

/**
 *
 * @author ASUS
 */
public class guru extends wargaSekolah {      //mencopy atribut di class induknya 

    public guru(String Nama, int Umur, String Gender, String TTL) {
        super(Nama, Umur, Gender, TTL);
         this.NIP = NIP;
    }
    protected String NIP;

    public String getNip() {
        return NIP;
    }

    public void setNip(String nip) {
        this.NIP = nip;
    }

    
}
