class Solution {
  public int[] unionArray(int[] nums1, int[] nums2) {
    int n1 = nums1.length;
    int n2 = nums2.length;
    List<Integer> result = new ArrayList<>();

    int i = 0, j = 0;
    while (i < n1 && j < n2) {
      int val;
      if (nums1[i] < nums2[j]) {
        val = nums1[i];
        i++;
      } else if (nums1[i] > nums2[j]) {
        val = nums2[j];
        j++;
      } else {
        val = nums1[i];
        i++;
        j++;
      }
      if (result.isEmpty() || result.get(result.size() - 1) != val) {
        result.add(val);
      }
    }
    while (i < n1) {
      if (result.isEmpty() || result.get(result.size() - 1) != nums1[i]) {
        result.add(nums1[i]);
      }
      i++;
    }
    while (j < n2) {
      if (result.isEmpty() || result.get(result.size() - 1) != nums2[j]) {
        result.add(nums2[j]);
      }
      j++;
    }

    int[] arr = new int[result.size()];
    for (i = 0; i < result.size(); i++) {
      arr[i] = result.get(i);
    }
    return arr;
  }
}
