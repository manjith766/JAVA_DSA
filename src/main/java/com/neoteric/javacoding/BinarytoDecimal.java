package com.neoteric.javacoding;

public class BinarytoDecimal{
    public static void main(String[] args) {
        int binary = 1011;
        int decimal =0;
        int power = 0;

        while (binary>0){
            int digit = binary% 10;
            decimal = (int) (decimal+digit*Math.pow(2,power));
            binary= binary/10;
            power++;
        }
        System.out.println("decimal value ="+decimal);
    }
}
