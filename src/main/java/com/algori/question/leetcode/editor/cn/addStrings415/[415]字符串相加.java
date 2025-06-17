package com.algori.question.leetcode.editor.cn.addStrings415;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public String addStrings(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int i = len1 - 1, j = len2 - 1;
        int p = 0;
        StringBuilder sb = new StringBuilder();
        while(i >= 0 && j >= 0) {
            int c1 = num1.charAt(i--) - '0';
            int c2 = num2.charAt(j--) - '0';
            int sum = c1 + c2 + p;
            sb.insert(0, (char)('0' + sum % 10));
            p = sum / 10;
        }
        if(i < 0) {
            while(j >= 0) {
                int sum = p + num2.charAt(j--) - '0';
                sb.insert(0, (char)(sum % 10 + '0'));
                p = sum / 10;
            }
        } else {
            while(i >= 0) {
                int sum = p + num1.charAt(i--) - '0';
                sb.insert(0, (char)(sum % 10 + '0'));
                p = sum / 10;
            }
        }
        if(p > 0) {
            sb.insert(0, (char)(p + '0'));
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
