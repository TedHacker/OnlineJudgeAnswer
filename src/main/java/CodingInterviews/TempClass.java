package CodingInterviews;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by qinjuntao on 2015/8/26.
 */
public class TempClass {
    class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int v) {
            value = v;
            left = null;
            right = null;
        }
    }
    public ArrayList<Integer> preOrder = null;//先序序列
    public ArrayList<Integer> inOrder = null;//中序序列

    public Node check(int preL, int preR, int inL, int inR) {
        Node root = new Node(preOrder.get(preL));
        int len = 0;
        for (; inL + len <= inR; ++len) {
            if (root.value == inOrder.get(inL + len)) {
                break;
            }
        }
        if (len > 0)//左子树不为空
            root.left = check(preL + 1, preL + len, inL, inL + len - 1);
        if (inL + len != inR)//右子树不为空
            root.right = check(preL + len + 1, preR, inL + len + 1, inR);
        return root;
    }

    public void run() {
        Node root = null;
        Scanner cin = new Scanner(new BufferedInputStream(System.in));
        for (; cin.hasNext(); ) {
            preOrder = new ArrayList<Integer>();
            inOrder = new ArrayList<Integer>();
            int n = cin.nextInt();
            for (int i = 0; i < n; ++i) {
                preOrder.add(cin.nextInt());
            }
            for (int i = 0; i < n; ++i) {
                inOrder.add(cin.nextInt());
            }
            root = check(0, preOrder.size() - 1, 0, inOrder.size() - 1);
            postOrder(root);
        }
    }

    public void postOrder(Node root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value);
        return;
    }

    public static void main(String[] args) {
        new TempClass().run();
    }
}
