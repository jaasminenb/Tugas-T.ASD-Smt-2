public class AntrianKRS {
    Mahasiswa[] data;
    int front, rear, size, max;
    int sudahDiproses; // Variabel tambahan untuk mencatat jumlah mahasiswa yang sudah KRS
    final int KUOTA_DPA = 30; // Batas maksimal DPA menangani mahasiswa

    public AntrianKRS(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.sudahDiproses = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        if (!isEmpty()) {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void tambahAntrian(Mahasiswa mhs) {
        // Cek kuota DPA keseluruhan
        if (sudahDiproses + size >= KUOTA_DPA) {
            System.out.println("Mohon maaf, kuota DPA sudah penuh (Maks " + KUOTA_DPA + " mahasiswa).");
            return;
        }
        if (isFull()) {
            System.out.println("Antrian saat ini penuh (Maks 10). Silakan tunggu.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk antrian KRS.");
    }

    // Method khusus memanggil 2 mahasiswa sekaligus
    public void prosesKRS() {
        if (isEmpty()) {
            System.out.println("Tidak ada mahasiswa dalam antrian.");
            return;
        }
        
        System.out.println("=== PEMANGGILAN PROSES KRS ===");
        // Panggil mahasiswa pertama
        System.out.println("1. Melayani: " + data[front].nama);
        front = (front + 1) % max;
        size--;
        sudahDiproses++;

        // Jika masih ada mahasiswa di antrian, panggil mahasiswa kedua
        if (!isEmpty()) {
            System.out.println("2. Melayani: " + data[front].nama);
            front = (front + 1) % max;
            size--;
            sudahDiproses++;
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Antrian Mahasiswa:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void lihatDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Antrian Terdepan:");
        System.out.print("1. "); data[front].tampilkanData();
        
        if (size > 1) {
            int indexKedua = (front + 1) % max;
            System.out.print("2. "); data[indexKedua].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Antrian Paling Belakang: ");
            data[rear].tampilkanData();
        }
    }

    public void infoKRS() {
        System.out.println("=== INFO STATISTIK KRS ===");
        System.out.println("Jumlah Antrian Saat Ini (Belum KRS) : " + size);
        System.out.println("Jumlah Mahasiswa Sudah Proses KRS   : " + sudahDiproses);
        System.out.println("Sisa Kuota DPA                      : " + (KUOTA_DPA - (sudahDiproses + size)));
    }
}