/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int val) { data = val; left = null, right = null }
 * }
 **/

class Solution {
    public List<Integer> postorder(TreeNode root) {
        //your code goes here
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;

        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        st1.push(root);

        while(!st1.isEmpty()) {
            TreeNode temp = st1.pop();
            st2.push(temp);

            if(temp.left != null) st1.push(temp.left);
            if(temp.right != null) st1.push(temp.right);
        }

        while(!st2.isEmpty()){
            TreeNode temp = st2.pop();
            result.add(temp.data);
        }

        return result;
    }
}
