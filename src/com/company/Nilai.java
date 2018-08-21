package com.company;
import java.util.Scanner;
public class Nilai {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int nilai_budi = 89;
        nilai_budi = inp.nextInt();

        if (nilai_budi>=80) {
            System.out.println("NIlai A");
        }
        else if(nilai_budi>=60 && nilai_budi < 80){
            System.out.println("Nilai Budi B");
        }
        else{
            System.out.println("Nilai C");
        }
    }
}
