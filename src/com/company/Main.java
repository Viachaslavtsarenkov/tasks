package com.company;

import com.task.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("The last digit of square " + Task1.getLastDigitOfSquare(15));
        System.out.println("Leap: " + Task2.isLeap(1992));
        System.out.println("Count days: " + Task2.getAmountDays(4, 1992));
        double secondArea = Task3.getSecondAreaSquare(12);
        System.out.println("S2 = " + secondArea);
        System.out.printf("S1 > S2 in %s time\n", Task3.getNumberTimes(12, secondArea));
        System.out.println("The number of oven is more 2: " + Task4.count(12,23, 23, 554));
        System.out.println("Perfect number: " + Task5.isPerfect(28));
        int seconds = 76764;
        System.out.printf("Hours %s minutes %s seconds: %s \n", Task6.showHours(123),
                Task6.showMinutes(123), Task6.showSeconds(123));
        Task7.comparePoints(1,1, 2,1);
        System.out.println("F = " + Task8.getValueFunction(12));
        Task9.getTan(1,2,0.2);
        System.out.printf("S =%.3f F =%.3f ", Task10.getAreaCircle(3),
                Task10.getLengthCircle(3));

    }
}
