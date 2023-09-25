package sistemKR.mingguke4;

import java.util.Scanner;

import javax.swing.text.html.StyleSheet;

public class gaji28 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int jmlmasuk, jmltdkmasuk, totgaji;
        int gaji;
        int potgaji;

        System.out.println("masukkan jumlah hari masuk kerja anda");
        jmlmasuk=input.nextInt();
        System.out.println("masukkan jumlah haritidak masuk kerja ");
        jmltdkmasuk=input.nextInt();
        System.out.print("masukkan gaji");
        gaji=input.nextInt();
        System.out.print("masukkan potongan gaji");
        potgaji= input.nextInt();

        totgaji=(jmlmasuk*gaji)-(jmltdkmasuk*potgaji);
        System.out.println("gaji yang anda terima adalah " +totgaji);

        
    }
}
