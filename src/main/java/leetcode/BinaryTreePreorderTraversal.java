package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/binary-tree-preorder-traversal/
 */
public class BinaryTreePreorderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {
        private List<Integer> list;

        private void preorderDFS(TreeNode root) {
            if (root == null) return;
            list.add(root.val);
            preorderDFS(root.left);
            preorderDFS(root.right);
        }

        public List<Integer> preorderTraversal(TreeNode root) {
            list = new ArrayList<Integer>();
            preorderDFS(root);
            return list;
        }
    }
}
