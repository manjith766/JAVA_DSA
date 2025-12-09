package com.neoteric.Strings;

public class PalindromeCheck {
    public static void main(String[]args){
        String str ="madam";
        String rev ="";

        for(int i = str.length()-1;i>=0;i--){
            rev = rev +str.charAt(i);
        }
        System.out.println(rev);

        if (str.equals(rev)){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }
}


/*
using two pointers (no extra string)
        String str = "level";
        int start = 0;
        int end = str.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
 */
/*
-->STRING DECLARATION
String str = "level";
This is the word we want to check.
Characters with index:

Index:  0  1  2  3  4
Char :  l  e  v  e  l

--> TWO POINTERS
int start = 0;
int end = str.length() - 1;
start → points to the first character
end → points to the last character
So initially:
start → 'l'
end   → 'l'
--> FLAG VARIABLE
boolean isPalindrome = true;
Think of this as an assumption:
“I assume this string IS a palindrome.”
If we find a mismatch, we change it to false.
-->WHILE LOOP
while (start < end) {
Meaning:
“Keep checking until the pointers meet in the middle.”
Why < and not <=?
When they meet → middle reached
No need to compare same character
-->MAIN COMPARISON
if (str.charAt(start) != str.charAt(end)) {
    isPalindrome = false;
    break;
}
Plain English:
“If the first and last characters are NOT the same → this is NOT a palindrome.”
We then:
set isPalindrome = false
stop checking further (break)
-->MOVE POINTERS
start++;
end--;
This means:
move from outside → inside
compare next pair of characters
Example:
l ↔ l
e ↔ e
v ↔ v

 STEP-BY-STEP DRY RUN
Initial state:
start = 0 → 'l'
end   = 4 → 'l'
Match
Move pointers:
start = 1 → 'e'
end   = 3 → 'e'
Match
Move pointers:
start = 2 → 'v'
end   = 2
Loop stops (start < end is false).

 FINAL DECISION

Since no mismatch was found:

System.out.println("Palindrome");


Output:

Palindrome
 */
