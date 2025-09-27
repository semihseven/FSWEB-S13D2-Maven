package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //System.out.println(isPalindrome(-1221));
        //System.out.println(isPalindrome(707));
        //System.out.println(isPalindrome(11212));


        //System.out.println(isPerfectNumber(6));
        //System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        //System.out.println(isPerfectNumber(-1));

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

    public static boolean isPerfectNumber(int num) {
        int result=0;
        if (num<0) {
            return false;
        }

        for (int i=1; i<=num/2; i++) {
            if(num%i == 0) {
                result+=i;
                System.out.println("bölen: "+i);

            }
            System.out.println("toplam: "+result);
        }
        return result == num;

    }

}
