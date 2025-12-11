package com.neoteric.javacoding;

import java.util.Scanner;

public class RangeSum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter l:");
        int L = scanner.nextInt();

        System.out.println("enter r:");
        int R = scanner.nextInt();

        if (L > R) {
            int temp = L;
            L = R;
            R = temp;
        }

        int sum = (R*(R+1)/2)-((L-1)*L/2);
        System.out.println("Sum from " + L + " to " + R + " = " + sum);
        scanner.close();
    }
}
