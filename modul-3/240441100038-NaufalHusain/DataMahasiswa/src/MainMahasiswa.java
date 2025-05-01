/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author user
 */
public class MainMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Membuat objek Mahasiswa Reguler
        MahasiswaReguler mhs1 = new MahasiswaReguler("Farid", "240441100007", "SI-1A");
        MahasiswaReguler mhs2 = new MahasiswaReguler("Yusuf", "240441100027", "SI-2B");
        MahasiswaReguler mhs3 = new MahasiswaReguler("Toan", "240441100024", "SI-3C");

        // Membuat objek Mahasiswa Beasiswa
        MahasiswaBeasiswa mhs4 = new MahasiswaBeasiswa("Naufal", "240441100038", "KIP-K");
        MahasiswaBeasiswa mhs5 = new MahasiswaBeasiswa("Rahmad", "250441100017", "PBI");
        MahasiswaBeasiswa mhs6 = new MahasiswaBeasiswa("Saip", "250441100015", "LPDP");

        // Menampilkan informasi Mahasiswa Reguler
        System.out.println("Data Mahasiswa Reguler:");
        mhs1.infoReguler();
        mhs2.infoReguler();
        mhs3.infoReguler();

        // Menampilkan informasi Mahasiswa Beasiswa
        System.out.println("Data Mahasiswa Beasiswa:");
        mhs4.infoBeasiswa();
        mhs5.infoBeasiswa();
        mhs6.infoBeasiswa();
    }
}
