package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome (int num) {
        String number = String.valueOf(Math.abs(num));
        String reversed = "";

        for (int i=number.length()-1; i>=0; i--) {
            reversed =reversed + number.charAt(i);
            //System.out.println(reversed);
        }
        return number.equals(reversed);
    }

}
