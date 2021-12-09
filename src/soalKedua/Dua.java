package soalKedua;

public class Dua {
    public static void main(String[] args) {
        int array [] = new int[10];

        for(int i = 1; i<=10; i++){
            array[i] = i;
            if(i%2 != 0){
                array[i] = i + 10;
            }
            System.out.print(array[i] + " ");
        } 
     
    }
}

//Pseudocode

/*
program printarray

deklarasi
x : array integer[10]

algoritma:

FOR i <- 1 to 10 
    array[i] <- i
    IF (i%2 != 0) THEN
    array[i] <- i+10

    PRINT(array[i])

*/