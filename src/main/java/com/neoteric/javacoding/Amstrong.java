package com.neoteric.javacoding;

public class Amstrong {
    public static void main(String[] args) {
        int num = 153;
        int original = num;
        int digits = 0;
        int sum = 0;

        while (num>0){
            digits++;
            num = num/10;
        }
        num = original;

        while (num>0){
            int digit = num%10;
            sum = sum+(int) Math.pow(digit,digits);
            num = num/10;
        }
        if(sum == original){
            System.out.println("Armstrong number");
        }else {
            System.out.println("not armstrong");
        }
    }
}
