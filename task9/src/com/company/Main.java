package com.company;

public class Main {

    public static void main(String[] args) {
        int radius = 6;
        System.out.printf("Длинна окружности %.3f\n", getLengthCircle(radius));
        System.out.printf("Площадь круга %.3f", getAreaCircle(radius));
    }
    static double getLengthCircle(int radius) {
        return (2 * Math.PI * radius);
    }

    static public double getAreaCircle(int radius) {
        return (Math.PI * Math.pow(radius, 2));
    }
}
