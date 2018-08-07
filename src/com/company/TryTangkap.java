package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryTangkap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer a;
        boolean salah=false;
        do {
            try {
                a=scanner.nextInt();
                salah=true;
            }catch (InputMismatchException e){
                System.out.println("Error");
                scanner.nextLine();
            }
        }while (salah==false);
    }
}
