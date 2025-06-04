package com.algori.question.leetcode.editor.cn.romanToInteger13;

import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    Map<Character, Integer> symbolValues = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public int romanToInt(String s) {
        int length = s.length();
        int res = 0;
        for(int i = 0; i < length; i++) {
            Integer val = symbolValues.get(s.charAt(i));
            if(i < length - 1 && val < symbolValues.get(s.charAt(i + 1))) {
                res -= val;
            } else {
                res += val;
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
