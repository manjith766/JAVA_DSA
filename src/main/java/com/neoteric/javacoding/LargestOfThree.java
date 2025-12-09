package com.neoteric.javacoding;

public class LargestOfThree {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int c = 40;

        if(a>b && a>c){
            System.out.println("a is bigger");
        } else if (b>a && b>c) {

            System.out.println("b is bigger");
        }else {
            System.out.println("c is bigger");
        }
    }
}
