package com.practice.dsa.mathematics;

public class Lcm {
    public static void main(String[] args) {

        System.out.println(lcm(10, 12));
    }

    public static int lcm(int a, int b) {
        return (a / Gcd.gcdRecursive(a, b)) * b;
    }
}
