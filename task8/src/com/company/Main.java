package com.company;

public class Main {

    public static void main(String[] args) {
            int x = 5;
            System.out.println("f(x)=" + getValueFunction(x));
    }

    static double getValueFunction(double x) {
        if ( x >= 3) {
            return (Math.pow(-x, 2) + (3 * x) + 9);
        } else {
            return (1 / (Math.pow(x, 3) - 6));
        }
    }
}
