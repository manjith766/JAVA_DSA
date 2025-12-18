package com.neoteric.arrays;

public class SortArrayAscending {
    public static void main(String[] args) {
        int[] arr ={5,3,6,7,2,8};
        for (int i =0;i<arr.length;i++){
            for (int j= i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){ // if u want sorted array in descending order change symbol <
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("sorted array: ");
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
