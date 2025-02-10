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

// https://leetcode.com/problems/invert-binary-tree/
public class Solution226 {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;

        invertNodes(root);
        
        return root;
    }

    public void invertNodes(TreeNode node){
        var aux = node.left;
        node.left = node.right;
        node.right = aux;

        if(node.left != null){
            invertNodes(node.left);
        }

        if(node.right != null) {
            invertNodes(node.right);
        }
    }
}
