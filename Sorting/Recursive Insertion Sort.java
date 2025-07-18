class Solution {
  public int[] insertionSort(int[] a) {
    recursiveInsertionSort(a, a.length);
    return a;
  }

  private void recursiveInsertionSort(int[] a, int n) {
    if (n <= 1) {
      return;
    }
    recursiveInsertionSort(a, n - 1);

    int key = a[n - 1];
    int j = n - 2;
    while (j >= 0 && a[j] > key) {
      a[j + 1] = a[j];
      j = j - 1;
    }
    a[j + 1] = key;
  }
}
