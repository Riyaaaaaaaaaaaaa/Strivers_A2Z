class Solution {
  public int[] quickSort(int[] nums) {
    recursiveQuickSort(nums, 0, nums.length - 1);
    return nums;
  }

  private void recursiveQuickSort(int[] nums, int start, int end) {
    if (start < end) {
      int pivot = partition(nums, start, end);
      recursiveQuickSort(nums, start, pivot - 1);
      recursiveQuickSort(nums, pivot + 1, end);
    }
  }

  private int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = low - 1;

    for (int j = low; j < high; j++) {
      if (arr[j] <= pivot) {
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }

    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;

    return i + 1;
  }
}
