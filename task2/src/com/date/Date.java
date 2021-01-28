package com.date;

public class Date {
    private int year;
    private int month;
    final private int[] AMOUNT_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31,30 ,31};

    public Date(int year, int month) {
        this.year = year;
        this.month = month;
    }

    public boolean isLeap() {
        return (this.year % 4 == 0 && (this.year % 400 == 0 || this.year % 100 != 0));
    }

    public int getAmountDays() {
        return (this.isLeap() && this.month == 2) ? 29 : this.AMOUNT_DAYS[this.month - 1];
    }

}
