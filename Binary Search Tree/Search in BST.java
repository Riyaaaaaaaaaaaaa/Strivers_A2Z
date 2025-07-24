class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        //your code goes here
        if(root == null || val == root.data) {
            return root;
        }
        else if(val < root.data) {
            return searchBST(root.left,val);
        }
        else {
            return searchBST(root.right,val);
        }
    }
}
