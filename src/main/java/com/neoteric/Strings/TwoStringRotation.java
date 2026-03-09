//Check if Two Strings Are Rotations??

package com.neoteric.Strings;

public class TwoStringRotation {
    public static void main(String[]args){
        String s1 = "abcd";
        String s2 = "cdba";

        if(s1.length() == s2.length() && (s1+s2).contains(s2)){
            System.out.println("rotation");
        }else{
            System.out.println("not rotation");
        }
    }
}
