class Solution {
    public List<Integer> postorder(TreeNode root) {
        //your code goes here
        List<Integer> arr = new ArrayList<>();
        postorder(root , arr);
        return arr;
    }
    public void postorder(TreeNode node , List<Integer> arr){
        if(node == null) {
            return ;
        }
        postorder(node.left , arr);
        postorder(node.right , arr);
        arr.add(node.data);
    }
}
