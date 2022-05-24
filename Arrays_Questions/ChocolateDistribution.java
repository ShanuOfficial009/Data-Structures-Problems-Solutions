//Given an array of n integers where each value represents the number of chocolates in a packet. 
//Each packet can have a variable number of chocolates. 
//There are m students, the task is to distribute chocolate packets such that: 
//Each student gets one packet.
//The difference between the number of chocolates in the packet with maximum chocolates and packet with minimum chocolates given to the students is minimum.

package Arrays_Questions;
import java.util.*;
public class ChocolateDistribution {
        public static int minDifferenceFinder(int[] arr, int size, int m)
        {
            int answer = Integer.MAX_VALUE;     //to take the maximum value in the list
            Arrays.sort(arr);

            for (int i=0; i<=size-m; i++)
            {
                int minimumWindow = arr[i];
                int maximumWindow = arr[i+m-1];
                int gap = maximumWindow- minimumWindow ;

                if(gap < answer)
                {
                    answer = gap;
                }
            }
            return answer;
        }
        public static void main(String[] args)
        {
            int[] arr = {7, 3, 2, 4, 9, 12, 56};
            int m = 3;
            int size = arr.length;
            System.out.println(minDifferenceFinder(arr, size, m));
        }
    }

