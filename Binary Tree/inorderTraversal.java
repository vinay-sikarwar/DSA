// Leetcode 94

class inorderTraversal {
    ArrayList<Integer> inorder = new ArrayList<>();
    public List<Integer> inorderTraversals(TreeNode root) {
        if(root == null){
            return inorder;
        }

        inorderTraversal(root.left);
        inorder.add(root.val);
        inorderTraversal(root.right);
        return inorder;
    }
}