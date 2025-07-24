class Solution {
    List<List<Integer>> treeTraversal(TreeNode root) {
        //your code goes here
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> inorder = new ArrayList<>(); 
        List<Integer> preorder = new ArrayList<>();
        List<Integer> postorder = new ArrayList<>();

        inorder(root , inorder);
        preorder(root , preorder);
        postorder(root , postorder);

        result.add(inorder); 
        result.add(preorder);    
        result.add(postorder);    

        return result;      
    }

    void inorder(TreeNode root , List<Integer> list) {
        if(root == null) return;
        inorder(root.left , list);
        list.add(root.data);
        inorder(root.right , list);
    }

    void preorder(TreeNode root , List<Integer> list) {
        if(root == null) return;
        list.add(root.data);
        preorder(root.left , list);
        preorder(root.right , list);
    }

    void postorder(TreeNode root , List<Integer> list) {
        if(root == null) return;
        postorder(root.left , list);
        postorder(root.right , list);
        list.add(root.data);
    }
}
