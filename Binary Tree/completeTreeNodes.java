import java.util.*;

// TreeNode structure
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class completeTreeNodes {
    // Function to perform inorder
    // traversal and count nodes
    public int countNodes(TreeNode root) {
        return totalNodes(root, 0);
    }
    public int totalNodes(TreeNode root, int cnt){
        if(root == null){
            return 0;
        }
        
        int leftCnt = totalNodes(root.left, cnt++);
        int rightCnt = totalNodes(root.right, cnt++);
        return 1 + leftCnt + rightCnt;
    }

    public static void main(String[] args) {
        // Create the binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        completeTreeNodes sol = new completeTreeNodes();

        // Call the countNodes function
        int totalNodes = sol.countNodes(root);

        // Print the result
        System.out.println("Total number of nodes in the Complete Binary Tree: " + totalNodes);
    }
}
                                
                            