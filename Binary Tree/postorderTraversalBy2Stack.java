                            
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// Node class for the binary tree
class Node {
    int data;
    Node left;
    Node right;
    
    // Constructor to initialize
    // the node with a value
    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}

public class postorderTraversalBy2Stack {

    // Function to perform inorder traversal
    // of the tree and store values in 'arr'
    public static List<Integer> postOrder(Node root){
        List<Integer> ans = new ArrayList<>();
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();

        st1.push(root);
        while (!st1.empty()) {
            root = st1.pop();
            st2.push(root);

            if(root.left != null){
                st1.push(root.left);
            }
            if(root.right != null){
                st1.push(root.right);
            }
        }
        while ((!st2.empty())) {
            Node a = st2.pop();
            ans.add(a.data);
        }
        return ans;
    }

    // Main function
    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Getting inorder traversal
        List<Integer> result = postOrder(root);

        // Displaying the inorder traversal result
        System.out.print("Postorder Traversal: ");
        // Output each value in the
        // inorder traversal result
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
                            
                        