package Arrays_Questions;
//Maximum and minimum of an array using minimum number of comparisons
//Write a function to return minimum and maximum in an array. Your program should make the minimum number of comparisons.
//This can be done with 3 method: 1- simple linear search...2. comparison method..3. Recursion
public class Max_Min_Arr {
    public static void Print_Max_Min(int[] nums){
int max = nums[0];
int min = nums[0];

for(int i = 1; i<nums.length; i++){
    if (nums[i] > max) {
        max = nums[i];
    }
    else if(nums[i] < min){
        min = nums[i];
    }
}
        System.out.println("The maximum number in the list is: "+ max);
        System.out.println("The minimum number in the list is: "+ min);
    }
    public static void main(String[] args) {
int[] nums = {4, 8, 9, 7, 5, 3, 4};
Print_Max_Min(nums);
    }
}
