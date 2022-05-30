//You are given a read only array of n integers from 1 to n. Each integer appears exactly once except A which appears twice and B which is missing.
//Return A and B.
//Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
//Note that in your output A should precede B.
//Example:
//Input:[3 1 2 5 3]
//Output:[3, 4]
//A = 3, B = 4

package Arrays_Questions;
import java.io.*;
public class Repeat_and_missing_Arr {
    // Java program to Find the repeating
// and missing elements

        static void printTwoElements(int[] arr, int size)
        {
            int i;
            System.out.print("The repeating element is ");

            for (i = 0; i < size; i++) {
                int abs_val = Math.abs(arr[i]);
                if (arr[abs_val - 1] > 0)
                    arr[abs_val - 1] = -arr[abs_val - 1];
                else
                    System.out.println(abs_val);
            }

            System.out.print("and the missing element is ");
            for (i = 0; i < size; i++) {
                if (arr[i] > 0)
                    System.out.println(i + 1);
            }
        }

        // Driver code
        public static void main(String[] args)
        {
            int[] arr = { 7, 3, 4, 5, 5, 6, 2 };
            int n = arr.length;
            printTwoElements(arr, n);
        }
    }



