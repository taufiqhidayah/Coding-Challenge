package Hackerank.Implementation;

import java.util.Scanner;

public class ServiceLane {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n,t;
        n=in.nextInt();
        t= in.nextInt();
        int[] arrLane = new int[n];
        int[][] arrInpLane = new int[n][n];
        for (int i =0;i<n;n++){
            arrLane[i]= in.nextInt();
        }

        for(int i =0; i<t;i++){

            for(int j =0; j<t;j++){
                System.out.println("*");
            }
        }

    }
}
