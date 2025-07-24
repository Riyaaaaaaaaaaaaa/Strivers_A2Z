class Solution {
    public List<Integer> inorder(TreeNode root) {
        //your code goes here
        List<Integer> arr = new ArrayList<>();
        inorder(root , arr);
        return arr;
    }
    public void inorder(TreeNode node , List<Integer> arr){
        if(node == null) {
            return ;
        }
        inorder(node.left , arr);
        arr.add(node.data);
        inorder(node.right , arr);
    }
}
