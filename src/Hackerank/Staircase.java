package Hackerank;

import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N;
        N = in.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
//                if (j < N - 1 - i) {
//                    System.out.print(" ");
//                } else {
                    System.out.print("#");
//                }
            }
            System.out.println("*");
        }
    }
}
