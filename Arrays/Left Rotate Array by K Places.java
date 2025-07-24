class Solution {
  public void rotateArray(int[] nums, int k) {
    int n = nums.length;
    k = k % n; 

    reverse(nums, 0, k - 1); 
    reverse(nums, k, n - 1); 
    reverse(nums, 0, n - 1); }

  private void reverse(int[] nums, int start, int end) {
    while (start < end) {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
    }
  }
}
// public void rotateArray(int[] nums, int k) {
//     for (int j = 0; j < k; j++) {
//       int temp = nums[0];
//       int n = nums.length;

//       for (int i = 0; i < n - 1; i++) {
//         nums[i] = nums[i + 1];
//       }
//       nums[n - 1] = temp;
//     }
//   }
