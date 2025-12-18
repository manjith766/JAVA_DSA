package com.neoteric.arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int []arr = {10,45,3,99,23};
        int largest = arr[0];
        int secondLargest =Integer.MAX_VALUE;

        for (int i = 0;i<arr.length;i++){
            if (arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i]>secondLargest && arr[i] != largest) {
                secondLargest = arr[i];

            }
        }
        System.out.println("second largest =" +secondLargest);
    }
}
