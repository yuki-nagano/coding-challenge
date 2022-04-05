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
    public TreeNode balanceBST(TreeNode root) {

    }
}

/*
Note:
    it's balanced
     - the level diff is less than 1

    how to rotate
    - store root.val for later
    - change root to root.left
    -

    storenode = root.val // 3
    storetree = root
    root.val = root.right.val; // 5 either node which is bigger

    method:find the right position of formar root(3)
    def findtherightpos(root, storednode)

            3
        /       \
       1          5
                    \
                      6
                        \
                          7
*/

/* First attempt
Note:
binary tree
unbalanced tree


   2 <- root = root.right
 /  \
1    3 <- temp

     2
   /  \
  1    3

  - check if it's balanced

  root: 3
  - save root as temp
  - remove root
  - move other node to root
     root.left or right
  - add temp
*/
