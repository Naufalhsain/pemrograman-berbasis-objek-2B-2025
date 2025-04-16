/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coba;

/**
 *
 * @author user
 */
public class Pegawai {
    String nama;
    String jabatan;
    int gaji;
    
    static int jumlahPegawai = 0;
    static int totalGaji = 0;
    
    public Pegawai(String nama, String jabatan, int gaji){
        if(namaSah(nama)){
            this.nama = nama;
            this.jabatan = jabatan;
            this.gaji = gaji;
            
            jumlahPegawai++;
            totalGaji += gaji;
        }else{
            System.out.println("Nama unvalid = "+ nama);
            this.nama = null;
        }
        }
            public void tampilkanData(){
                if(nama !=null){
                System.out.println("Nama = "+ nama);
                System.out.println("Jabatan = "+ jabatan);
                System.out.println("Gaji = "+ gaji);
            }
        }
                
        public static void tampilkanStatistik(){
            if(jumlahPegawai > 0){
                System.out.println("Jumlah Pegawai = "+ jumlahPegawai);
                System.out.println("Total Gaji = "+ totalGaji);
                System.out.println("Rerata Gaji = "+ totalGaji/jumlahPegawai);
            }else{
                System.out.println("Tidak ada pegawai yang valid");
                }
    }
            public static boolean namaSah(String nama){
                return nama != null && !nama.isEmpty();
            }
    }


