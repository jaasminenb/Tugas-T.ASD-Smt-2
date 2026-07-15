package minggu5;

public class faktorial {

    int FaktorialBF(int n){
        int faktor = 1;
        for (int i=1; i<=n; i++){
            faktor = faktor * i;
        }
        return faktor;
    }

    int FaktorialDC(int n){
        if(n==1){
            return 1;
        } else {
            int faktor = n * FaktorialDC(n-1);
            return faktor;
        }
    }
    
}