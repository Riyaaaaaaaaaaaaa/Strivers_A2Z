class Solution {
    public int maxDepth(TreeNode root) {
        //your code goes here
        if(root == null) return 0;
        int left_height = maxDepth(root.left);
        int right_height = maxDepth(root.right);
        return 1 + Math.max(left_height, right_height);
    }
}
