package com.neoteric.javacoding;

public class StrongNumber {
    public static void main(String[] args) {
        int n = 145;
        int temp = n;
        int sum =0;

        while (temp>0){
            int digit = temp%10;
            sum= sum+factorial(digit);
            temp = temp/10;
        }
        if (sum == n){
            System.out.println(n+" is a strong number");
        }else {
            System.out.println(n+" is not strong number");
        }
    }

    static int factorial(int num){
        int fact = 1;
        for(int i =1;i<=num;i++){
            fact = fact*i;
        }
        return fact;
    }
}
/*
CORE CONCEPT
A Strong Number is a number where:
Sum of factorials of its digits = the number itself
Example: 145
1! + 4! + 5!
= 1 + 24 + 120
= 145

So, 145 is a Strong Number.
Not a Strong Number:
123 → 1! + 2! + 3! = 1 + 2 + 6 = 9
Key terms (plain English):
Digit extraction: getting last digit using % 10
Factorial: n × (n-1) × (n-2) … × 1
Sum comparison: compare result with original number
 */
