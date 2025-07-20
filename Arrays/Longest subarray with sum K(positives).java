class Solution {
    public int longestSubarray(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int maxLength = 0;
        int n = nums.length;

        while(right < n) {
            sum += nums[right];
            while(left <= right && sum > k) {
                sum -= nums[left];
                left++;
            }
            if(sum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
            right++;
        }
        return maxLength;
    }
}
