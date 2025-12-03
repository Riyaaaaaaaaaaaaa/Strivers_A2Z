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
    public List<Integer> inorder(TreeNode root) {
        //your code goes here
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;

        while(!st.isEmpty() || curr != null) {
            if(curr != null) {
                st.push(curr);
                curr = curr.left;
            } else {
                curr = st.pop();
                result.add(curr.data);
                curr = curr.right;
            }
        }
        return result;
    }
}
