package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //System.out.println(isPalindrome(-1221));
        //System.out.println(isPalindrome(707));
        //System.out.println(isPalindrome(11212));


        //System.out.println(isPerfectNumber(6));
        //System.out.println(isPerfectNumber(28));
        //System.out.println(isPerfectNumber(5));
        //System.out.println(isPerfectNumber(-1));

        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));

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

    public static String numberToWords(int num) {

        String[] words = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String numString = String.valueOf(num);
        String result = "";

        if (num < 0) {
            return "Invalid Value";
        }

        for(int i=0;i<numString.length();i++) {
            int digit = numString.charAt(i) - '0';
            result = result + words[digit];
            if(i<numString.length()-1) {
                result = result + " ";
            }
        }

    return result;
    }}
