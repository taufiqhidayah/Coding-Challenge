package com.company;

import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        String nama;
        Scanner scanner = new Scanner(System.in);
        nama = scanner.next();
        System.out.println(nama);
        Integer a;
        a =scanner.nextInt();
        if (a%2 == 0){
                System.out.println("Genap");
        }else{
            System.out.println("Ganjil");
        }

    }
}
