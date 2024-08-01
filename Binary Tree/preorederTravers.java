// Leetcode 144


public class preorederTravers {
    ArrayList<Integer> preorder = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return preorder;
        }
        preorder.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return preorder;
    }    
}

