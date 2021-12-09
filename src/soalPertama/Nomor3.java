package soalPertama;

public class Nomor3 {
    public static void main(String[] args){
        int [] A = {8,3,7,5,9,5,6,7,8,2,3};
        int k, tampung;
        for(int i = 0; i<A.length-1; i++){
            k = i;
            for(int j = i+1; j<A.length; j++){
                if(A[j]>A[k]){
                    k = j;
                }
            }
            tampung = A[k];
            A[k] = A[i];
            A[i] = tampung;

            
        }

        for(int i = 0; i<A.length; i++){
            System.out.print(A[i] + " ");
        }
    }
}

