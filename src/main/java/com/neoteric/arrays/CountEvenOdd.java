package com.neoteric.arrays;

/*
problem: given an array,count how many even numbers and how many odd numbers it has
 even = divisible by 2 -- number % 2 == 0 its an even
 odd = not divisible by 2-- number % 2 != 0 its an odd
 */

public class CountEvenOdd {
    public static void main(String[] args){
        int[]arr ={10,15,20,25,30,35,40};

        int evenCount = 0;
        int oddCount = 0;

        for(int i= 0;i<arr.length;i++){
            if (arr[i] % 2 == 0) {
                evenCount++;
            }else {
                oddCount++;
            }
        }
        System.out.println("evenCount ="+evenCount);
        System.out.println("oddcount = "+oddCount);

    }
}
