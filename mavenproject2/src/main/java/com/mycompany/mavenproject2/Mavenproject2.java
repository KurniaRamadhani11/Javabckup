/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        //deklarasi
//        int x = 11;
//        double y = 4.5;
//        String a = "Besok kuliah";
//        String b = " matkul PBO";
//        System.out.println(a+b);
//        System.out.println(x+y);
        
        //input
        Scanner coba = new Scanner(System.in);
        String n = coba.next();
        String p = coba.next();
        String h = coba.next();
        
       System.out.println("NAMA\t: "+n);
       System.out.println("NPM\t: "+p);
       System.out.println("HOBI\t: "+h);
      
        
    }
}
