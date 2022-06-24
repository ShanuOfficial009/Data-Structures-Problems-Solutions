package Arrays_Questions;

public class Max_Prod_SubArr {
    public int maxProduct(int[] nums) {
        int max_overall = nums[0];
        int max_ending_here = nums[0], min_ending_here = nums[0];

        for(int i = 1; i < nums.length; ++i){
            int tmp = max_ending_here;
            max_ending_here = Math.max(nums[i], Math.max(nums[i]*max_ending_here, nums[i]*min_ending_here));
            min_ending_here = Math.min(nums[i], Math.min(nums[i]*tmp, nums[i]*min_ending_here));
            max_overall = Math.max(max_overall, max_ending_here);
        }
        return max_overall;
    }
}
