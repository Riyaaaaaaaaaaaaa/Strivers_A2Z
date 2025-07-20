//to check the sum is in the array or not(for sorted arrays)
class Solution {
    public boolean twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            int sum = nums[left] + nums[right];
            if(sum == target) {
                return true;
            } else if(sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }
}
