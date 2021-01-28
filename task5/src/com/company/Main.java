package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPerfect(28));
    }

    static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number; ++i) {
            if (number % i == 0) {
                sum += i;
                if (sum > number) {
                    return false;
                }
            }
        }
        return (sum == number);
    }
}
