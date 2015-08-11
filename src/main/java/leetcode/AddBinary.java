package leetcode;

/**
 * Created by qinjuntao on 2015/8/11.
 * https://leetcode.com/problems/add-binary/
 */
public class AddBinary {
    public class Solution {
        public String addBinary(String a, String b) {
            int carry = 0;
            int tmp;
            int i;
            StringBuilder builder = new StringBuilder();
            a = new StringBuilder(a).reverse().toString();
            b = new StringBuilder(b).reverse().toString();
            for (i = 0; i < a.length() && i < b.length(); ++i) {
                tmp = a.charAt(i) - '0' + b.charAt(i) - '0' + carry;
                if (tmp % 2 == 0) {
                    builder.append("0");
                } else {
                    builder.append("1");
                }
                if (tmp > 1) {
                    carry = 1;
                } else {
                    carry = 0;
                }
            }
            for (; i < a.length(); ++i) {
                tmp = a.charAt(i) - '0' + carry;
                if (tmp % 2 == 0) {
                    builder.append("0");
                } else {
                    builder.append("1");
                }
                if (tmp > 1) {
                    carry = 1;
                } else {
                    carry = 0;
                }
            }
            for (; i < b.length(); ++i) {
                tmp = b.charAt(i) - '0' + carry;
                if (tmp % 2 == 0) {
                    builder.append("0");
                } else {
                    builder.append("1");
                }
                if (tmp > 1) {
                    carry = 1;
                } else {
                    carry = 0;
                }
            }
            if (carry == 1)
                builder.append("1");
            return builder.reverse().toString();
        }
    }
}
