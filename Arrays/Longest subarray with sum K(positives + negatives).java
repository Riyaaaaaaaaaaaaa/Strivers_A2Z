class Solution {
    public int longestSubarray(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLength = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            sum += nums[i];

            if(sum == k) {
                maxLength = Math.max(maxLength, i+1);
            }

            if(map.containsKey(sum - k)) {
                maxLength = Math.max(maxLength, i - map.get(sum - k));
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxLength;
    }
}
