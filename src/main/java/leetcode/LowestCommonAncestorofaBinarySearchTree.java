package leetcode;

/**
 * Created by qinjuntao on 2015/8/10.
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 */
public class LowestCommonAncestorofaBinarySearchTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {
        private TreeNode answer = null;

        private boolean findlowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            boolean left = false, right = false;
            if (root.val == p.val) {
                left = true;
                if (root.right != null) {
                    findlowestCommonAncestor(root.right, p, q);
                }
            }
            if (root.val == q.val) {
                right = true;
                if (root.left != null) {
                    findlowestCommonAncestor(root.left, p, q);
                }
            }
            if (root.left != null && p.val < root.val) {
                left = (left || findlowestCommonAncestor(root.left, p, q));
            }
            if (root.right != null && root.val < q.val) {
                right = (right || findlowestCommonAncestor(root.right, p, q));
            }
            if (left && right) {
                answer = root;
            }
            return (left || right);
        }

        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (p.val > q.val) {
                TreeNode tmp = p;
                p = q;
                q = tmp;
            }
            findlowestCommonAncestor(root, p, q);
            return answer;
        }
    }
}
