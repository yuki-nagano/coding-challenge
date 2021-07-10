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

    private boolean result = false;

    public boolean isSymmetric(TreeNode root) {

        // base
        //  if root.left == null but right is not, false
        //  if root.right == null but left is not, false
        if (root.left == null && root.right != null
                || root.right == null && root.left != null) {
            return false;
        }

        // otherwise
        // symmetric condition
        //  when both root,left and right are null
        if (root.left == null && root.right == null) {
            result = true;
        }
        //  when root.left.left and root.right.right is the same
        //  when root.right and root.left is the same
        if (root.left.val == root.right.val) {
            result = true;
        }

        return  isSymmetric(root.left) && isSymmetric(root.right);
    }
}