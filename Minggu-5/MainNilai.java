package minggu5;

public class MainNilai {
    
    static int cariMaxUTS(Nilai[] arr, int l, int r){
        if(l == r) return arr[l].nilaiUTS;
        if(l==r-1) return Math.max(arr[l].nilaiUTS, arr[r].nilaiUTS);

        int mid = (l+r)/2;
        int maxkiri = cariMaxUTS(arr, l, mid);
        int maxkanan = cariMaxUTS(arr, mid+1, r);
        return Math.max(maxkiri, maxkanan);
    }

    static int cariMinUTS(Nilai[] arr, int l, int r){
        if(l == r) return arr[l].nilaiUTS;
        if(l==r-1) return Math.min(arr[l].nilaiUTS, arr[r].nilaiUTS);

        int mid = (l+r)/2;
        int minkiri = cariMinUTS(arr, l, mid);
        int minkanan = cariMinUTS(arr, mid+1, r);
        return Math.min(minkiri, minkanan);
    }

    static double rataUAS(Nilai[] arr){
        double total = 0;
        for (int i = 0; i < arr.length; i++){
            total += arr[i].nilaiUAS;
        }
        return total/arr.length;
    }

    public static void main(String[] args) {
        Nilai[] daftarMhs = {
            new Nilai("Ahmad", "220101001", 2022, 78, 82),
            new Nilai("Budi", "220101002", 2022, 85, 88),
            new Nilai("Cindy", "220101003", 2021, 90, 87),
            new Nilai("Dian", "220101004", 2021, 76, 79),
            new Nilai("Eko", "220101005", 2023, 92, 95),
            new Nilai("Fajar", "220101006", 2020, 88, 85),
            new Nilai("Gina", "220101007", 2023, 80, 83),
            new Nilai("Hadi", "220101008", 2020, 82, 84)
        };

        int jumlahData = daftarMhs.length;

        System.out.println("--- HASIL EVALUASI NILAI ---");

        int maxuts = cariMaxUTS(daftarMhs, 0, jumlahData-1);
        System.out.println("a) Nilai UTS Tertinggi (D&C) : " + maxuts);

        int minuts = cariMinUTS(daftarMhs, 0, jumlahData-1);
        System.out.println("a) Nilai UTS Terendah (D&C) : " + minuts);

        double rata = rataUAS(daftarMhs);
        System.out.println("a) Nilai rata-rata UAS (BF) : " + rata);
    }
}