package com.neoteric.Strings;

public class CountCharacterFrequency {
    public static void main(String[] args) {
    String s = "aabbccmai";
    char[] arr = s.toCharArray();
    for (int i =0;i<arr.length;i++){
        if (arr[i] == ' ') {
            continue;
        }
        int count = 1;
        for (int j = i+1;j<arr.length;j++){
            if (arr[i]==arr[j]){
                count++;
                arr[j]=' ';
            }
        }
        System.out.print(arr[i]+"-->"+count+" ");
    }
    }
}
