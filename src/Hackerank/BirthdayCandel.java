package Hackerank;

import java.util.Random;
import java.util.Scanner;

public class BirthdayCandel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int tallest = 0;
        int frequency = 0;


        for(int i=0; i < n; i++){
            int height = in.nextInt();

            if(height > tallest){
                tallest = height;
                frequency = 1;
            }
            else if(height == tallest) frequency++;
        }
        System.out.println(frequency);
//        int n;
//        Scanner scanner = new Scanner(System.in);
//        n = scanner.nextInt();
//        int[] val= new int[n];
//        for (int i= 0; i<n;i++){
//            val[i]= scanner.nextInt();
//        }
//        int j = 0;
//        Random random = new Random();
//        for (int i= 0; i<n;i++){
//            j=random.nextInt(val[i]);
//        }
//        System.out.println(j);
    }
}
