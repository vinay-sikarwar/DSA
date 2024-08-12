                            
import java.util.*;

// Node structure for the binary tree
class Node {
    int data;
    Node left;
    Node right;

    // Constructor to initialize
    // the node with a value
    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}

class Solution {
    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        // Base case
        if (root == null || root == p || root == q) {
            return root;
        }

        // Recursively find the lowest common ancestor in the left and right subtrees
        Node left = lowestCommonAncestor(root.left, p, q);
        Node right = lowestCommonAncestor(root.right, p, q);

        // Result
        if (left == null) {
            return right;
        } else if (right == null) {
            return left;
        } else { // Both left and right are not null, we found the result
            return root;
        }
    }
}

public class lowestCommonAncestor {
    // Function to print the Inorder
    // Traversal of the Binary Tree
    private static void printInorder(Node root) {
        if (root == null) {
            return;
        }
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.right = new Node(6);
        root.left.right = new Node(5);
        root.right.left = new Node(7);

        Solution solution = new Solution();

        System.out.print("Binary Tree (Inorder): ");
        printInorder(root);
        System.out.println();

        Node res = solution.lowestCommonAncestor(root, root.left.left, root.left.right);

        System.out.println(res.data);
    }
}
                            
                        