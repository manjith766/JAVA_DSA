package com.neoteric.javacoding;

public class PerfectSquare {
    public static void main(String[] args) {
        int n = 16;
        int sqrt = (int) Math.sqrt(n);
        if (sqrt*sqrt == n){
            System.out.println(n+" is a perfect square");
        }else {
            System.out.println(n+" is not a perfectSquare");
        }
    }
}
