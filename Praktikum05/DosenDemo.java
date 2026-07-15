import java.util.Scanner;

public class DosenDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);
        
        System.out.println("=== SELAMAT DATANG DI PENDATAAN DOSEN ===");
        System.out.print("Tentukan kapasitas maksimal data dosen: ");
        int jmldsn = sc.nextInt();
        sc.nextLine(); // Bersihkan buffer
        
        DataDosen12 list = new DataDosen12(jmldsn);
        int pilihan;

        // Memulai sistem menu
        do {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Seluruh Data");
            System.out.println("3. Urutkan Usia (ASC) - Bubble Sort");
            System.out.println("4. Urutkan Usia (DESC) - Selection/Insertion Sort");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = sc.nextInt();
            sc.nextLine(); // Bersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode: ");
                    String kode = sc.nextLine();

                    System.out.print("Masukkan nama: ");
                    String nama = sc.nextLine();

                    // Translasi String ke Boolean agar tidak error
                    System.out.print("Masukkan jenis kelamin (l/p): ");
                    String jkInput = sc.nextLine();
                    boolean jenisKelamin = false; // Default perempuan
                    if (jkInput.equalsIgnoreCase("L")) {
                        jenisKelamin = true;
                    }

                    System.out.print("Masukkan usia: ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    Dosen12 dsnBaru = new Dosen12(kode, nama, jenisKelamin, usia);
                    list.tambah(dsnBaru);
                    System.out.println("Data berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("\n-- Data Dosen --");
                    list.tampil();
                    break;

                case 3:
                    System.out.println("\n-- Data setelah Sorting (Usia Termuda ke Tertua) --");
                    list.SortingASC();
                    list.tampil();
                    break;

                case 4:
                    System.out.println("\n-- Data setelah Sorting (Usia Tertua ke Termuda) --");
                    list.insertionSort(); // Kamu bisa ganti pakai sortingDSC()
                    list.tampil();
                    break;

                case 5:
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Masukkan angka 1-5.");
            }
        } while (pilihan != 5);

        sc.close();
    }
}