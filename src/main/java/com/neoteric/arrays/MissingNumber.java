package com.neoteric.arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[]arr = {1,3,4,5};
        int n =5;
        int exceptedSum = n*(n+1)/2;
        int actualSum = 0;
        for (int i=0;i<arr.length;i++){
            actualSum= actualSum+arr[i];
        }
        int missingNumber = exceptedSum-actualSum;
        System.out.println(missingNumber);
    }
}
