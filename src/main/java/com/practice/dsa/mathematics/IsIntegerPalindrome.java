package com.practice.dsa.mathematics;

public class IsIntegerPalindrome {

    public static void main(String[] args) {
        System.out.println(isIntegerPalindrome(123));
        System.out.println(isIntegerPalindrome(12321));
        System.out.println(isIntegerPalindrome(1));
    }
    public static boolean isIntegerPalindrome(int item){
        return item==ReverseInteger.reverseInteger(item);
    }
}
