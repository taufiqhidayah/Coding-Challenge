package com.company;

public class Swape {
    public static void main(String[] args) {
        int a=12;
        int b =13;
        System.out.println("before main" + a+b);
        swapp(a, b);
        System.out.println(a+b);

    }
    public static Integer swapp(int a, int b){
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("after"+a+b);
        return a&b;
    }

}
