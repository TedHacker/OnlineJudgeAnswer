package leetcode;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */
public class RemoveNthNodeFromEndofList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            if (head == null) return null;
            ListNode end = head;
            for (int i = 0; i < n; ++i) end = end.next;
            ListNode target = head;
            if (end == null) {
                head = head.next;
                return head;
            }
            for (; end.next != null; ) {
                target = target.next;
                end = end.next;
            }
            end = target.next;
            target.next = end.next;
            return head;
        }
    }
}
