import java.util.Scanner;

public class SuratDemo11 {
    public static void main(String[] args) {
        StackSurat12 stackSurat = new StackSurat12(20); 
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n=== Menu Pengelolaan Surat Izin ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat (Berdasarkan Nama)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = scan.nextInt();
            scan.nextLine(); // clear buffer

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan ID Surat: ");
                    String id = scan.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Masukkan Jenis Izin (S untuk Sakit / I untuk Izin lain): ");
                    char jenis = scan.nextLine().charAt(0);
                    System.out.print("Masukkan Durasi (hari): ");
                    int durasi = scan.nextInt();
                    scan.nextLine(); // clear buffer

                    Surat12 suratBaru = new Surat12(id, nama, kelas, jenis, durasi);
                    stackSurat.push(suratBaru);
                    break;

                case 2:
                    Surat12 diproses = stackSurat.pop();
                    if (diproses != null) {
                        System.out.println("Surat berhasil diproses!");
                        System.out.println("Memproses surat dari: " + diproses.namaMahasiswa + " (ID: " + diproses.idSurat + ")");
                    }
                    break;

                case 3:
                    Surat12 teratas = stackSurat.peek();
                    if (teratas != null) {
                        System.out.println("Surat izin teratas (terakhir masuk) adalah dari: " + teratas.namaMahasiswa);
                        System.out.println("ID: " + teratas.idSurat + " | Izin: " + teratas.jenisIzin + " selama " + teratas.durasi + " hari.");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa yang ingin dicari: ");
                    String cariNama = scan.nextLine();
                    stackSurat.cariSurat(cariNama);
                    break;

                case 5:
                    System.out.println("Keluar dari program pengelolaan surat.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih 1-5.");
            }
        } while (pilih != 5);

        scan.close();
    
    }
}