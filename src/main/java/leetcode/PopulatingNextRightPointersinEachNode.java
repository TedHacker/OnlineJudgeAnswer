package leetcode;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
 */
public class PopulatingNextRightPointersinEachNode {
    public class TreeLinkNode {
        int val;
        TreeLinkNode left, right, next;

        TreeLinkNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public void connect(TreeLinkNode root) {
            if (root == null) return;
            TreeLinkNode temp;
            for (; root.left != null; ) {
                temp = root;
                for (; temp != null; ) {
                    temp.left.next = temp.right;
                    if (temp.next != null)
                        temp.right.next = temp.next.left;
                    temp = temp.next;
                }
                root = root.left;
            }
        }
    }
}
