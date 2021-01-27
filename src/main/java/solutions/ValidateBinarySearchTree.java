package solutions;

import Utils.TreeNode;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {

        return validate(root, null, null);
    }

    public boolean validate(TreeNode root, Integer low, Integer high) {
        //       10
        //      / \
        //   null  null
        if (root == null) return true;

        // [invalid case]
        //       10
        //      / \
        //    15   4
        // left subtree: bigger than high, smaller than low(not null)
        // right subtree: bigger than high(not null), smaller than root
        // check if it's valid and if not return false
        if (low != null && root.val <= low
                || high != null && root.val >= high) {
            return false;
        }

        // otherwise(only true) can recurse and go next subtree
        return validate(root.left, low, root.val) && validate(root.right, root.val, high);
    }

}

// attempt 1
//       5
//      / \
//     1   4
//        / \
//       3   6

// if root.left and right is null, return;
// if root.left or right is not null;
//   if root.left is bigger than root.val,
//     or root.right is small than root.val

//       10
//      / \
//     5   15
//    / \    \
//   3   7    13
// check if the root is in the range between high and low
// ex. 15 should be bigger than root(10) and smaller than MAX
// ex2. 3 should be smaller than MIN and bigger than root(5)

// invalid case that needed to be considered
//   1
//  1 null
// return false