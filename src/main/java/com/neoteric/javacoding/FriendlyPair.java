package com.neoteric.javacoding;

public class FriendlyPair {
    public static void main(String[] args) {
        int a =6;
        int b = 28;
        int sumA= sumofproperdivisors(a);
        int sumB= sumofproperdivisors(b);

        double ratioA = (double) sumA/a;
        double ratioB = (double) sumB/b;

        if (ratioA  == ratioB){
            System.out.println(a+" and "+b+" are a friendly pair");
        }else {
            System.out.println("not friendly pairs");
        }
    }
    static int sumofproperdivisors(int n){
        int sum =0;
        for(int i =1;i<=n/2;i++){
            if(n%i == 0){
                sum=sum+i;
            }
        }
        return sum;
    }
}
/*
Two numbers a and b form a Friendly Pair if:

(Sum of proper divisors of a) / a
= (Sum of proper divisors of b) / b

This ratio is called the abundancy index.

Example: 6 and 28

Proper divisors of 6 → 1, 2, 3 → sum = 6 → 6/6 = 1

Proper divisors of 28 → 1, 2, 4, 7, 14 → sum = 28 → 28/28 = 1

Ratios are equal → 6 and 28 are a Friendly Pair
 */
