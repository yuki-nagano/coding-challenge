package solutions;

import Utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 897. Increasing Order Search Tree
 * https://leetcode.com/problems/increasing-order-search-tree/
 *
 */
public class IncreasingOrderSearchTree {
    public TreeNode increasingBST(TreeNode root) {

        List<Integer> list = new ArrayList();
        inOrderTraversal(root, list);

        TreeNode treeNode = new TreeNode(0);
        TreeNode current = treeNode;
        for (int n : list) {
            current.right = new TreeNode(n);
            current = current.right;
        }

        return treeNode.right;
    }

    public void inOrderTraversal(TreeNode root, List<Integer> list) {

        if (root == null) {
            return;
        }

        inOrderTraversal(root.left, list);
        list.add(root.val);
        inOrderTraversal(root.right, list);

    }
}

// REMEMBER
// TreeNode cant be add like lists
// traverse with a list and loop
// X: inOrderTraversal(root.left, list);
//    treeNode = new TreeNode(root.val);
//    inOrderTraversal(root.right, list);

// This problem is to create the tree node that
// every node has no left child and only one right child
// so store nodes into right and return treenode.right

