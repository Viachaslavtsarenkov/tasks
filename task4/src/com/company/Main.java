package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        System.out.println(" Введите числа");
        try {
            a = reader.nextInt();
            b = reader.nextInt();
            c = reader.nextInt();
            d = reader.nextInt();
        } catch (Exception e) {
            System.out.println(e);
        }

        if ( (a % 2 + b % 2 + c % 2 + d % 2) <= 2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
