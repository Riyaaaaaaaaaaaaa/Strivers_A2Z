class Solution {
    public int singleNumber(int[] nums) {
        //your code goes here
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
