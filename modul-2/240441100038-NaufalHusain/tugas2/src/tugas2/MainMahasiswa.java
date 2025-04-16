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
public class MainMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa[] mahasiswa = new Mahasiswa[6];

        for (int i = 0; i < 6; i++) {
            System.out.println("\nMasukkan data Mahasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = input.nextLine();

            String nim;
            do {
                System.out.print("NIM: ");
                nim = input.nextLine();
                if (!Mahasiswa.nimSah(nim)) {
                    System.out.println("NIM tidak valid! Harus diawali '23' dan 10 digit");
                }
            } while (!Mahasiswa.nimSah(nim));

            System.out.print("Prodi: ");
            String prodi = input.nextLine();

            Mahasiswa mhs = new Mahasiswa(nama, nim, prodi);

            for (int j = 0; j < 4; j++) {
                System.out.print("Mata kuliah ke-" + (j + 1) + ": ");
                String mk = input.nextLine();
                mhs.tambahMatakuliah(mk);
            }

            mahasiswa[i] = mhs;
        }

        System.out.println("\n==== Data Mahasiswa ====");
        for (Mahasiswa m : mahasiswa) {
            m.tampilkanData();
            System.out.println();
        }

        Mahasiswa.tampilkanStatistik();
        input.close();
    }
}






