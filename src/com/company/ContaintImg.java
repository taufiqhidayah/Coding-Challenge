package com.company;

public class ContaintImg {
    public static void main(String[] args) {
        String url = "style=\text-align: center <a href https://haha.com/haha.jpg";
        int a= url.length();
        System.out.println(a);

      String b[]= url.split("href");
        String nama = b[0];
    }
}
