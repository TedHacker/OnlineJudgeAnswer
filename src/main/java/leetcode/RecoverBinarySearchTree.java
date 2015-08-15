package leetcode;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/recover-binary-search-tree/
 */
public class RecoverBinarySearchTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {
        private TreeNode one, two, pre;

        private void travel(TreeNode x) {
            if (x == null) return;
            travel(x.left);
            if (pre != null && pre.val > x.val) {
                if (one == null) {
                    one = pre;
                    two = x;
                } else
                    two = x;
            }
            pre = x;
            travel(x.right);
        }

        public void recoverTree(TreeNode root) {
            one = null;
            two = null;
            pre = null;
            travel(root);
            if (one != null && two != null) {
                int temp = one.val;
                one.val = two.val;
                two.val = temp;
            }
        }
    }
}
