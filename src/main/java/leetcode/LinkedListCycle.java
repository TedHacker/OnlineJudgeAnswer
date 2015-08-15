package leetcode;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/linked-list-cycle/
 */
public class LinkedListCycle {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public boolean hasCycle(ListNode head) {
            if (head == null || head.next == null) return false;
            ListNode a = head;
            ListNode b = head;
            for (; ; ) {
                if (b == null) return false;
                if (b.next == null) return false;
                a = a.next;
                b = b.next.next;
                if (a == b) return true;
            }
        }
    }
}
