package com.company.task;

public class Task9 {

    public static void getTan(double a, double b, double h) {
        for(double i = a; i <= b; i += h) {
            System.out.printf("tan(%.1f)  %f\n", i, Math.tan(i));
        }
    }
}
