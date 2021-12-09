package searching;
import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, x;
        // System.out.print("Masukkan n! ");
        // n = s.nextInt();
        // int array[] = new int[n];
        // System.out.println("Masukkan angka!");
        // for(int i = 0; i<array.length; i++){
        //     array[i] = s.nextInt();
        // }
        // System.out.println("Masukkan angka yang dicari!");
        // x = s.nextInt();
        // binarySearch(array, x);
        // System.out.println();
        // System.out.println();
        // int result = binarySearch(array, x);
        // if(result == -1){
        //     System.out.println("Data tidak ditemukan");
        // }
        // else{
        //     System.out.println("Data ditemukan pada indeks ke " + result);
        // }

        //Untuk binary search string

        System.out.println();
        String []kata = {"Baju kotor", "gelang", "minyak wangi", "gantungan kunci"};
        String Cari = "minyak wangi";
        int result2 = binarySearchString(kata, Cari);
        if(result2 == -1){
            System.out.println("Data tidak ditemukan");
        }
        else{
            System.out.println("Data ditemukan pada indeks ke " + result2);
        }
    }

    public static int binarySearch(int [] array, int x){
        int idx = -1;
        int first = 0;
        int last = array.length-1;

        while(first<= last){
            int mid = (first + last)/2;
            if(array[mid] == x){
                idx = mid;
                break;
            }
            else if(array[mid]<x){
                first = mid+1;
            }
            else{
                last = mid-1;
            }
        }
        return idx;
    }

    public static int binarySearchRec(int array[], int first, int last, int x){
      if(last>= first){
          int mid = first + (last - first);
          if(array[mid] == x)
          return mid;

          if(array[mid] > x)
          return binarySearchRec(array, first, mid-1, x);

          return binarySearchRec(array, mid+1, last, x);
      }  
      return -1;
    }

    public static int binarySearchString(String[] kata, String x) {
        int first = 0;
        int last = kata.length-1;

        while(first <= last){
            int mid = (first + last)/2;
            int idx = x.compareTo(kata[mid]);

            if(idx == 0){
                return mid;
            }
            else if(idx > 0){
                first = mid+1;
            }
            else{
                last = mid-1;
            }
        }
        return -1;
    }
    
}

