package CodingInterviews;

/**
 * 重建二叉树
 * Created by qinjuntao on 2015/8/27.
 */
public class ReConstructBinaryTree {
    public class Solution {
        public class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;

            TreeNode(int x) {
                val = x;
            }
        }

        int[] preOrder;
        int[] inOrder;

        public TreeNode check(int preL, int preR, int inL, int inR) {
            TreeNode root = new TreeNode(preOrder[preL]);
            int len = 0;
            for (; inL + len <= inR; ++len) {
                if (root.val == inOrder[inL + len]) {
                    break;
                }
            }
            if (len > 0)//左子树不为空
                root.left = check(preL + 1, preL + len, inL, inL + len - 1);
            if (inL + len != inR)//右子树不为空
                root.right = check(preL + len + 1, preR, inL + len + 1, inR);
            return root;
        }

        public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
            preOrder = pre;
            inOrder = in;
            return check(0, preOrder.length - 1, 0, inOrder.length - 1);
        }
    }
}
