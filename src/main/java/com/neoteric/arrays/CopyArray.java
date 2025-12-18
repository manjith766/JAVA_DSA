package com.neoteric.arrays;

public class CopyArray {
    public static void main(String[] args) {
        int [] a= {10,20,30,40,50};
        int [] b = new int[a.length];
        for (int i =0;i<a.length;i++){
            b[i]= a[i];
        }
        System.out.print("copied array");
        for (int i =0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}

