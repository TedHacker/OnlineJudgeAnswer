package leetcode;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/delete-node-in-a-linked-list/
 */
public class DeleteNodeinaLinkedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public void deleteNode(ListNode node) {
            ListNode idx = node;
            ListNode next = node.next;
            for (; next.next != null; idx = next, next = next.next) {
                idx.val = next.val;
            }
            idx.val = next.val;
            idx.next = null;
        }
    }
}
