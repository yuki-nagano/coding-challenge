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
        // NEXT TODO: [1,2,2,3,null,null,3,4,null,null,4], true

        if (root == null) return true;
        int leftHeight = helper(root.left);
        int rightHeight = helper(root.right);
        if (Math.abs(rightHeight - leftHeight) <= 1) {
            return true;
        }

        return false;
    }

    private int helper(TreeNode root) {
        if (root == null) return 0;
        return Math.max(helper(root.left), helper(root.right)) + 1;

    }
}
/*
[Note]
    the input is always binary tree
    check if it's balanced
        means: root.left and root.right depth are less than 1
        bottom up or bobble down - start from root
*/