class Solution {
    public int lowerBound(int[] nums, int x) {
        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {
            int mid = (low + high)/2;

            if(nums[mid] < x){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}
