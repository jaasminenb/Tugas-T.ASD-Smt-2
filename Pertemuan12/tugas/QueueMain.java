import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan kapasitas maksimal antrian layanan: ");
        int kapasitas = sc.nextInt();
        sc.nextLine(); // Bersihkan buffer

        QueueLinkedList antrian = new QueueLinkedList(kapasitas);
        int menu;

        do {
            System.out.println("\n=== LAYANAN UNIT KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian (Mendaftar)");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Cek Antrian Terdepan & Terakhir");
            System.out.println("4. Cek Jumlah Antrian");
            System.out.println("5. Kosongkan Semua Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Keperluan: ");
                    String keperluan = sc.nextLine();
                    
                    Mahasiswa mhsBaru = new Mahasiswa(nim, nama, keperluan);
                    antrian.enqueue(mhsBaru);
                    break;
                
                case 2:
                    Mahasiswa dipanggil = antrian.dequeue();
                    if (dipanggil != null) {
                        System.out.println("\n>> MEMANGGIL ANTRIAN <<");
                        System.out.println("Silakan menuju loket: " + dipanggil.nama + " (" + dipanggil.keperluan + ")");
                    }
                    break;
                
                case 3:
                    antrian.printFrontBack();
                    break;
                
                case 4:
                    antrian.printSize();
                    break;
                
                case 5:
                    antrian.clear();
                    break;
                
                case 0:
                    System.out.println("Keluar dari sistem layanan...");
                    break;
                
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (menu != 0);

        sc.close();
    }
}