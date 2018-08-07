package Hackerank;

import java.util.Scanner;

public class FindAsianGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer x,z,hasil=2018;
        x= scanner.nextInt();
        z=18-x;
        for (int i=1; i<=z; i++){
            hasil = hasil-4;
        }
        if (x==1){
            System.out.println(hasil+1);
        }else {
            System.out.println(hasil);
        }
    }
}
