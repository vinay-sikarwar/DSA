                            
import java.util.LinkedList;
import java.util.Queue;

// TreeNode structure
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class maxWidth {
    public int widthOfBinaryTree(TreeNode root) {
        LinkedList<pair> q = new LinkedList<>();

        int max = Integer.MIN_VALUE;

        if(root==null) return 0;

        q.addLast(new pair(root,0));

        while(!q.isEmpty())
        {
            int size = q.size();
            max = Math.max(max, (q.getLast().level - q.getFirst().level +1));

            for(int i=0;i<size;i++)
            {
                pair element = q.removeFirst();

                if(element.root.left!=null)
                q.add(new pair(element.root.left,2*element.level));

                if(element.root.right!=null)
                q.add(new pair(element.root.right,2*element.level+1));
            }
        }
        return max;

    }


    static class pair {
        int level;
        TreeNode root;
        public pair(TreeNode root, int level){
            this.level=level;
            this.root=root;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        Solution sol = new Solution();

        int maxWidth = sol.widthOfBinaryTree(root);

        System.out.println("Maximum width of the binary tree is: " + maxWidth);
    }
}
                            
                        