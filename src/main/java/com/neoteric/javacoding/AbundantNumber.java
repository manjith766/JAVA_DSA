package com.neoteric.javacoding;

public class AbundantNumber {
    public static void main(String[] args) {
        int n =12;
        int sum = 0;

        for (int i =1;i<=n/2;i++){
            if (n%i == 0){
                sum=sum+i;
            }
        }
        if (sum>n){
            System.out.println(n+" is an abundant number ");
        }else {
            System.out.println(n+"is not an abundant number");
        }
    }
}
/*
A number is an Abundant Number if:

Sum of its proper divisors is GREATER than the number

 Proper divisors = all divisors except the number itself.

Examples:

12 → divisors: 1, 2, 3, 4, 6
Sum = 1+2+3+4+6 = 16
16 > 12 →  Abundant

18 → 1, 2, 3, 6, 9
Sum = 21 > 18 →  Abundant

6 → 1, 2, 3
Sum = 6 →  (this is Perfect, not Abundant)
 */