public class QueueLinkedList {
    Node head, tail;
    int size;
    int max;

    public QueueLinkedList(int max) {
        this.max = max;
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    // Cek antrian kosong
    public boolean isEmpty() {
        return size == 0;
    }

    // Cek antrian penuh
    public boolean isFull() {
        return size == max;
    }

    // Mengosongkan antrian
    public void clear() {
        head = tail = null;
        size = 0;
        System.out.println("Semua antrian telah dikosongkan.");
    }

    // Menambahkan antrian (Masuk dari belakang / enqueue)
    public void enqueue(Mahasiswa dt) {
        if (isFull()) {
            System.out.println("Mohon maaf, kapasitas antrian sedang penuh.");
            return;
        }
        
        Node newNode = new Node(dt, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        System.out.println("Mahasiswa a.n " + dt.nama + " berhasil masuk ke antrian.");
    }

    // Memanggil antrian (Keluar dari depan / dequeue)
    public Mahasiswa dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada mahasiswa yang bisa dipanggil.");
            return null;
        }
        
        Mahasiswa dt = head.data;
        head = head.next;
        size--;
        
        // Jika setelah dipanggil antrian jadi kosong, tail juga harus di-null-kan
        if (isEmpty()) {
            tail = null; 
        }
        return dt;
    }

    // Menampilkan antrian terdepan dan paling akhir
    public void printFrontBack() {
        if (isEmpty()) {
            System.out.println("Antrian saat ini masih kosong.");
        } else {
            System.out.println("\n--- Antrian Terdepan ---");
            head.data.tampilkanData();
            
            System.out.println("--- Antrian Paling Akhir ---");
            tail.data.tampilkanData();
        }
    }

    // Menampilkan jumlah mahasiswa yang masih mengantre
    public void printSize() {
        System.out.println("Jumlah mahasiswa yang masih mengantre: " + size + " orang.");
    }
}