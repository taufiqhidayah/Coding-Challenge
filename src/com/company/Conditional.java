package com.company;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = a * b;
        switch (c % 2) {
            case 0:
                System.out.println("genap");
                break;
            default:
                System.out.println("ganjil");
                break;
        }
    }
}
