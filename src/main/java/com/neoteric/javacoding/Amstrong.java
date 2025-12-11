package com.neoteric.javacoding;

class Amstrong {
    public static void main(String[] args) {
        int n = 153;
        int original = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit * digit * digit;
            n = n / 10;
        }
        System.out.println(sum);
        if (original == sum) {
            System.out.println(" Armstrong");
        } else {
            System.out.println("not ArmStrong");
        }
    }
}

