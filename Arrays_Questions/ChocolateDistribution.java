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

