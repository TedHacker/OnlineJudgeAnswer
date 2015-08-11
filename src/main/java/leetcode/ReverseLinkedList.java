package leetcode;

/**
 * Created by qinjuntao on 2015/8/11.
 * https://leetcode.com/problems/reverse-linked-list/
 */
public class ReverseLinkedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) return head;
            ListNode first = head;
            ListNode second = head.next;
            ListNode tmp;
            for (; second != null; ) {
                tmp = second.next;
                second.next = first;
                first = second;
                second = tmp;
            }
            head.next = null;
            return first;
        }
    }
}
