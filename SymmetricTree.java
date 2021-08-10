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


//         1
//       2   2
//   null 3 2 null

class Solution {

    public boolean isSymmetric(TreeNode root) {
        return helper(root.left, root.right);
    }

    private boolean helper(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if ((t1 == null && t2 != null) || (t1 != null && t2 == null)) {
            return false;
        }
        if (t1.val != t2.val) {
            return false;
        }
        return helper(t1.left, t2.right) && helper(t1.right, t2.left);
    }
}

/* 2nd attempt
        if (root.left == null && root.right == null) {
            return true;
        }
        return helper(root.left, root.right);
    }

    private boolean helper(TreeNode rootLeft, TreeNode rootRight) {
        if (rootLeft == null || rootRight == null) {
            return false;
        } else if (rootLeft.val != rootRight.val) {
            return false;
        } else if (rootLeft.left == null && rootRight.right == null) {
            if (helper(rootLeft.right, rootRight.left)) {
                return true;
            }
        } else if (rootLeft.right == null && rootRight.left == null) {
            return helper(rootLeft.left, rootRight.right);
        }
        return helper(rootLeft.right, rootRight.left) && helper(rootLeft.left, rootRight.right);
        // &&: if there's at least one false, return false.
    }
}
*/

/* 1st attempt
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
 */