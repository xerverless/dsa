package com.practice.dsa.mathematics;

public class Gcd {
    public static void main(String[] args) {

        System.out.println(gcdRecursive(16,24));
    }

    public static int gcdRecursive(int a, int b) {
        if (a % b == 0)
            return b;
        return gcdRecursive(b, a % b);
    }
}

