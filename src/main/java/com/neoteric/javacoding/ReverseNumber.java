package com.neoteric.javacoding;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 121;
        int original = num;
        int reverse = 0;

        while (num>0){
            int digit = num % 10;
            reverse = reverse*10+digit;
            num = num/10;

        }System.out.println(reverse);
        if(reverse == original){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }

}
