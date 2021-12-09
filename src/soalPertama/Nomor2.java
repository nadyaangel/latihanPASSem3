package soalPertama;
import java.util.Scanner;


public class Nomor2 {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa(1, "Anna", "Informasi", 3.9f);
        
        Mahasiswa mahasiswa2 = new Mahasiswa();
        System.out.println();

        mahasiswa1.TampilData();
        System.out.println();
        mahasiswa2.BacaData();

        System.out.println("\nHasil: ");
        mahasiswa2.TampilData();
    }
}

class Mahasiswa{
    private int NIM;
    private String Nama;
    private String jurusan;
    private float IPK;

    //konstruktor default
    public Mahasiswa(){
        this.NIM = 0;
        this.Nama = Nama;
        this.jurusan = jurusan;
        this.IPK = 0;
    }

    //konstruktor dengan parameter
    public Mahasiswa(int newNIM, String newNama, String newJurusan, float newIPK){
        this.NIM = newNIM;
        this.Nama = newNama;
        this.jurusan = newJurusan;
        this.IPK = newIPK;
    }

    //Setter
    public void setNIM(int newNIM){
        this.NIM = newNIM;
    }

    public void setNama(String newNama){
        this.Nama = newNama;
    }

    public void setJurusan(String newJurusan){
        this.jurusan = newJurusan;
    }

    public void setIPK(float newIPK){
        this.IPK = newIPK;
    }

    //Getter
    public int getNIM(){
        return this.NIM;
    }

    public String getNama(){
        return this.Nama;
    }

    public String getJurusan(){
        return this.jurusan;
    }

    public float getIPK(){
        return this.IPK;
    }

    public void BacaData(){
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan data diri! ");
        System.out.print("Nama : ");
        String newNama = s.next();
        this.Nama = newNama;
        System.out.print("NIM : ");
        int newNIM = s.nextInt();
        this.NIM = newNIM;
        System.out.print("Jurusan : ");
        String newJurusan = s.next();
        this.jurusan = newJurusan;
        System.out.print("IPK : ");
        float newIPK = s.nextFloat();
        this.IPK = newIPK;
    }

    public void TampilData(){
        System.out.println("NIM = " + this.NIM + "\nNama = " + this.Nama
        + "\nJurusan = " + this.jurusan + "\nIPK = " + this.IPK);
    }
}
