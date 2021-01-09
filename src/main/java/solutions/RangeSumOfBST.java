package solutions;

import Utils.TreeNode;

public class RangeSumOfBST {

    private static int sum;

    public static int rangeSumBST(TreeNode root, int low, int high) {
        sum = 0;
        dfs(root, low, high);
        return sum;

    }

    public static void dfs(TreeNode root, int low, int high) {
        if (root == null) {
            return;
        }

        // check root.val is a number in the range
        if (low <= root.val && root.val <= high) {
            sum += root.val;
        }

        // if the root is the same num as low, leaves won't be within the range
        if (low < root.val) {
            dfs(root.left, low, high);
        }

        // if the root is the same num as high, leaves won't be within the range
        if (high > root.val) {
            dfs(root.right, low, high);
        }
    }
    // Time : O(N)
    // Space : O(N)

}
