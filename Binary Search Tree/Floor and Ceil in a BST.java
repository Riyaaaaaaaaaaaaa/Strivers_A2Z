class Solution {
    public List<Integer> floorCeilOfBST(TreeNode root, int key) {
        //your code goes here
        List<Integer> result = new ArrayList<>();

        int floor = -1;
        int ceil = -1;

        TreeNode temp = root;

        while(temp != null) {
            if(key == temp.data) {
                floor = temp.data;
                ceil = temp.data;
                break;
            } else if(key < temp.data) {
                ceil = temp.data;
                temp = temp.left;
            } else {
                floor = temp.data;
                temp = temp.right;
            }
        }

        result.add(floor);
        result.add(ceil);

        return result;
    }
}
