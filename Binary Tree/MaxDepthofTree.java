                            
import java.util.LinkedList;
import java.util.Queue;

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

class Solution {
    public int maxDepth(Node root) {
        if(root == null){
            return 0;
        }
        int cnt =0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                root = queue.poll();
                if(root.left != null){
                    queue.add(root.left);
                }
                if(root.right != null){
                    queue.add(root.right);
                }
            }
            cnt++;
        }
        return cnt;
    }
}
// Main class
public class MaxDepthofTree {
    // Main function
    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);
        root.left.right.right.right = new Node(7);

        Solution solution = new Solution();
        int depth = solution.maxDepth(root);

        System.out.println("Maximum depth of the binary tree: " + depth);
    }
}
                            
                        