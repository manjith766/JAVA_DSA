package com.neoteric.RecursionProblems;

public class PowerRecursion {
    public static void main(String[] args) {
        System.out.println(power(2,8));
    }
    static int power(int base, int exp){
        if (exp == 0){
            return 1;
        }
        return base*power(base,exp-1);
    }
}
/*
Recursion = a function calling itself
But every recursive solution MUST have:

Base case → where recursion stops

Recursive case → where function calls itself with smaller input

If either is missing → infinite recursion → StackOverflowError

🎯 PROBLEM STATEMENT

Find:

a^b = a × a × a × ... (b times)


But using recursion, not loops.

 EXECUTION FLOW (MENTAL MODEL)

Example: power(2, 5)

2^5 = 2 × power(2, 4)
2^4 = 2 × power(2, 3)
2^3 = 2 × power(2, 2)
2^2 = 2 × power(2, 1)
2^1 = 2 × power(2, 0)
2^0 = 1   ← BASE CASE


Now results return backwards.
 */