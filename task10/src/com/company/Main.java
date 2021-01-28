package com.company;

public class Main {

    public static void main(String[] args) {
            int a = 1;
            int b = 2;
            double h = 0.2;
            getTan(a, b, h);
    }

    static void getTan(double a, double b, double h) {
        for(double i = a; i <= b; i += h) {
            System.out.printf("tan(%.1f)  %f\n", i, Math.tan(i));
        }
    }
}
