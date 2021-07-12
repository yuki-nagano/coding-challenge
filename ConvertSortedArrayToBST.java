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
    public TreeNode sortedArrayToBST(int[] nums) {
        return new TreeNode();
        // input : [1,2,3,4,5,6]   [1,2,3]    [1,2,3,4]
        // output: [4,2,6,1,3,5]   [2,1,3]    [3,2,4,1]
        /**
         3
         /     \
         2        4
         /   \     /
         1

         [-10,-3,0,5,9]


         **/

    }
}