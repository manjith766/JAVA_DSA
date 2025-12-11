package com.neoteric.arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 30, 20, 10};
        HashSet set = new HashSet<>();

        for (int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println(set);
    }
}
