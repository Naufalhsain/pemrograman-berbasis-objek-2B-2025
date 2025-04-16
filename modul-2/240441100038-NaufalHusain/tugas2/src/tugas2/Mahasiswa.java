/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;
/**
 *
 * @author user
 */
import java.util.ArrayList;

public class Mahasiswa {
    String nama;
    String nim;
    String prodi;
    ArrayList<String> daftarMatakuliah = new ArrayList<>();

    static int jumlahMahasiswa = 0;

    public Mahasiswa(String nama, String nim, String prodi) {
        if (nimSah(nim)) {
            this.nama = nama;
            this.nim = nim;
            this.prodi = prodi;
            jumlahMahasiswa++;
        } else {
            System.out.println("NIM tidak valid: " + nim);
            this.nim = null;
        }
    }

    public void tambahMatakuliah(String matkul) {
        if (nim != null) {
            daftarMatakuliah.add(matkul);
        }
    }
    public void tampilkanData() {
        if (nim != null) {
            System.out.println("Nama  : " + nama);
            System.out.println("NIM   : " + nim);
            System.out.println("Prodi : " + prodi);
            System.out.println("Mata Kuliah yang diambil:");
            for (String mk : daftarMatakuliah) {
                System.out.println("- " + mk);
            }
        }
    }

    public static void tampilkanStatistik() {
        System.out.println("Jumlah Mahasiswa Valid: " + jumlahMahasiswa);
    }

    public static boolean nimSah(String nim) {
        return nim != null && nim.matches("^23\\d{8}$");
    }
}



