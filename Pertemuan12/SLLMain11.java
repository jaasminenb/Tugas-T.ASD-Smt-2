public class SLLMain11 {
    public static void main(String[] args){
        SingleLinkedList12 sll = new SingleLinkedList12();

        // 1. Pembuatan 4 objek mahasiswa (Sesuai Praktikum 2.1)
        // Format parameter: (NIM, Nama, Kelas, IPK)
        Mahasiswa12 mhs1 = new Mahasiswa12("24212200", "Alvaro", "1A", 3.8);
        Mahasiswa12 mhs2 = new Mahasiswa12("23212201", "Bimon", "2B", 3.8);
        Mahasiswa12 mhs3 = new Mahasiswa12("22212202", "Cintia", "3C", 3.5);
        Mahasiswa12 mhs4 = new Mahasiswa12("21212203", "Dirga", "4D", 3.6);

        // 2. Skenario Penambahan Data (Dari halaman 4)
        sll.print();
        sll.addFirst(mhs4); // Menambah Dirga
        sll.print();
        sll.addLast(mhs1);  // Menambah Alvaro di belakang
        sll.print();
        
        // Menyisipkan Cintia setelah Dirga, dan Bimon di indeks 2
        sll.insertAfter("Dirga", mhs3); 
        sll.insertAt(2, mhs2);          
        sll.print();

        System.out.println("=====================================");

        // 3. Skenario Pengaksesan dan Penghapusan (KODE DARI GAMBARMU)
        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst(); // Menghapus elemen paling depan (Dirga)
        sll.removeLast();  // Menghapus elemen paling belakang (Alvaro)
        sll.print();       // Sisa: Cintia dan Bimon
        
        sll.removeAt(0);   // Menghapus elemen indeks 0 (Cintia)
        sll.print();       // Sisa: Bimon
    }
}