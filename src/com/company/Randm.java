package com.company;

import java.math.BigInteger;
import java.util.Random;

public class Randm {
    public static void main(String[] args) {
        BigInteger angka = new BigInteger(String.valueOf(1000));

        angka = angka.pow(10);
        System.out.println(angka);
    }
}
