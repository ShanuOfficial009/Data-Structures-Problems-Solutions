//You are given a read only array of n integers from 1 to n. Each integer appears exactly once except A which appears twice and B which is missing.
//Return A and B.
//Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
//Note that in your output A should precede B.
//Example:
//Input:[3 1 2 5 3]
//Output:[3, 4]
//A = 3, B = 4

package Arrays_Questions;
public class Repeat_and_missing_Arr {
        public static void main(String[] args)
        {
            int [] arr = new int [] {3 ,1, 2, 5, 3};
            int n = arr.length;
            // initializing temp array
            int [] temp = new int [n];
            int miss = 0, repeat = 0;
            // setting temp array values
            for (int i = 0; i < n; ++i)
            {
                if(temp[arr[i]-1] == 0)
                    temp[arr[i]-1] = 1;

                if(temp[arr[i]-1] == 1)
                    repeat = arr[i];
            }

            for (int i = 0; i < n; ++i)
            {
                if(temp[i] == 0)
                    miss = i+1;
            }
            System.out.println("Missing: "+miss+" Repeating: "+repeat);
        }
    }


