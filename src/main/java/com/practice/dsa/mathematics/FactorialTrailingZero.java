package com.practice.dsa.mathematics;

public class FactorialTrailingZero {
    public static void main(String[] args) {

        System.out.println(factorialTrailingZero(100));
    }

    public static int factorialTrailingZero(int n) {
        int i = 5;
        int count = 0;
        while (n / i > 0) {
            count = count + n / i;
            i = i * 5;
        }
        return count;
    }
}
