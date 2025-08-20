// Last updated: 8/20/2025, 10:07:43 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        return getHeight(root) != -1;
    }

    private int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftSubtreeHeight = getHeight(root.left);
        int rightSubtreeHeight = getHeight(root.right);

        // If either subtree is unbalanced, return -1
        if (leftSubtreeHeight == -1 || rightSubtreeHeight == -1) {
            return -1;
        }

        // If the height difference is greater than 1, it's unbalanced
        if (Math.abs(leftSubtreeHeight - rightSubtreeHeight) > 1) {
            return -1;
        }

        // Return height if balanced
        return 1 + Math.max(leftSubtreeHeight, rightSubtreeHeight);
    }
}