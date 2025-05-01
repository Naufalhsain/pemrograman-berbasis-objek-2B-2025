/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class MainPerpustakaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();

        System.out.print("Masukkan jumlah buku fiksi: ");
        int jumlahFiksi = input.nextInt();
        input.nextLine(); // konsumsi enter

        for (int i = 0; i < jumlahFiksi; i++) {
            System.out.println("\nData Buku Fiksi ke-" + (i+1));
            System.out.print("Judul  : ");
            String judul = input.nextLine();
            System.out.print("Penulis: ");
            String penulis = input.nextLine();
            System.out.print("Genre  : ");
            String genre = input.nextLine();

            BukuFiksi bukuFiksi = new BukuFiksi(judul, penulis, genre);
            perpustakaan.tambahBukuFiksi(bukuFiksi);
        }

        System.out.print("\nMasukkan jumlah buku non fiksi: ");
        int jumlahNonFiksi = input.nextInt();
        input.nextLine(); // konsumsi enter

        for (int i = 0; i < jumlahNonFiksi; i++) {
            System.out.println("\nData Buku Non Fiksi ke-" + (i+1));
            System.out.print("Judul  : ");
            String judul = input.nextLine();
            System.out.print("Penulis: ");
            String penulis = input.nextLine();
            System.out.print("Topik  : ");
            String topik = input.nextLine();

            BukuNonFiksi bukuNonFiksi = new BukuNonFiksi(judul, penulis, topik);
            perpustakaan.tambahBukuNonFiksi(bukuNonFiksi);
        }

        // Tampilkan semua koleksi
        perpustakaan.tampilkanKoleksi();
    }
}
