package leetcode;

import java.util.ArrayList;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/min-stack/
 */
public class MinStack {
    private ArrayList<Integer> valueStack = new ArrayList<Integer>();
    private ArrayList<Integer> minStack = new ArrayList<Integer>();
    private int index = 0;

    public void push(int x) {
        valueStack.add(x);
        if (index <= 0) {
            minStack.add(x);
        } else {
            minStack.add(minStack.get(index - 1) > x ? x : minStack.get(index - 1));
        }
        ++index;
    }

    public void pop() {
        if (index > 0) {
            valueStack.remove(index - 1);
            minStack.remove(index - 1);
            --index;
        }
    }

    public int top() {
        if (index < 1) {
            return -1;
        } else {
            return valueStack.get(index - 1);
        }
    }

    public int getMin() {
        if (index < 1) {
            return -1;
        } else {
            return minStack.get(index - 1);
        }
    }
}
