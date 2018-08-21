package com.company;

public class FungsiPenjumlahan {
    public static void main(String[] args) {
        jumlah(12,3);
        jumlah(7,9);
        jumlah(9,4);
        perkalian(8,8);
        menu();

        Anggota(12379, "Anton");
        Anggota(88786, "Padi");
    }

    private static void Anggota(int i, String anton) {
        System.out.println(i +""+anton);
    }

    private static void menu() {
        System.out.println("1 . penjumalahan");
        System.out.println("2 . perkalian");
    }

    private static void perkalian(int var1, int var2) {
        int c = var1*var2;
        System.out.println(c);
    }

    private static void jumlah(int i, int i1) {
        int c = i +i1;
        System.out.println(c);
    }


}
