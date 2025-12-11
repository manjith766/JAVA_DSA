package com.neoteric.javacoding;

public class PrimeRange {
    public static void main(String[] args) {
        int l =2;
        int r = 10;

        for(int i = l;i<=r;i++){
            if (isprime(i)){
                System.out.println(i+" ");
            }
        }
    }
    static  boolean isprime(int n){
        if (n <= 1)return false;
       //

        for (int i = 2;i<= Math.sqrt(n);i++){
            if (n%i == 0)return false;
        }
        return true;
    }
}
