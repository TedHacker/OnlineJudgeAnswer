package leetcode;

import java.util.Stack;

/**
 * Created by TedHakcer on 2015/8/10 0010.
 * https://leetcode.com/problems/implement-queue-using-stacks/
 */
public class ImplementQueueusingStacks {
    class MyQueue {
        Stack<Integer> stack = new Stack<Integer>();

        // Push element x to the back of queue.
        public void push(int x) {
            stack.push(x);
        }

        // Removes the element from in front of queue.
        public void pop() {
            int[] tmp = new int[stack.size()];
            for (int i = 0; i < tmp.length; ++i) {
                tmp[i] = stack.peek();
                stack.pop();
            }
            for (int i = tmp.length - 2; i >= 0; --i) {
                stack.push(tmp[i]);
            }
        }

        // Get the front element.
        public int peek() {
            int[] tmp = new int[stack.size()];
            for (int i = 0; i < tmp.length; ++i) {
                tmp[i] = stack.peek();
                stack.pop();
            }
            int num = tmp[tmp.length - 1];
            for (int i = tmp.length - 1; i >= 0; --i) {
                stack.push(tmp[i]);
            }
            return num;
        }

        // Return whether the queue is empty.
        public boolean empty() {
            return stack.empty();
        }
    }
}
