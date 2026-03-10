import java.util.Scanner;

public class DosenDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen12[] arrayOfDosen = new Dosen12[3];
        String kode, nama, jk, dummy;
        int usia;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            jk = sc.nextLine();
            System.out.print("Usia          : ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("------------------------------");

            arrayOfDosen[i] = new Dosen12(kode, nama, jk, usia);
        }

        System.out.println("\n======= DAFTAR DOSEN =======");
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            System.out.println("Kode          : " + arrayOfDosen[i].kode);
            System.out.println("Nama          : " + arrayOfDosen[i].nama);
            System.out.println("Jenis Kelamin : " + arrayOfDosen[i].jenisKelamin);
            System.out.println("Usia          : " + arrayOfDosen[i].usia);
            System.out.println("------------------------------");
        }
    }
}