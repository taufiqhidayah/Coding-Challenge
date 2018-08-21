package com.company;
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        System.out.println("program penukaran nilai variabel");
        int a = 5;
        int b = 2;
        int c;
        // ganti boi ganti

        System.out.println("sebelum di ganti: A = " + a + " dan B = " + b);

        c = a;
        a = b;
        b = c;
        System.out.println("Nilai A Adalah" + a + "" + b);

    }
}
