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

    public boolean result = false;

    public boolean isSameTree(TreeNode p, TreeNode q) {
        // root, right, left, if there was something wrong, false
        return helper(p, q);
    }

    private boolean helper(TreeNode p, TreeNode q) {

        // edge
        if (p == null || q == null) {
            return false;
        }

        // base

        if (p.left == null && q.left == null)  || (p.right == null && q.right == null)) {

        }
            &&
        if ((p.right == q.right) && (p.right == q.right) && (p.val == q.val)) {
            result = true;
        }

        if (result) {
            helper(p.left, q.left);
            helper(p.right, q.right);
        }
        return result;
    }

}