package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 15;
        System.out.println(getLastDigitOfSquare(number));
    }

    static int getLastDigitOfSquare(int number) {
        return (int) Math.pow(number % 10, 2) % 10;
    }

}
