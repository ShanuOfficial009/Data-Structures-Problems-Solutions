package Arrays_Questions;
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

import java.util.HashSet;

public class Contains_Duplicate {

    public static boolean containsDup(int[]nums){
        HashSet<Integer> numbers = new HashSet<>();
        for(int i = 0; i <nums.length; i++){
            if(numbers.contains(nums[i])) return true;
            numbers.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int [] nums = {1, 5, 6, 8, 9, 1, 4};
         containsDup(nums);
    }
}
