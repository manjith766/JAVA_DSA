package com.neoteric.arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] a ={1,2,3};
        int[] b={4,5,6};
        int[] c=new int[a.length+b.length];
        int index = 0;
        for (int i=0;i<a.length;i++){
            c[index]=a[i];
            index++;
        }
        for (int i=0;i<b.length;i++){
            c[index]=b[i];
            index++;
        }
        System.out.println("merged array: ");
        for (int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
    }
}
