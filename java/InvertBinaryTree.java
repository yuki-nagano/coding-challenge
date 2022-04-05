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
    public TreeNode invertTree(TreeNode root) {
        return helper(root.left, root.right);
    }

    private TreeNode helper(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return;
        // swap
        TreeNode dummyT1 = t1;
        t1 = t2;
        t2 = dummyT1;

        // go to the next node
        t1 = helper(t1.left, t1.right);
        t2 = helper(t2.left, t2.right);
    }
}

/*
Note:
    helper(root.left, root.right)
    helper(TreeNode t1, TreeNode t2)
        // null check
        if (t1 == null && t2 == null) return;
        // swap
        TreeNode temp = t1;
        t1 = t2;
        t2 = temp;

        // go to the next node
        helper(t1.left, t1.right)
        helper(t2.left, t2.right)
*/

/* 1st attempt
    public TreeNode invertedRoot = new TreeNode();

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        invertedRoot = new TreeNode(root.val);
        invert(invertedRoot, root);

        return invertedRoot;
    }

    private void invert(TreeNode invertedRoot, TreeNode root) {
        // [2,1,3,2] -> [2,3,1,2]
             2               2
             /    \           /    \
            1       3       3       1
              2                       2

        if (root == null && invertedRoot == null) {
            return;
        }
         if (root.right != null && root.left != null) {

         }

        invertedRoot.left = root.right;
        invertedRoot.right = root.left;

        invert(invertedRoot.left, root.right);
        invert(invertedRoot.right, root.left);
    }

}
/*
Note:
    root is just leave it
    after root
    traverse root.right and left

*/