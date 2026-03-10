import java.util.Scanner; //

public class MatakuliahDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //
        Matakuliah[] arrayOfMatakuliah = new Matakuliah12[3]; //
        String kode, nama, dummy;
        int sks, jumlahJam;

        // --- BAGIAN INPUT ---
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1)); //
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("Sks        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy); // Mengubah string ke int
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("--------------------------------------");

            // Memasukkan objek ke array menggunakan constructor
            arrayOfMatakuliah12[i] = new Matakuliah(kode, nama, sks, jumlahJam);
        }

        // --- BAGIAN OUTPUT (Penting agar tampilan rapi di bawah) ---
        System.out.println("\n======= DAFTAR MATAKULIAH =======");
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1)); //
            System.out.println("Kode       : " + arrayOfMatakuliah12[i].kode);
            System.out.println("Nama       : " + arrayOfMatakuliah12[i].nama);
            System.out.println("Sks        : " + arrayOfMatakuliah12[i].sks);
            System.out.println("Jumlah Jam : " + arrayOfMatakuliah12[i].jumlahJam);
            System.out.println("--------------------------------------");
        }
        
        sc.close();
    }
}