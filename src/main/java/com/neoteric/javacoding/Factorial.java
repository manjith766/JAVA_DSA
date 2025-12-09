package com.neoteric.javacoding;

public class Factorial {
    public static void main(String[] args) {
        int num = 9;
        int fact =1;
        for(int i=1;i<=num;i++){
            fact = fact *i;
        }
        System.out.println(fact);
    }
}
/*
int num = 9;
int fact =1;
while(num>0){
fact = fact* num;
num--;
}
System.out.println(fact);
 */