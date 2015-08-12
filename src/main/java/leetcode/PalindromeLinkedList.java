package leetcode;

/**
 * Created by qinjuntao on 2015/8/12.
 * https://leetcode.com/problems/palindrome-linked-list/
 */
public class PalindromeLinkedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public class Solution {
        private boolean flag = true;
        private ListNode st;

        private ListNode check(ListNode root) {
            if (root == null) {
                return st;
            }
            ListNode tmp = check(root.next);
            if (tmp.val != root.val) {
                flag = false;
            }
            return tmp.next;
        }

        public boolean isPalindrome(ListNode head) {
            if (head == null || head.next == null) return true;
            st = head;
            check(head);
            return flag;
        }
    }
}
