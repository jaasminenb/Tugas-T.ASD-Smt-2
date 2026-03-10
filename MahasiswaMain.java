import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jml = sc.nextInt();
        sc.nextLine(); 


        Mahasiswa[] arrayMhs = new Mahasiswa[jml];

        for (int i = 0; i < arrayMhs.length; i++) {
            arrayMhs[i] = new Mahasiswa(); 
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan Nama          : ");
            arrayMhs[i].nama = sc.nextLine();
            System.out.print("Masukkan NIM           : ");
            arrayMhs[i].nim = sc.nextLine();
            System.out.print("Masukkan Jenis Kelamin : ");
            arrayMhs[i].jenisKelamin = sc.next().charAt(0);
            System.out.print("Masukkan IPK           : ");
            arrayMhs[i].ipk = sc.nextDouble();
            sc.nextLine(); 
            System.out.println();
        }

        double totalIpk = 0;
        System.out.println("-----------------------------------");
        for (int i = 0; i < arrayMhs.length; i++) {
            arrayMhs[i].tampilkanData(i);
            totalIpk += arrayMhs[i].ipk;
            System.out.println("-----------------------------------");
        }

        double rataRata = totalIpk / jml;
        System.out.printf("Rata-rata IPK Mahasiswa: %.2f\n", rataRata);
        
        sc.close();
    }
}