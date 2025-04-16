/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manusia;

public class Manusia {
    
    String nama;
    String alamat;
    int umur;
    
    void Manusia(String nama, String alamat, int umur){
       this. nama = nama;
      this.  alamat =  alamat;
        this. umur = umur;
    }
    
    void tampilkanInfo(){
        System.out.println("nama : " +nama);
        System.out.println("alamat : " +alamat);
        System.out.println("umur : " +umur);
    }
    
    void berjalan() {
        System.out.println(nama + " sedang berjalan");
    }
    
    void berlari() {
       System.out.println(nama + " sedang berlari");
    }
    
    public static void main(String[] args) {
        Manusia manusia1 = new Manusia();
        System.out.println("informasi manusia ke 1");
        manusia1.Manusia("Naufal Husain", "Bangkalan", 19);
        manusia1.tampilkanInfo();
        manusia1.berjalan();
        manusia1.berlari();
        
        Manusia manusia2 = new Manusia();
        System.out.println("informasi manusia ke 2");
        manusia2.Manusia("Shobirin", "Bangkalan", 20);
        manusia2.tampilkanInfo();
        manusia2.berjalan();
        manusia2.berlari();
        
        Manusia manusia3 = new Manusia();
        System.out.println("informasi manusia ke 3");
        manusia3.Manusia("Rahmad", "Bangkalan", 19);
        manusia3.tampilkanInfo();
        manusia3.berjalan();
        manusia3.berlari();
        
        Manusia manusia4 = new Manusia();
        System.out.println("informasi manuisa ke 4");
        manusia4.Manusia("Fachrillah", "Bangkalan", 16);
        manusia4.berjalan();
        manusia4.berlari();
        
        Manusia manusia5 = new Manusia();
        System.out.println("informasi manusia ke 5");
        manusia5.Manusia("Fathur", "Bangkalan", 15);
        manusia5.berjalan();
        manusia5.berlari();
    }
    
}
