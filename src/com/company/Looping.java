package com.company;

import java.util.Date;
import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        int n,i,sum = 0;
        n=3;
        for (i=1; i<=n; i++){
            sum= sum+i;
        }
        System.out.println(sum);
    }
}
