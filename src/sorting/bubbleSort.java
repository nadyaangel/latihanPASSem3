package sorting;
import java.util.Scanner;

public class bubbleSort {
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
        bubbleSort(array);
        for(int i = 0;i <array.length; i++){
            System.out.print(array[i] + " ");
        }
        // Untuk yang kata

        String [] kata = {"Randy Martin" , "Ranty Maria", "Amanda Manopo",
                            "Arya Saloka", "Verrel Bramasta", "Anrez Anzelio"};
        bubbleSortStrings(kata);
        System.out.println();
        System.out.println("Setelah diurutkan:");
        for(int i = 0;i <kata.length; i++){
            System.out.print(kata[i] + " ");
        }

        //Untuk yang char
        char [] karakter = {'A', 'B', 'Z', 'N', 'U'};
        bubbleSortChar(karakter);
        for(int i = 0;i <karakter.length; i++){
            System.out.print(karakter[i] + " ");
        }
    }

    public static int [] bubbleSort(int [] array){
        int temp;
        for(int i = 0; i<array.length; i++){
            for(int j = i+1; j<array.length; j++){
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;

    }

    public static String [] bubbleSortStrings(String[] array){
        String temp;
        for(int i = 0; i<array.length; i++){
            for(int j = i+1; j<array.length; j++){
                if(array[i].compareToIgnoreCase(array[j])>0){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static char [] bubbleSortChar(char[] array){
        char temp;
        // char [] x = new char[array.length];

        // for(int i = 0; i<array.length; i++){
        //     x[i] = array.toUpperCase();
        // }
        for(int i = 0; i<array.length; i++){
            for(int j = i+1; j<array.length; j++){
                if(array[i] >array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
