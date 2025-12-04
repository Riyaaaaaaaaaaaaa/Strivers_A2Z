//Brute Force :- O(n^2)
class Solution {
    public boolean isBalanced(TreeNode root) {
        //your code goes here
        if (root == null) return true;

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        if(Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right)) {
            return true;
        }

        return false; 
	}
    public int getHeight(TreeNode root){
        if(root == null) return 0;

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        return 1 + Math.max(leftHeight , rightHeight);
    }
}

//Optimal Approach :- O(n)
class Solution {
    public boolean isBalanced(TreeNode root) {
        //your code goes here
        return checkHeight(root) != -1; 
	}
    public int checkHeight(TreeNode root){
        if(root == null) return 0;

        int leftHeight = checkHeight(root.left);
        if(leftHeight == -1) return -1;

        int rightHeight = checkHeight(root.right);
        if(rightHeight == -1) return -1;

        if(Math.abs(leftHeight - rightHeight) > 1) return -1;

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
