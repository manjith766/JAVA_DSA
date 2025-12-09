package com.neoteric.arrays;

/* what is an array?
--->one variable that stores multiple values of the same type .
Think of an array as a row of fixed-size lockers, all of the same type.
3 key terms:
Element → the value inside one locker (e.g., 10)
Index → locker number (starts from 0, not 1)
Length → how many lockers total (arr.length)
In Java, array size is fixed after creation. You can change values, not size.

ex:           Index →   0     1     2     3
                       -----------------------
              arr →   |  5  | 10  | 15  | 20 |    -- length = 5 and index = arr.length -1 =4;
                       ------------------------
 */

/*
our question is sum of array means to find the sum of all numbers inside array.
Where are the values?
→ Inside an array

How do I visit each value one by one?
→ Using a loop

Where do I keep the total?
→ In a variable (sum)

 */
public class SumArray {
    public static void main(String[] args){
        //how to declare an array? -- int[]arr;-- array declaration;
        int[]arr = {5,10,15,20,25};
        int sum = 0;

    //    for(int x: arr){
     //   sum = sum + x;
   //     }
   //     System.out.print("sum ="+sum);

        for(int i=0; i <arr.length;i++) {
            sum = sum + arr[i];
        }
        System.out.print("sum="+sum);
    }
}
/*
Common mistake:
for (int i = 0; i <= arr.length; i++) → ❌ ArrayIndexOutOfBoundsException
Fix: use < arr.length, not <=.

if u have any doubt u can test .....
 */
