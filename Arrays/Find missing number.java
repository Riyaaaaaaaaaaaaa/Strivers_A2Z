class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum_of_n_natural_number = ((n * (n + 1))/2);

        int sum = 0;
        for(int i = 0 ; i < n ; i++) {
            sum += nums[i];
        }
        int missing_number = sum_of_n_natural_number - sum;
        return missing_number;
    }
}
