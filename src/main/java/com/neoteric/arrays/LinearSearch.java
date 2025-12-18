package com.neoteric.arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int []arr ={10,20,30,50,60};
        int key = 60;
        boolean found = false;
        for (int i =0;i<arr.length;i++){
            if (arr[i]==key){
                System.out.println("element id found at index "+i);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("Element not found");
        }
    }
}
