/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.kurniamavenstu3;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Kurniamavenstu3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = {1,2,3,4,5};
        for(int i = 0; i<5 ;i++){
         arr[i] = input.nextInt();
            System.out.println(arr[i]);
        }
       ArrayList<Integer> arr = new ArrayList();
      for(int i=0; i<6; i++){
       int a = input.nextInt();
       arr.add(a);
       }
       for(int i=0; i<arr.size(); i++)
       System.out.println(arr.get(i));
  }
}



