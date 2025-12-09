package com.neoteric.arrays;

public class CountPositiveNegativeZero {
    public static void main(String[] args) {
        int[] arr = {10, 20, 50, 0, -1, -5, -9};

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                positiveCount++;
            } else if (arr[i]<0) {
                negativeCount++;

            }else {
                zeroCount++;

            }

        }
        System.out.println("Positive count ="+positiveCount);
        System.out.println("negative count ="+negativeCount);
        System.out.println("zero count ="+zeroCount);
    }

}
