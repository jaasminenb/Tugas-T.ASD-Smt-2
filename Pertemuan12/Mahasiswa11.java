public class Mahasiswa11 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa12(){}

    public Mahasiswa12(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi(){
        System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
    }
}