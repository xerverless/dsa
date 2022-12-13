package com.practice.dsa.mathematics;

public class Divisors {
    public static void main(String[] args) {

        // printDivisors1(15);
        //   printDivisors2(15);
        printDivisors3(15);
    }

    public static void printDivisors1(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.println(i);
        }
    }

    public static void printDivisors2(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                if (i != (n / i))
                    System.out.println(n / i);
            }
        }
    }

    public static void printDivisors3(int n) {
        int i = 1;
        for (i = 1; i * i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        for (; i >= 1; i--) {
            if (n % i == 0) {
                System.out.println(n / i);
            }
        }

    }
}
