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

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null && targetSum == 0) {
            return false;
        }
        return helper(root, targetSum);
    }

    private boolean helper(TreeNode root, int targetSum) {

        // leaf AND sum == targetSum
        if (root == null && targetSum == 0) {
            return true;
            // leaf but not targetSum
        } else if (root == null) {
            return false;
        }

        targetSum -= root.val;

        return helper(root.left, targetSum) || helper(root.right, targetSum);
    }
}
/*
Note:
    recursion (helper)
    targetSum -= root.val;
    base case:
        targetSum == 0, return true
        targetSum < 0, return false // can be negative number in the middle of traverse
    recursive case:
        hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum)
*/


/*
1st attempt:

         input: [1,2,3], 5
         output: false

         input: [1,2,3], 3
         output: true

         1
         2   3

     public static boolean result = false;
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
 */