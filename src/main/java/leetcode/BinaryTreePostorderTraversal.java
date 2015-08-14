package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qinjuntao on 2015/8/14.
 * https://leetcode.com/problems/binary-tree-postorder-traversal/
 */
public class BinaryTreePostorderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {
        List<Integer> res;

        private void dfs(TreeNode root) {
            if (root == null) return;
            dfs(root.left);
            dfs(root.right);
            res.add(root.val);
        }

        public List<Integer> postorderTraversal(TreeNode root) {
            res = new ArrayList<Integer>();
            dfs(root);
            return res;
        }
    }
}
