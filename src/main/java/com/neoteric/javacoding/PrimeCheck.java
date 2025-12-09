package com.neoteric.javacoding;

public class PrimeCheck {
    public static void main(String[] args) {
     int num = 7;
    boolean isPrime = true;
    for (int i =2;i<= Math.sqrt(num);i++){
        if(num % i == 0){
            isPrime = false;
        }
    }
    if (isPrime){
        System.out.println("prime");
    }else {
        System.out.println("not prime");
    }
    }
}
