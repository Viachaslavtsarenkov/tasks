package com.company;

public class Main {

    public static void main(String[] args) {
        int year = 1900;
        int month = 2;
        Date date = new Date(year, month);
        System.out.println("Високосный " + date.isLeap());
        System.out.println("Количество дней в месяце " + date.getAmountDays());

    }
}
