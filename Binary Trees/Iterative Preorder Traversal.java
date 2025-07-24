class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder = new ArrayList<>();
        if(root == null) return preorder;

        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        while(!st.isEmpty()) {
            TreeNode temp = st.pop();
            preorder.add(temp.val);

            if(temp.right != null) st.push(temp.right);
            if(temp.left != null) st.push(temp.left);
        }
        return preorder;
    }
}
