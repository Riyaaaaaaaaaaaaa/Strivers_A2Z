//Brute Force
class Solution {
    public void sortZeroOneTwo(int[] nums) {
        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;

        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] == 0) {
                count_0++;
            } else if(nums[i] == 1) {
                count_1++;
            } else {
                count_2++;
            }
        }

        int i = 0;
        while (count_0-- > 0) nums[i++] = 0;
        while (count_1-- > 0) nums[i++] = 1;
        while (count_2-- > 0) nums[i++] = 2;
    }
}


//Optimal Version: Dutch National Flag Algorithm
class Solution {
    public void sortZeroOneTwo(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }
}
