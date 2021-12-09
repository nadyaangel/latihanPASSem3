package soalKedua;

public class Satu {
    
    //Code
    public static void main(String[] args){
        int x = -9;
        boolean positif = true;
        if(x < 0){
            positif = false;
        }
        else{
            positif = true;
        }

        System.out.println(positif);
    }
}

//Pseudocode

/* 
program cek_positif_negatif

deklarasi
x : integer
positif : boolean
    positif <- true 

algoritma: 
INPUT x
IF(x<0) THEN
    positif <- false 
ELSE 
    positif <- true 

print(positif)  

*/
