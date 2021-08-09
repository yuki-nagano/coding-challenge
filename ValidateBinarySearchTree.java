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

    public boolean isValidBST(TreeNode root) {
        if (root.left == null && root.right == null) {
            return true;
        }
        helper(root, result);
        return result;
    }

    // root.right == null
    private void helper(TreeNode root, boolean result) {

        // root is null, return
        if (root == null) return;
        if (root.left == null && root.right == null) {
            result = true;
            return;
        }

        if (root.right == null && root.left != null) {
            // check only left
            if (root.left.val < root.val) {
                result = true;
            }
        } else if (root.left == null && root.right != null) {
            // check only right
            if (root.right.val > root.val) {
                result = true;
            }
        } else {
            if (root.left.val < root.val && root.right.val > root.val) {
                result = true;
            }
        }

        if (result) {
            helper(root.left, result);
            helper(root.right, result);
        }
    }
}
/*
Note:
    if root doesn't have any nodes, return true

    Helper
    root is null, return false

    null check
        2                 2             2
    1      null     null      3     null null

    if root.right == null && root.left != null,
        check only left
        if root.left.val is smaller than root.val
    if root.left == null && root.right != null,
        check only right
        if root.right.val is greater tnan root.val
    else
                2
            1       3

    check...
    if root.left.val is smaller than root.val
    if root.right.val is greater tnan root.val


    go to the next level(root.left and right)



*/