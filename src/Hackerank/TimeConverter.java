package Hackerank;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String time;
        time = scanner.nextLine();
        String split[] = time.split(":");
        String hh = split[0];
        String mm = split[1];
        String ss = split[2];

//        String ampm = split[3];
        if (time.contains("PM")) {

            if (hh.equals("12")) {
                System.out.println("12" + ":" + mm + ":" + ss.substring(0, 2));
            } else {
                int newHH = Integer.parseInt(hh);
                newHH += 12;
                System.out.println(newHH + ":" + mm + ":" + ss.substring(0, 2));
            }
        } else if (time.contains("AM")) {
            if (hh.equals("12")) {
                System.out.println("00" + ":" + mm + ":" + ss.substring(0, 2));
            } else {
                System.out.println(hh + ":" + mm + ":" + ss.substring(0, 2));
            }
        }
    }
}
