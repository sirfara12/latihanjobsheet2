package sistemKR.mingguke4;

import java.util.Scanner;

public class pseudocodedanflowchart {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int r;
        double keliling, luas, phi=3.14;
        System.out.println("masukkan jari jari lingkaran: ");
        r=input.nextInt();
        keliling= 2*phi*r;
        luas=phi*r*r;
        System.out.println(keliling);
        System.out.println(luas);
    }
}
