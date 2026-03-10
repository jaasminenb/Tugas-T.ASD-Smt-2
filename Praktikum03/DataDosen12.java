public class DataDosen12 {
    public void dataSemuaDosen(Dosen12[] arrayOfDosen) {
        System.out.println("\n======= DATA SELURUH DOSEN =======");
        for (Dosen12 dosen : arrayOfDosen) {
            System.out.println("Kode          : " + dosen.kode);
            System.out.println("Nama          : " + dosen.nama);
            System.out.println("Jenis Kelamin : " + dosen.jenisKelamin);
            System.out.println("Usia          : " + dosen.usia);
            System.out.println("----------------------------------");
        }
    }
    public void jumlahDosenPerJenisKelamin(Dosen12[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen12 d : arrayOfDosen) {
            if (d.jenisKelamin.equalsIgnoreCase("Pria") || d.jenisKelamin.equalsIgnoreCase("Laki-laki")) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }
    public void rerataUsiaDosenPerJenisKelamin(Dosen12[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0, countPria = 0, countWanita = 0;
        for (Dosen12 d : arrayOfDosen) {
            if (d.jenisKelamin.equalsIgnoreCase("Pria") || d.jenisKelamin.equalsIgnoreCase("Laki-laki")) {
                totalPria += d.usia;
                countPria++;
            } else {
                totalWanita += d.usia;
                countWanita++;
            }
        }
        System.out.println("Rata-rata Usia Pria   : " + (countPria > 0 ? (double)totalPria/countPria : 0));
        System.out.println("Rata-rata Usia Wanita : " + (countWanita > 0 ? (double)totalWanita/countWanita : 0));
    }
    public void infoDosenPalingTua(Dosen12[] arrayOfDosen) {
        Dosen12 tertua = arrayOfDosen[0];
        for (Dosen12 d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }
        System.out.println("Dosen Ter-Tua  : " + tertua.nama + " (Usia: " + tertua.usia + ")");
    }
    public void infoDosenPalingMuda(Dosen12[] arrayOfDosen) {
        Dosen12 termuda = arrayOfDosen[0];
        for (Dosen12 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }
        System.out.println("Dosen Ter-Muda : " + termuda.nama + " (Usia: " + termuda.usia + ")");
    }
}