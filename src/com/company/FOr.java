package com.company;

import java.util.Scanner;

class FOr {

    public static void main(String[] args)

    {
        menu();


    }

    private static void menu() {
        int opsi;

        System.out.println("PR PROGRAM JAVA by Aqil Gama Rahmansyah @2018 (yaa saya jomblo...)");

        System.out.println("Pilih Opsi: ");

        System.out.println("1. Menampilkan bilangan ganjil atau genap");

        System.out.println("2. Countdown");

        System.out.println("3. Nilai index ujian");


        Scanner option = new Scanner(System.in);

        opsi = option.nextInt();

        if (opsi == 1)

        {

            int coba;

            System.out.println("");

            System.out.println("");

            System.out.println("masukkan variabel: ");

            Scanner cobae = new Scanner(System.in);

            coba = cobae.nextInt();

            if (coba % 2 == 0)

            {

                System.out.println("Bilangan tersebut Genap");

            } else

            {

                System.out.println("Bilangan tersebut Ganjil");

            }
            menu();
        } else if (opsi == 2)

        {

            System.out.println("");

            System.out.println("");

            int count;

            System.out.println("masukkan variable: ");

            Scanner count_s = new Scanner(System.in);

            count = count_s.nextInt();

            while (count > 0)

            {

                System.out.println(count);

                count--;

            }

            System.out.println("GO!! (sfx= roket meluncur)");
            menu();
        } else if (opsi == 3)

        {

            System.out.println("");

            System.out.println("");

            int Nilai;

            System.out.println("masukkan nilai: ");

            Scanner nilai = new Scanner(System.in);

            Nilai = nilai.nextInt();

            if (Nilai > 100)

            {

                System.out.println("Lheeh kok bisa?");

            } else if (Nilai > 80 && Nilai <= 100)

            {

                System.out.println("Nilai " + Nilai + " = A");

            } else if (Nilai < 80 && Nilai >= 60)

            {

                System.out.println("Nilai " + Nilai + " = B");

            } else

            {

                System.out.println("Nilai " + Nilai + " = C");

            }
            menu();
        } else

        {

            System.out.println("... silahkan coba lagi...");
            menu();
        }
    }

}