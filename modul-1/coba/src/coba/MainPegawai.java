/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coba;

/**
 *
 * @author user
 */
public class MainPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai("Naufal","manajer", 2500);
        Pegawai p2 = new Pegawai("Naufal","staff", 2000);
        Pegawai p3 = new Pegawai("Husain","manajer", 2500);
        
        p1.tampilkanData();
        p2.tampilkanData();
        p3.tampilkanData();
        
        Pegawai.tampilkanStatistik();
    }
    
}
