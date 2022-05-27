//A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
//
//For example, for arr = [1,2,3], the following are considered permutations of arr: [1,2,3], [1,3,2], [3,1,2], [2,3,1].
//The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).
//
//For example, the next permutation of arr = [1,2,3] is [1,3,2].
//Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
//While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
//Given an array of integers nums, find the next permutation of nums.
//
//The replacement must be in place and use only constant extra memory.

package Arrays_Questions;

public class Next_Permutation {
    public void nextPermutation(int[] nums){
 int n = nums.length;
 int k = n - 2;

  //null checks
        if(nums.length == 0|| nums == null)return;

        //find k 3 1 4 2
        for(int i = n-1; i > 0; i--){
    if(nums[i] <= nums[i - 1])k--;
    else{
        break;
    }
}
        // if k == -1.......reverse
        if(k == -1){
            reverse(nums, 0, n-1);
            return;
        }

        //else replace k with next greater element reverse
for(int i = n-1; i > 0; i--){
    if(nums[i] > nums[k]){
        int temp = nums[k];
        nums[k] = nums[i];
        nums[i] = temp;
        break;
    }
}
reverse(nums, k + 1, n -1);

    }
    void reverse(int[] nums, int start, int end){
while(start < end){
    int temp = nums[start];
    nums[start] = nums[end];
    nums[end] = temp;
    start++;
    end--;
}
    }


}
