package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println(" Введите число");
        try {
            int number = reader.nextInt();
            System.out.println("Последня цифра квадрата " + getLastDigitOfSquare(number));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static int getLastDigitOfSquare(int number) {
        return (int)Math.pow(number % 10, 2) % 10;
    }

}
