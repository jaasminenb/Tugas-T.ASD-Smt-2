import java.util.Scanner;

public class MatakuliahDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Menggunakan tipe data Matakuliah12 sesuai nama class di file pertama
        Matakuliah12[] arrayOfMatakuliah = new Matakuliah12[3]; 
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("Sks        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("--------------------------------------");

            // Mengisi array dengan objek baru
            arrayOfMatakuliah[i] = new Matakuliah12(kode, nama, sks, jumlahJam);
        }

        // Menampilkan hasil secara rapi di bawah (seperti keinginan kamu)
        System.out.println("\n======= HASIL DATA MATAKULIAH =======");
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode       : " + arrayOfMatakuliah[i].kode);
            System.out.println("Nama       : " + arrayOfMatakuliah[i].nama);
            System.out.println("Sks        : " + arrayOfMatakuliah[i].sks);
            System.out.println("Jumlah Jam : " + arrayOfMatakuliah[i].jumlahJam);
            System.out.println("--------------------------------------");
        }
        
        sc.close();
    }
}