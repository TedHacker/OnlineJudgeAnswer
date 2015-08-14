package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qinjuntao on 2015/8/14.
 * https://leetcode.com/problems/gray-code/
 * <p/>
 * 二进制码→格雷码（编码）：
 * 此方法从对应的n位二进制码字中直接得到n位格雷码码字，步骤如下：
 * 对n位二进制的码字，从右到左，以0到n-1编号
 * 如果二进制码字的第i位和i+1位相同，则对应的格雷码的第i位为0，否则为1（当i+1=n时，二进制码字的第n位被认为是0，即第n-1位不变）[3]
 * 公式表示：（G：格雷码，B：二进制码）
 * <p/>
 * 格雷码→二进制码（解码）：
 * 从左边第二位起，将每位与左边一位解码后的值异或，作为该位解码后的值（最左边一位依然不变）。依次异或，直到最低位。依次异或转换后的值（二进制数）就是格雷码转换后二进制码的值。
 * 公式表示：（G：格雷码，B：二进制码）
 */
public class GrayCode {
    public class Solution {
        public List<Integer> grayCode(int n) {
            int len = 1 << n;
            List<Integer> res = new ArrayList<Integer>(len);
            for (int i = 0; i < len; ++i) {
                int tmp = i ^ (i >> 1);
                res.add(tmp);
            }
            return res;
        }
    }
}
