package solutions;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

// https://leetcode.com/problems/maximum-depth-of-binary-tree/
public class Solution104 {
    public int maxDepth(TreeNode root) {

        if(root == null) return 0;

        return explore(root, 0);
    }

    public int explore(TreeNode node, int depth) {
        if(node == null) return depth;
        depth += 1;

        int dl = 0, dr = 0;
    
        dl = explore(node.left, depth);
        dr = explore(node.right, depth);

        return Math.max(dl, dr);
    }
}
