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
public class MainMatakuliah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Matakuliah[] daftarMK = new Matakuliah[8];

        for (int i = 0; i < 8; i++) {
            System.out.println("\nInput Matakuliah ke-" + (i + 1));
            System.out.print("Masukkan Kode Matakuliah: ");
            String kode = input.nextLine();

            System.out.print("Masukkan Nama Matakul: ");
            String nama = input.nextLine();

            int sks;
            do {
                System.out.print("Masukkan Jumlah SKS : ");
                sks = input.nextInt();
                input.nextLine(); // buang newline
                if (!Matakuliah.sksValid(sks)) {
                    System.out.println("SKS tidak valid! Hanya bisa memasukkan 2 atau 3 nilai saja ");
                }
            } while (!Matakuliah.sksValid(sks));

            daftarMK[i] = new Matakuliah(kode, nama, sks);
        }

        System.out.println("\n==== Daftar Mata Kuliah ====");
        for (Matakuliah mk : daftarMK) {
            mk.tampilkanInfo();
            System.out.println();
        }

        input.close();
    }
}




    