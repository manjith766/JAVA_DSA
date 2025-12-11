package com.neoteric.javacoding;

public class PerfectNumber {
    public static void main(String[] args) {
        int n= 6;
        int sum = 0;
        for (int i=1;i<=n/2;i++){
            if (n%i == 0){
                sum =sum+i;
            }
        }
        if (sum == n){
            System.out.println(n+" is a perfect number");
        }else {
            System.out.println(n+" is not a perfect number");
        }


    }
}
/*
Check whether a number is a Perfect Number.
 A Perfect Number =
Sum of its proper divisors = the number itself

Example:
28 → 1 + 2 + 4 + 7 + 14 = 28

 Program Explanation (Line by Line)
int n = 28;

This is the number you want to check.
You can change it to any number.

int sum = 0;

This variable stores the sum of proper divisors.

Starts from 0 because we haven’t added anything yet.

Loop to find proper divisors
for (int i = 1; i <= n / 2; i++) {

Why n / 2?

Any number greater than n/2 (except n) cannot divide n.

Example:
For 28, numbers > 14 cannot divide 28.

This makes the program faster.

if (n % i == 0) {


% means remainder.

If remainder is 0, then i is a divisor of n.

Example:

28 % 1 = 0 → divisor

28 % 2 = 0 → divisor

28 % 3 ≠ 0 → not a divisor

sum += i;


Add the divisor to sum.

For 28:

sum = 1 + 2 + 4 + 7 + 14 = 28

🧪 Final Check
if (sum == n) {

Compare sum of proper divisors with the original number.

 If equal → Perfect Number
 If not → Not a Perfect Number

System.out.println(n + " is a Perfect Number");


or

System.out.println(n + " is NOT a Perfect Number");

Why this program is correct

✔ You did not include n itself
✔ You used proper divisors only
✔ You used n / 2 for efficiency
✔ Logic is clean and interview-safe

 Common mistake (you avoided it)

 Looping till i <= n
 Adding n itself into sum

That mistake breaks the logic completely.

 One-line summary

This program checks all numbers from 1 to n/2, adds the divisors of n, and compares the sum with n to decide whether it is a Perfect Number.
 */