package Hackerank;


import java.util.Scanner;

public class Diagonal {
    public static void main(String[] args) {
        int n, d1 = 0, d2 = 0, rest;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int[][] arry = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arry[i][j] = scanner.nextInt();


            }
        }
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
//                System.out.print(arry[i][j]);
            }
//            System.out.print('\n');
        }
//        System.out.println("hasilnya ");
        for (int i = 0; i < n; i++) {

            d1+=arry[i][i];

        }
//        System.out.println(d1);
        int a=0;
        for (int i =n-1; i >=0 ; i--) {


            d2 += arry[i][a];
            ++a;


        }
//        System.out.println(d2);
        int hasil= d1-d2;

        if (hasil <0)
            System.out.println(-(d1-d2));
        else
            System.out.println(d1-d2);
    }
}

