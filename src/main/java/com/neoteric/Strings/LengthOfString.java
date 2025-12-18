package com.neoteric.Strings;

public class LengthOfString {
    public static void main(String[] args) {
      String s=  "hellomanjith";
      int count  =0;
      for (char c :s.toCharArray()){
          count++;
      }
      System.out.println(count);
      System.out.println(s.length());
    }
}
