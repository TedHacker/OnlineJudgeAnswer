package leetcode;

/**
 * Created by qinjuntao on 2015/8/14.
 * https://leetcode.com/problems/swap-nodes-in-pairs/
 */
public class SwapNodesinPairs {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public class Solution {
        private void swap(ListNode p, ListNode a, ListNode b) {
            p.next = b;
            a.next = b.next;
            b.next = a;
        }

        public ListNode swapPairs(ListNode head) {
            ListNode next = new ListNode(0);
            next.next = head;
            ListNode idx = head;
            head=next;
            for (; idx != null && idx.next != null; idx = idx.next) {
                swap(next, idx, idx.next);
                next = idx;
            }
            return head.next;
        }
    }
}
