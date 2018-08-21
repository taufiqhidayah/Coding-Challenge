package com.company;

import java.util.Scanner;

public class LoopWh {

    public static void main(String[] args) {
        int n = 0;
        int i=1;
        Scanner scanner= new Scanner(System.in);
        while (n!=3){
            n =scanner.nextInt();
            System.out.println("lanjut"+i);
            i++;
        }
    }

}
