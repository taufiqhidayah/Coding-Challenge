package Hackerank;

import java.util.Scanner;

public class TImeConversion {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String time = in.next();
        int size = time.length();

        String s[] = time.split(":");
        //for (int i=0;i<s.length;i++)
        // System.out.println(s[i]+"  "+"s["+i+"]");
        String AmPm = time.substring(size - 2, size); // System.out.println("AMPM="+AmPm);

        // int hh=0;
        String hh = null;
        String mm = null, ss = null;

        // hh=Integer.parseInt(s[0]);
        hh = s[0];
        //mm=Integer.parseInt(s[1]);
        //ss=Integer.parseInt(s[2].substring(0,2));
        mm = s[1];
        ss = s[2].

                substring(0, 2);

        // System.out.println("hh:mm:ss"+hh+mm+ss);

        if (hh.equals("12") || hh.equals("24"))

        {
            if (AmPm.equals("AM")) {
                hh = "00";
                System.out.println(hh + ":" + mm + ":" + ss);
            } else if (AmPm.equals("PM")) {
                hh = "12";
                System.out.println(hh + ":" + mm + ":" + ss);
            }
        } else if ((Integer.parseInt(hh)) < 12 && AmPm.equals("AM"))

        {
            System.out.println(hh + ":" + mm + ":" + ss);
        } else

        {
            //hh=Integer.parseInt(hh)+12;
            System.out.println((Integer.parseInt(hh) + 12) + ":" + mm + ":" + ss);
        }

    }
}