package com.neoteric.javacoding;

class PrimeFactors {
   public static void main(String[]args){
       int n =84;
       int temp = n;
       while (temp%2 ==0){
           System.out.print(2+" ");
           temp=temp/2;
       }
       for (int i=3;i*i<=temp;i+=2){
           while (temp%3 == 0){
               System.out.print(i+" ");
               temp= temp/i;
           }
       }
       if (temp>2){
           System.out.print(temp);

       }
   }
}
