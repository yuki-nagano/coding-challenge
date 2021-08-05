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
    public int maxDepth(TreeNode root) {
        return helper(root, 0);
    }


    private int helper(TreeNode root, int count) {
        if (root == null) {
            return 0;
        }
        count++;
        count = Math.max(helper(root.left, count), helper(root.right, count));

        return count;
    }
}
/*
Note:
    [3,9,20,null,null,15,7]
            3
        9       20
              15   7   output: 3


   go left vs. go right
   find Math.max

   [pseudo code]
   retrun helper(root, 0);


   int helper(TreeNode root, int count) {
    if (root == null) {
     retrurn 0;
    }
     count++;                    // 2
    return Math.max(helper(root.left, count), helper(root.right, count));
                                    3                      3
   }


*/