package com.neoteric.javacoding;

public class HarshadNumber {
    public static void main(String[] args){
        int n = 18;
        int temp = n;
        int sum =0;

        while (temp>0) {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 2;
        }
        if (n % sum == 0) {

            System.out.println(n + " is a Harshad number");
        }else {
            System.out.println(n+" is not a Harshad number");
        }
    }
}
/*
A number is a Harshad Number if:

The number is divisible by the sum of its digits

Examples:

18 → digits: 1 + 8 = 9 → 18 ÷ 9 = 2

21 → digits: 2 + 1 = 3 → 21 ÷ 3 = 7

19 → digits: 1 + 9 = 10 → 19 ÷ 10 ≠ integer

So the rule is very simple:

n % (sum of digits) == 0
 */
