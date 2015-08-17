package leetcode;

/**
 * Created by qinjuntao on 2015/8/17.
 * https://leetcode.com/problems/add-digits/
 * 资料：https://en.wikipedia.org/wiki/Digital_root
 * 构造法
 * 数字根
 * 任何一个整数模9同余于它的各数位上数字之和
 * 即当n!=9时，f(n)=n%9，当n=9时，f(n)=9
 * 因为f(n+1)=(n+1)%9=(n%9+1)%9
 * 所以f(n)=((n-1)%9+1)%9 去掉最外层%9就避免了n=9时,f(9)=0的意外
 */
public class AddDigits {
    public class Solution {
        public int addDigits(int num) {
            if (num == 0) return 0;
            else return (num - 1) % 9 + 1;
        }
    }
}
