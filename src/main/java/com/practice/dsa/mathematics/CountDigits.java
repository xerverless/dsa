package com.practice.dsa.mathematics;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(32145));
        System.out.println(countDigitsRecursive(321456));
        System.out.println(countDigitsLog(3214500));
        System.out.println(countDigitsStringLength(321450123));
    }

    public static int countDigits(int item) {
        int count = 0;
        while (item > 0) {
            count++;
            item = item / 10;
        }
        return count;
    }

    public static int countDigitsRecursive(int item) {

        if (item == 0)
            return 0;
        return 1 + countDigitsRecursive(item / 10);
    }

    public static int countDigitsLog(int item) {
        return (int) Math.floor(Math.log10(item) + 1);
    }

    public static int countDigitsStringLength(int item) {
        String s = Integer.toString(item);
        return s.length();
    }

}
