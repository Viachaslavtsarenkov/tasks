package com.company;
import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            System.out.println("Введите промежуток [a,b]");
            double a = reader.nextDouble();
            double b = reader.nextDouble();
            System.out.println("Введите шаг h");
            double h = reader.nextDouble();
            getTan(a , b, h);
        } catch (InputMismatchException e) {
            System.out.println(e);
        }

    }

    static void getTan(double a, double b, double h) {
        for(double i = a; i <= b; i += h) {
            System.out.printf("tan(%.3f)  %f\n", i, Math.tan(i));
        }
    }
}
