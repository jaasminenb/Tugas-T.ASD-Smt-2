public class Dosen11 {
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    public Dosen12(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil(){
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);

        String genderText = (jenisKelamin) ? "Laki-laki" : "Perempuan";
        System.out.println("Jenis Kelamin: " + genderText);
        
        System.out.println("Usia: "+ usia);
    }
}