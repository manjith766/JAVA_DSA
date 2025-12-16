package com.neoteric.javacoding;

public class HCF_GCD {
    public static void main(String[] args) {
        int a = 48;
        int b = 18;
        int hcf = findHcf(a,b);
        System.out.println("hcf of "+a+" and"+b+"is "+hcf);
    }
    static int findHcf(int a,int b){
        while (b != 0){
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}
