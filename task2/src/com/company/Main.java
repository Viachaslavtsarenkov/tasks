package com.company;
import java.util.Scanner;
import com.date.Date;
public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println(" Введите год и номер месяца");
        int year = 0;
        int month = 1;
        try {
            year = reader.nextInt();
            month = reader.nextInt();
        } catch(Exception e) {
            System.out.println(e);
        }
        Date date = new Date(year, month);
        System.out.println("Високосный " + date.isLeap());
        System.out.println("Количество дней в месяце " + date.getAmountDays());

    }
}
