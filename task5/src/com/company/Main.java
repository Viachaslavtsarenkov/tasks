package com.company;
import java.util.Scanner;
import com.numbers.Figure;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println(" Введите число");
        int number = 0;
        try {
            number = reader.nextInt();
        } catch (Exception e) {
            System.out.println(e);
        }
        Figure perfectNumber = new Figure(number);
        System.out.println(perfectNumber.isPerfect());

    }
}
