package searching;
import java.util.Scanner;
public class sequentialVokalKonsonan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan kata");
        String kata = s.nextLine();
        cariVokalKonsonan(kata);
        
    }

    public static void cariVokalKonsonan(String kata){
        Scanner s = new Scanner(System.in);
        char [] huruf = new char[kata.length()];
        int vokal = 0;
        int konsonan = 0;

        for(int i = 0; i<huruf.length; i++){
            huruf[i] = Character.toLowerCase(kata.charAt(i));
        }

        for(int i = 0; i<huruf.length; i++){
            if(huruf[i] == 'a' || huruf[i] == 'i' || huruf[i] == 'u'
            || huruf[i] == 'e' || huruf[i] == 'o'){
            vokal++;
            }
            else{
                konsonan++;
            }
        }
        System.out.println(
            "Ada " + vokal + " huruf vokal dan " + konsonan + " huruf konsonan"
        );
    }

}
