package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println("*********************");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println("*********************");
        System.out.println(numberToWords(123)); // "One Two Three"
        System.out.println(numberToWords(1010)); // "One Zero One Zero"
        System.out.println(numberToWords(-12)); // "Invalid Value"

    }

    public static boolean isPalindrome(int number){
        String stringNumber = String.valueOf(Math.abs(number));
        String reversedNumber = "";
        for(int i= stringNumber.length()-1; 0<=i; i--){
            reversedNumber = reversedNumber + stringNumber.charAt(i);
        }
        if (stringNumber.equals(reversedNumber)) {

            return true;
        } else {
            return false;
        }

    }

    public static boolean isPerfectNumber(int number) {
        int bolenler = 0;
        if (number < 0) {
            return false;
        } else {
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    bolenler = bolenler + i;
                }
            }
            if (bolenler == number) {
                return true;
            } else {
                return false;
            }
        }
    }

        public static String numberToWords(int number) {
            String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
            String result = "";

            if (number < 0) {
                return "Invalid Value";
            }

            while (number > 0) {
                int basamak = number % 10;
                result = words[basamak] + " " + result;
                number = number / 10;
            }

            return result.trim();
        }


}
