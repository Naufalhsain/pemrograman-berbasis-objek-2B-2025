/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;
/**
 *
 * @author user
 */
public class Matakuliah {
    String kode;
    String nama;
    int sks;

    public Matakuliah(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public void tampilkanInfo() {
        System.out.println("Kode Matakuliah : " + kode);
        System.out.println("Nama Matakuliah : " + nama);
        System.out.println("Jumlah SKS      : " + sks);
    }

    // Validasi hanya menerima SKS = 2 atau 3
    public static boolean sksValid(int sks) {
        return sks == 2 || sks == 3;
    }
}


