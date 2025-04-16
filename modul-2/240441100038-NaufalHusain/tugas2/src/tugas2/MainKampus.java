/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2;
/**
 *
 * @author user
 */
import java.util.Scanner;
public class MainKampus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaKampus;
        do {
            System.out.print("Masukkan Nama Kampus: ");
            namaKampus = input.nextLine();
            if (!Kampus.namaKampusValid(namaKampus)) {
                System.out.println("Nama kampus tidak valid! Tidak boleh mengandung angka.");
            }
        } while (!Kampus.namaKampusValid(namaKampus));

        System.out.print("Masukkan Alamat Kampus: ");
        String alamat = input.nextLine();

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        Kampus.totalMahasiswa = input.nextInt();

        Kampus kampus = new Kampus(namaKampus, alamat);

        System.out.println("\n==== Info Kampus ====");
        kampus.tampilkanInfo();
        Kampus.tampilkanJumlahMahasiswa();

        System.out.println("Status Validasi Nama Kampus: " + 
            (Kampus.namaKampusValid(namaKampus) ? "Valid" : "Tidak Valid"));

        input.close();
    }
}





    
