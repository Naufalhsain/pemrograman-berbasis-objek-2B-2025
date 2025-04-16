/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coba;

/**
 *
 * @author user
 */
public class MainKalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int hasil = Kalkulator.tambah(5,3);
        System.out.println("Hasil = "+ hasil);
        
        Kalkulator k = new Kalkulator();
        k.halo();
    }
    
}
