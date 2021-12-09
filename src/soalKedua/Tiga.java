package soalKedua;

public class Tiga {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for(int j = i; j<5; j++){
                if(i%2 == 0){
                    System.out.print("#");
                }
                else if(i%2 != 0){
                    System.out.print("&");
                }
            }
            System.out.println();
        }
    }
}

//Pseudocode

/*
program nested_loop

deklarasi:
i : integer
j : integer
i <- 0
j <- i

algoritma:
FOR i <- 0 to 5 
    FOR j <- i to 5
        IF (i % 2 = 0) THEN 
            PRINT(#)
        ELSE (i % 2 != 0) THEN 
            PRINT(&)    

        PRINT(\N)    

*/
