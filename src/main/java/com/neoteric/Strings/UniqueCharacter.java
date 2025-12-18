package com.neoteric.Strings;

public class UniqueCharacter {
    public static void main(String[] args) {
        String s = "aabbcdde";
        char[] arr = s.toCharArray();
        for (int i =0;i<arr.length;i++){
            boolean unique = true;
            for (int j =0;j<arr.length;j++){
                if (i !=j && arr[i]==arr[j]){
                    unique = false;
                    break;
                }
            }
            if (unique){
                System.out.println(arr[i]);
                break;
            }
        }
    }

}
