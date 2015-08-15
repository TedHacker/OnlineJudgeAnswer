package leetcode;

/**
 * Created by qinjuntao on 2015/8/14.
 * https://leetcode.com/problems/rectangle-area/
 */
public class RectangleArea {
    public class Solution {
        public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
            int tmp;
            int a = Math.max(A, E);
            int b = Math.max(B, F);
            int c = Math.min(C, G);
            int d = Math.min(D, H);
            if (a < c && b < d) {
                tmp = (c - a) * (d - b);
            } else {
                tmp = 0;
            }
            return (C - A) * (D - B) + (G - E) * (H - F) - tmp;
        }
    }
}
