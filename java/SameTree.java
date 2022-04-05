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

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) return true; // reaches leaf, means it's all true
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right); // needs to be both true
    }
}

/*
if p  and q val is equal return true
if p val and q val is not equal return false
if p == null, q != null, return false

return isSameTree(p.right, q.right)
*/


/* 2nd attempt
        // pattern1
        //    1
        //  2   2

        // pattern2 false
        //    1                1
        //  2   null       null  2

        // pattern3 true
        //    1                1
        //  2   null       2     null

        //    null              null

        if (p == null && q == null) {
            result = true;
        } else {
            helper(p, q);
        }
        return result;
    }

    private void helper(TreeNode p, TreeNode q) {

        if (p == null || q == null) {
            return;
        }

        // either node is null
        if ((p.left == null && q.left != null) || (p.right == null && q.right != null)) {
            result = false;
            return;
        } else if (p.val != q.val) {
            result = false;
        } else if (p.left == q.left && p.right == q.right) {
            result = true;
        }

        helper(p.right, q.right);
        helper(p.left, q.left);
    }
}
*/


/* 1st attempt
        // root, right, left, if there was something wrong, false
        return helper(p, q);
    }

    private boolean helper(TreeNode p, TreeNode q) {

        // edge
        if (p == null || q == null) {
            return false;
        }

        // base

        if (p.left == null && q.left == null)  || (p.right == null && q.right == null)) {

        }
            &&
        if ((p.right == q.right) && (p.right == q.right) && (p.val == q.val)) {
            result = true;
        }

        if (result) {
            helper(p.left, q.left);
            helper(p.right, q.right);
        }
        return result;
    }
}
*/