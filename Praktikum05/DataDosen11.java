public class DataDosen11 {

    Dosen12[] listDosen; // Mengikuti kontrak Class Diagram
    int idx = 0;

    DataDosen12(int kuota) {
        listDosen = new Dosen12[kuota];
        idx = 0;
    }

    void tambah(Dosen12 dsn) {
        if (idx < listDosen.length) {
            listDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            listDosen[i].tampil();
            System.out.println("--------------------------------------");
        }
    }

    void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (listDosen[j].usia < listDosen[j - 1].usia) {
                    Dosen12 tmp = listDosen[j];
                    listDosen[j] = listDosen[j - 1];
                    listDosen[j - 1] = tmp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) {
                if (listDosen[j].usia > listDosen[idxMax].usia) {
                    idxMax = j;
                }
            }
            Dosen12 tmp = listDosen[idxMax];
            listDosen[idxMax] = listDosen[i];
            listDosen[i] = tmp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen12 temp = listDosen[i];
            int j = i;
            while (j > 0 && listDosen[j - 1].usia < temp.usia) {
                listDosen[j] = listDosen[j - 1];
                j--;
            }
            listDosen[j] = temp;
        }
    }
}