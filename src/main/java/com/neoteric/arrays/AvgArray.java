package com.neoteric.arrays;

/*
how to find the average of an array?
first think average means sum/count
sum = addition of all numbers in array
count = total no of elements in array means dont worry and over think about it. its nothing but arr.length;

 */

public class AvgArray {
    public static void main(String[]args){
        int[] arr ={10,20,30,40,50};
        int sum = 0;
        for (int i =0;i< arr.length;i++){
            sum=sum+arr[i];
        }
        double average =(double)sum/arr.length;
        System.out.println(average);
    }
}
