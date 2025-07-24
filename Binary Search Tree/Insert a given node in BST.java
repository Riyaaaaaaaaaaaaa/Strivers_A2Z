class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        //your code goes here
        if(root == null) {
            return new TreeNode(val);
        }
        else if(val < root.data) {
            root.left =  insertIntoBST(root.left,val);
        } else {
            root.right = insertIntoBST(root.right,val);
        }
        return root;
    }
}
