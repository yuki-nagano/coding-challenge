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
        /*      2               2
             /    \           /    \
            1       3       3       1
              2                       2
        */
        if (root == null && invertedRoot == null) {
            return;
        }
//         if (root.right != null && root.left != null) {

//         }

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