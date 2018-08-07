package Hackerank;

import java.util.Objects;

public class ReserveArr {
    public static void main(String[] args) {
        Integer[] nama ={1,2,3,4,5,6};
        for (int i =0;i<nama.length; i++){
            System.out.println(nama[i]);
        }
        Integer tmp =nama[0];
        for (int i =0;i<nama.length; i++){
            if (i == nama.length-1){
                nama[nama.length-1] = tmp;
            }else {
                nama[i] = nama[i+1];
            }
        }
        for (int i =0;i<nama.length; i++){
            System.out.println(nama[i]);
        }
    }
}
