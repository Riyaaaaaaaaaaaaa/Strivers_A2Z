class Solution {
  // Find Minimum Value
  public static int minValue(Node root) {
      if (root == null) return -1;           // Edge case: empty tree
      while (root.left != null) {
          root = root.left;                  // Go as left as possible
      }
      return root.data;
  }

  // Find Maximum Value
  public static int maxValue(Node root) {
      if (root == null) return -1;           // Edge case: empty tree
      while (root.right != null) {
          root = root.right;                 // Go as right as possible
      }
      return root.data;
  }
}
