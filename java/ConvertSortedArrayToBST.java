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

    public TreeNode sorted;

    public TreeNode sortedArrayToBST(int[] nums) {
        sorted = new TreeNode(nums[0]); // 3
        if (nums.length == 1) {
            return sorted;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < sorted.val) { // -3 vs. -10

            }
            // insert nums[i] into sorted treenode(root)

            System.out.println(sorted.val); // 3
            System.out.print(nums[i]); // 1
            if (nums[i] < sorted.val) {
                TreeNode temp = sorted;
            }
            // if nums[i] > root.val, root.right = nums[i]
        }
        return sorted;
    }
}
/*
Note:
        -10
     /        \
   -3          0
  /   \
 5     9

           0
        -3   9
     -10    5

[diagram]
for (i; nums.length)
    insert nums[i] into sorted treenode(root)
    if nums[i] < root.val, root.left = nums[i]
    if nums[i] > root.val, root.right = nums[i]
*/



 /* 1st attempt:
        return new TreeNode();
        // input : [1,2,3,4,5,6]   [1,2,3]    [1,2,3,4]
        // output: [4,2,6,1,3,5]   [2,1,3]    [3,2,4,1]
         3
         /     \
         2        4
         /   \     /
         1

         [-10,-3,0,5,9]

    }
}*/