package Hackerank;

import java.util.Scanner;

public class MiniMxSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long max, min, sum;
        sum = max = min = 0 ;

        for(int i=1; i<5;i++){
            long temp = in.nextLong();
            sum += temp;
            if(max>temp){
                if(min > temp) {
                    min = temp;
                }
            } else {
                max = temp;
            }
        }

        System.out.print((sum -max) + " " + (sum - min));

    }
}
