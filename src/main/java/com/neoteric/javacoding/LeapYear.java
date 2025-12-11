package com.neoteric.javacoding;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2000;

        if ((year%4 == 0 && year % 100 !=100)||(year % 400 == 0)) {
            System.out.println("leap year");
        }else {
            System.out.println("not leap year");
        }
    }
}
/*
2000 → leap (divisible by 400)

1900 → NOT leap (divisible by 100 but not 400)

2024 → leap (divisible by 4, but not 100)
 */