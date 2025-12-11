package com.neoteric.javacoding;

public class AutomorphicNumber {
    public static void main(String[] args) {
        int n = 25;
        int square = n*n;

        int temp = n;
        int digits = 0;

        while (temp>0){
            digits++;
            temp = temp/10;
        }
        int power =(int) Math.pow(10,digits);
        if (square%power == n){
            System.out.println(n +" is an automorphic number");
        }else {
            System.out.println(n+" is not an automorphic number");
        }
    }
}
