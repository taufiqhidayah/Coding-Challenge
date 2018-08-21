package com.company;

import java.util.Scanner;

public class ForConditional {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        for (int i = 0; i<n; i++){
            if (i%2 ==0){
                System.out.println("Bilangan "+i+"Genap");
            }else{
                System.out.println("Bilangan "+i+"Ganjil");
            }

        }
    }
}
