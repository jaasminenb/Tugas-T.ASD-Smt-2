import java.util.Scanner;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);
        int jmlmhs;
        
        System.out.println("=== SELAMAT DATANG DI PENDATAAN MAHASISWA BERPRESTASI ===");
        
        System.out.print("Berapa mahasiswa yang akan anda masukkan? ");
        jmlmhs = sc.nextInt();
        sc.nextLine();
        
        MahasiswaBerprestasi12 list = new MahasiswaBerprestasi12(jmlmhs);

        for (int i = 0; i < jmlmhs; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            
            System.out.print("Masukkan nim: ");
            String nim = sc.nextLine();
            System.out.print("Masukkan nama: ");
            String nama = sc.nextLine();
            System.out.print("Masukkan kelas: ");
            String kelas = sc.nextLine();
            System.out.print("Masukkan ipk: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa12 mhsBaru = new Mahasiswa12(nim, nama, kelas, ipk);
            list.tambah(mhsBaru);
        }

        System.out.println("\nData mahasiswa sebelum sorting");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();

        sc.close();
    }
}