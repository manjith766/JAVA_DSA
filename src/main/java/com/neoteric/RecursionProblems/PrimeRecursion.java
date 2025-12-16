package com.neoteric.RecursionProblems;

public class PrimeRecursion {
    public static void main(String[] args) {
        int n =23;
        if (isPrime(n,2)){
            System.out.println(n+"is a primenumber");
        }else {
            System.out.println(n+" is not a primenumber");
        }

    }
   static boolean isPrime(int n,int i){
        if (n<=1){
            return false;
        }
        if (i == n){
            return true;
        }
        if (n %i ==0){
            return false;
        }
        return isPrime(n,i+1);

   }
}
