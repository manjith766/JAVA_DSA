package com.neoteric.Strings;

class CountVowelsConsonants {
    public static void main(String[] args) {

        String str = "hello";
        int vowels = 0;
        int consonants = 0;

        // convert string to lowercase to simplify checks
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // check if character is a letter
            if (ch >= 'a' && ch <= 'z') {

                // check if vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u') {

                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }
}
