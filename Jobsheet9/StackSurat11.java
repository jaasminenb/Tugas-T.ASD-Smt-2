public class StackSurat11 {
    Surat12[] stack;
    int top;
    int size;

    public StackSurat12(int size) {
        this.size = size;
        stack = new Surat12[size];
        top = -1;
    }

    public boolean isFull(){
        return top == size - 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(Surat12 surat){
        if(!isFull()){
            top++;
            stack[top] = surat;
            System.out.println("Surat berhasil diterima dan dimasukkan ke tumpukan.");
        } else {
            System.out.println("Kapasitas penuh!");
        }
    }

    public Surat12 pop(){
        if(!isEmpty()){
            Surat12 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Tumpukan kosong! Tidak ada surat yang bisa diproses..");
            return null;
        }
    }

    public Surat12 peek(){
        if (!isEmpty()){
            return stack[top];
        } else{
            System.out.println("Tumpukan kosong.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--){
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)){
                System.out.println("\nSurat ditemukan pada tumpukan ke-" + (top - i + 1) + " (dari atas):");
                System.out.println("ID Surat: " + stack[i].idSurat);
                System.out.println("Nama    : " + stack[i].namaMahasiswa);
                System.out.println("Kelas   : " + stack[i].kelas);
                System.out.println("Izin    : " + (stack[i].jenisIzin == 'S' ? "Sakit" : "Izin Lainnya"));
                System.out.println("Durasi  : " + stack[i].durasi + " hari");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan){
            System.out.println("Surat izin atas nama " + nama + " tidak ditemukan di dalam tumpukan");
        }
    }
}