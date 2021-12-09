package searching;
import java.util.Scanner;


public class sequentialSearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, x;
        System.out.print("Masukkan n! ");
        n = s.nextInt();
        int array[] = new int[n];
        System.out.println("Masukkan angka!");
        for(int i = 0; i<array.length; i++){
            array[i] = s.nextInt();
        }
        System.out.println("Masukkan angka yang dicari!");
        x = s.nextInt();
        sequentialSearch(array, x);
    }

    public static void sequentialSearch(int array[], int x){
        int jumlah = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i] == x){
                jumlah++;
            }
        }

        if(jumlah>0){
            System.out.println("Ketemu, ada " + jumlah + " angka " + x);
        }
        else{
            System.out.println("Tidak Ketemu");
        }
    }
    
}
