package com.practice.dsa.mathematics;

public class ReverseInteger {
    public static void main(String[] args) {

        System.out.println(reverseInteger(123457));
    }

    public static int reverseInteger(int item) {
        int rev = 0;
        while (item > 0) {
            int reminder = item % 10;
            rev = rev * 10 + reminder;
            item = item / 10;
        }
        return rev;
    }
}

