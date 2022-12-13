package com.practice.dsa.mathematics;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        //System.out.println(factorialRecursive(2));
    }
    public static int factorial(int n){
        int fact=1;
        for (int i = 1; i <=n; i++) {
            fact = fact*i;
        }
        return fact;
    }

    public static int factorialRecursive(int n){
        if(n==0 || n==1)
            return 1;
        return n*factorialRecursive(n-1);
    }
}
