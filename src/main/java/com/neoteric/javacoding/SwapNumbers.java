package com.neoteric.javacoding;

public class SwapNumbers {
    public static void main(String[] args) {
        int a =10;
        int b = 20;
// with out using third variable
        a = a + b ;
        b = a - b;
        a = a - b;
        /*using third variable
        int temp = a;
        a = b;
        b = temp; */
        System.out.println(a);
        System.out.println(b);
    }
}
