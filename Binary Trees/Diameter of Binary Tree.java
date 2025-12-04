//Optimal :- O(n) 
class Solution {
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        //your code goes here
        getDepth(root);

        return diameter;
    }
    public int getDepth(TreeNode root) {
        if(root == null) return 0;

        int leftHeight = getDepth(root.left);
        int rightHeight = getDepth(root.right);

        diameter = Math.max(diameter, leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }
}

//Brute Force :- O(n^2)
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        //your code goes here
        if(root == null) return 0;

        int leftDia = diameterOfBinaryTree(root.left);
        int rightDia = diameterOfBinaryTree(root.right);

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        int selfDia = leftHeight + rightHeight;

        return Math.max(selfDia , Math.max(leftDia , rightDia));

    }
    public int getHeight(TreeNode root) {
        if(root == null) return 0;

        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }
}
