class Solution {
    public List<Integer> preorder(TreeNode root) {
        //your code goes here
        List<Integer> arr = new ArrayList<>();
        preorder(root,arr);
        return arr;
    }
    public void preorder(TreeNode node , List<Integer> arr) {
        if(node == null) {
            return ;
        }
        arr.add(node.data);
        preorder(node.left , arr);
        preorder(node.right , arr);
    }
}
