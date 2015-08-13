package leetcode;

/**
 * Created by qinjuntao on 2015/8/13.
 * https://leetcode.com/problems/divide-two-integers/
 */
public class DivideTwoIntegers {
    public static int divide(int dividend, int divisor) {
        if (divisor == 0) return Integer.MAX_VALUE; //除数为0，异常
        int res = 0;
        int flag = ((dividend ^ divisor) >> 31) == 0 ? 1 : -1;
        int tmp;
        if (dividend == Integer.MIN_VALUE) {
            if (divisor == -1) return Integer.MAX_VALUE;//被除数为int型最小值，除数为-1，结果为溢出
            res = 1;
            dividend += Math.abs(divisor);
        }
        if (divisor == Integer.MIN_VALUE) {//如果分母为
            return res;
        }
        int a = Math.abs(dividend);
        int b = Math.abs(divisor);
        for (; a >= b; ) {
            tmp = b;
            for (int i = 0; a >= tmp && tmp > 0; ++i, tmp <<= 1) {
                a -= tmp;
                res += 1 << i;
            }
        }
        return flag * res;//通过最高的异或值确定结果的正负
    }
}
