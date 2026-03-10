public class Dosen12 {
    public String kode;
    public String nama;
    public String jenisKelamin;
    public int usia;

    public Dosen12(String kode, String nama, String jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }
}

DataDosen12 dataDosen = new DataDosen12();
        dataDosen.dataSemuaDosen(arrayOfDosen);
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.infoDosenPalingTua(arrayOfDosen);
        dataDosen.infoDosenPalingMuda(arrayOfDosen);
    