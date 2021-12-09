package sorting;
import java.util.Scanner;
public class selectionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("Masukkan n! ");
        n = s.nextInt();
        int array[] = new int[n];
        System.out.println("Masukkan angka!");
        for(int i = 0; i<array.length; i++){
            array[i] = s.nextInt();
        }

        System.out.println();
        System.out.println("Setelah diurutkan: ");
        selectionSort(array);
    } 

    public static void selectionSort(int array []){
        int min, temp;
        for(int i = 0; i<array.length-1; i++){
            min = i;
            for(int j = i+1; j<array.length; j++){
                if(array[j]>array[min]){
                    min = j;
                }
            }
            temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }

        for(int i = 0;i <array.length; i++){
            System.out.print(array[i] + " ");
        }
 


    }
    
}
