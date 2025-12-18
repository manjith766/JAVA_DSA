package com.neoteric.arrays;

public class SecondSmallest {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];

            } else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }

        System.out.println("Second smallest = " + secondSmallest);
    }
}
