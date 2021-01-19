package solutions;

import Utils.TreeNode;

/**
 * 104. Maximum Depth of Binary Tree
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 *
 */
public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        } else {
            int leftHeight = maxDepth(root.left);
            int rightHeight = maxDepth(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    //    3
    //   / \
    //  9   20
    //     /  \
    //   15    7
    // return: 3 (depth)
    public int maxDepthSecondTime(TreeNode root) {
        // base: root is null return 0
        if (root == null) return 0;
        // (compare size of recurse left, recurse right) + 1 (for only root)
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1; // *1
    }
}

// *1 Why + 1?
// if tree is like this;
//     3
//    / \
// null null
// output should be 1.
// So add + 1