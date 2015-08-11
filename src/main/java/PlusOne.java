/**
 * Created by qinjuntao on 2015/8/11.
 * https://leetcode.com/problems/plus-one/
 */
public class PlusOne {
    public class Solution {
        public int[] plusOne(int[] digits) {
            int carry = 1;
            int[] answer = null;
            for (int i = digits.length - 1; i >= 0; --i) {
                digits[i] = digits[i] + carry;
                carry = digits[i] / 10;
                digits[i] = digits[i] % 10;
            }
            if (carry == 1) { //最高位还有进位
                answer = new int[digits.length + 1];
                answer[0] = 1;
                for (int i = 1; i < answer.length; ++i) {
                    answer[i] = digits[i - 1];
                }
            } else {
                answer = digits;
            }
            return answer;
        }
    }
}
