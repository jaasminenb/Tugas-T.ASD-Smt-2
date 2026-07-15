import java.util.Scanner;

public class MahasiswaDemo11 {
    public static void main(String[] args) {
        StackTugasMahasiswa12 stack = new StackTugasMahasiswa12(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do { 
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Orang yang pertama menyelesaikan tugas");
            System.out.println("6. Melihat Berapa tugas yang kekumpul.");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();

                    Mahasiswa12 mhs = new Mahasiswa12(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa12 dinilai = stack.pop();
                    if (dinilai != null){
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai dari 0-100: ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa12 lihat = stack.peek();
                    if (lihat != null){
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    Mahasiswa12 pertama = stack.lihatDataPertama();
                    if (pertama != null){
                        System.out.println("Orang yang pertama adalah " + pertama.nama);
                    }
                    break;
                case 6:
                    int data = stack.lihatTugasKekumpul();
                    System.out.println("Tugas yang sudah terkumpul adalah " + data);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 6);
    }
}