
package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class strig {

    private static Scanner s;

    public static int division(int a, int b) {

        return a / b;
    }

    public static void main(String[] args) {

        int a, b;

        s = new Scanner(System.in);

        System.out.println("Enter a value: ");
        a = s.nextInt();

        boolean input = false;

        while (input == false) {

            try {

                System.out.println("Enter b value");
                b = s.nextInt();

                System.out.println("Sum of division is: " + division(a, b));

                input = true;
            }

            catch (ArithmeticException e) {
                System.err.println("Don't divide by zero!!!");
            }

            catch (InputMismatchException e) {
                System.err.println("Enter just a Number!!!");
            }

            finally {
                System.out.println();
            }

        }

    }
}