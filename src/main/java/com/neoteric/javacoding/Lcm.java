package com.neoteric.javacoding;

class Lcm {
    public static void main(String[] args) {

        int a = 12;
        int b = 18;

        int hcf = findHCF(a, b);
        int lcm = (a * b) / hcf;

        System.out.println("LCM of " + a + " and " + b + " is " + lcm);
    }

    static int findHCF(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}
/*
The LCM of two numbers is:

The smallest number that is divisible by both numbers

Example: 12 and 18

Multiples of 12 → 12, 24, 36, 48…
Multiples of 18 → 18, 36, 54…

 LCM = 36

IMPORTANT RELATION (MEMORIZE THIS)

LCM and HCF are connected:

LCM(a, b) = (a × b) / HCF(a, b)


This is the best and fastest method.
Interviewers expect this, not brute force.

 */