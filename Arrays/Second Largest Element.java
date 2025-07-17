class Solution {
    public int secondLargestElement(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > largest) {
                second_largest = largest;
                largest = num;
            } else if (num < largest && num > second_largest) {
                second_largest = num;
            }
        }

        if(second_largest == Integer.MIN_VALUE) {
            return -1;
        }
        return second_largest;
    }
}
