package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner baca = new Scanner(System.in);
    public static void main(String[] args) {
        Integer[] b = new Integer[2];
        insertData(b);
        for (Integer aB : b) {
            System.out.println(aB);
        }
    }

    private static void insertData(Integer c[]){
        boolean eror=false;
        do{
            for (int i =0; i<c.length;i++) {

              try {
                  c[i] = baca.nextInt();
                  eror =false;
              } catch (Exception ignored) {
                  System.out.println(ignored);
                  baca.reset();
              }
          }
        }while (eror);
    }
}
