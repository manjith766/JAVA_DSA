package com.neoteric.RecursionProblems;

class LargestElementRecursion {

    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 5};
        int max = findMax(arr, 0);
        System.out.println("Largest element = " + max);
    }

    static int findMax(int[] arr, int index) {

        // STOP condition
        if (index == arr.length - 1) {
            return arr[index];
        }

        // Ask recursion for the answer of the rest
        int maxInRest = findMax(arr, index + 1);

        // Compare current with rest
        return Math.max(arr[index], maxInRest);
    }
}
