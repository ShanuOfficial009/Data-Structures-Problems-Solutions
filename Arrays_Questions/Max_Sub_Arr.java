//Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
//A subarray is a contiguous part of an array.
/*Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6. */


package Arrays_Questions;
public class Max_Sub_Arr {
public static int solution(int [] arr){
    int csum = arr[0];
    int osum = arr[0];
     for(int i = 1; i < arr.length; i++){
         if(csum >= 0){
             csum += arr[i];
         }
         else{
             csum = arr[i];
         }
         if(csum > osum){
             osum = csum;
         }
     }
     return osum;
}

    public static void main(String[] args) {
        int arr[] = {1, 3, 8, -2, 6, -8, 5};
        System.out.println(solution(arr));
    }
}
