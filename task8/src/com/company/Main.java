package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите X");
        try {
            int x = reader.nextInt();
            System.out.println("f(x)=" + getValueFunction(x));
        } catch (InputMismatchException e) {
            System.out.println(e);
        }

    }

    static double getValueFunction(double x) {
        if ( x >= 3) {
            return Math.pow(-x, 2) + (3 * x) + 9;
        } else {
            return 1 / (Math.pow(x, 3) - 6);
        }
    }
}
