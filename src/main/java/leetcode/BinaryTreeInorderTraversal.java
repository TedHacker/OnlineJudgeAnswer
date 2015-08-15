package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/binary-tree-inorder-traversal/
 */
public class BinaryTreeInorderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            list = new ArrayList<Integer>();
            preorderDFS(root);
            return list;
        }

        private List<Integer> list;

        private void preorderDFS(TreeNode root) {
            if (root == null) return;
            preorderDFS(root.left);
            list.add(root.val);
            preorderDFS(root.right);
        }
    }
}
