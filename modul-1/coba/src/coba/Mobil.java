/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coba;

/**
 *
 * @author user
 */
public class Mobil {
   String merk;
   int tahun;
   
   //constructor
   public Mobil(String merk, int tahun){
       this.merk = merk;
       this.tahun = tahun;
   }
   
   public void infoMobil(){
       System.out.println("Merk = "+ merk);
       System.out.println("Tahun = "+ tahun);
       
   }
}
