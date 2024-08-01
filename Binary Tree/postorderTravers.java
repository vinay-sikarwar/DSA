
public class postorderTravers {
    ArrayList<Integer> postorder = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null){
            return postorder;
        }

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        postorder.add(root.val);
        return postorder;
    }
}
