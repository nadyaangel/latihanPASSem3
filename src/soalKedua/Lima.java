package soalKedua;
import java.util.Scanner;



public class Lima {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         System.out.println("Pilih y atau t! ");
         System.out.print("Apakah hari ini cerah?");
         String cerah = s.next();
         int jawaban;

         if(cerah == "Y" || cerah == "y"){
             System.out.println("Tidak bawa payung");
         }
         else{
             System.out.println(
            "Apakah hari ini : ");
            System.out.println("1. Mendung \n2. Hujan Ringan \n3. Hujan Deras");
            jawaban = s.nextInt();
            if(jawaban == 1){
                System.out.println("Bawa payung");
            }
            else if(jawaban == 2){
                System.out.println("Bawa payung dan pakai jaket");
            }
            else if(jawaban == 3){
                System.out.println("Tidak jadi keluar rumah");
            }
            else{
                System.out.println("Input salah");
            }
         }


    }
}
