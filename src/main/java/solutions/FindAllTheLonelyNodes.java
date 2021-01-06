package solutions;

import Utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 1469. Find All The Lonely Nodes
 * https://leetcode.com/problems/find-all-the-lonely-nodes/
 * 
 */
public class FindAllTheLonelyNodes {

    public List<Integer> lonelyGuys;

    public List<Integer> getLonelyNodes(TreeNode root) {

        lonelyGuys = new ArrayList<>();
        dfs(root);
        return lonelyGuys;

    }

    public void dfs(TreeNode root) {

        if (root == null) {
            return;
        }

        if (root.left != null && root.right == null) {
            lonelyGuys.add(root.left.val);
        } else if (root.left == null && root.right != null) {
            lonelyGuys.add(root.right.val);
        }
        dfs(root.left);
        dfs(root.right);
    }
}


// pseudo code
// if left is not null && right == null
// store left into lonelyGuys
// right, otherwise