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

    public static boolean result = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        /**
         input: [1,2,3], 5
         output: false

         input: [1,2,3], 3
         output: true

         1
         2   3
         **/
        int treeSum = 0;
        return helper(root, targetSum, treeSum);
    }

    private boolean helper(TreeNode root, int targetSum, int treeSum) {

        if (root == null) {
            return result;
        }

        treeSum += root.val;
        if (treeSum == targetSum) {
            result = true;
            return result;
        }

        return helper(root.left, targetSum, treeSum) || helper(root.right, targetSum, treeSum);
    }
}