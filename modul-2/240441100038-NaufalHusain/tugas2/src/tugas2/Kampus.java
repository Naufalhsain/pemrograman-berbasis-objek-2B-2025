/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;
/**
 *
 * @author user
 */
public class Kampus {
    String namaKampus;
    String alamatKampus;

    static int totalMahasiswa = 0;

    public Kampus(String namaKampus, String alamatKampus) {
        this.namaKampus = namaKampus;
        this.alamatKampus = alamatKampus;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Kampus   : " + namaKampus);
        System.out.println("Alamat Kampus : " + alamatKampus);
    }

    public static void tampilkanJumlahMahasiswa() {
        System.out.println("Total Mahasiswa: " + totalMahasiswa);
    }

    public static boolean namaKampusValid(String nama) {
        return !nama.matches(".*\\d.*"); // Tidak mengandung angka
    }
}



