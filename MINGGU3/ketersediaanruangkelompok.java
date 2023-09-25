import java.util.Scanner;

public class ketersediaanruangkelompok {
    public static void main(String[] args) { 
         Scanner Scanner = new Scanner(System.in);
        //membuat input
        System.out.print("masukkan nama perwakilan : ");
        String namaperwakilan = Scanner.nextLine();
        System.out.print("masukkan nama ruangan : ");
        String ruangan = Scanner.nextLine();
        System.out.print("masukkan waktu (jam): ");
        int waktujam = (Scanner.nextInt());
        System.out.print("masukkan waktu (menit): ");
        int waktumenit = Scanner.nextInt();
        System.out.print("lama penggunaan ruangan(menit): ");
        int durasi = Scanner.nextInt();

        System.out.print("jumlah orang : ");
        int orang = Scanner.nextInt();
        boolean jumlahmaksimal = orang <= 30;

        //perhitungan
        int menitkeluar = waktumenit + durasi;
        int jam,menit;
        if (menitkeluar > 60); {
            jam = menitkeluar / 60;
            jam = jam + waktujam;
            menit = menitkeluar % 60;

        } else {
            jam = waktujam;
            menit = menitkeluar;
        }
                                
        //membuat printoutnya
        System.out.print("atas nama : " + namaperwakilan);
        System.out.print("\nmenggunakan ruangan : " + ruangan);
        System.out.print("\ndengan jumlah orang :" + orang + "/" + jumlahmaksimal);
        System.out.print("\nkalian masuk pada pukul: " + waktujam + ":" + waktumenit);
        System.out.print("\nkalian keluar pukul: " + jam + ":" + menit);

        Scanner.close();
    }        
}
