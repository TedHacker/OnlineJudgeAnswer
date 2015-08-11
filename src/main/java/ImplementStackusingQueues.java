import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by qinjuntao on 2015/8/11.
 * https://leetcode.com/problems/implement-stack-using-queues/
 */
public class ImplementStackusingQueues {
    class MyStack {
        private Queue<Integer> queue = new LinkedList<Integer>();

        // Push element x onto stack.
        public void push(int x) {
            queue.offer(x);
        }

        // Removes the element on top of the stack.
        public void pop() {
            int len = queue.size();
            int tmp;
            for (int i = 0; i < len; ++i) {
                tmp = queue.peek();
                queue.poll();
                if (i < len - 1) {
                    queue.offer(tmp);
                }
            }
        }

        // Get the top element.
        public int top() {
            int len = queue.size();
            int tmp = 0;
            for (int i = 0; i < len; ++i) {
                tmp = queue.peek();
                queue.offer(tmp);
            }
            return tmp;
        }

        // Return whether the stack is empty.
        public boolean empty() {
            return queue.isEmpty();
        }
    }
}
