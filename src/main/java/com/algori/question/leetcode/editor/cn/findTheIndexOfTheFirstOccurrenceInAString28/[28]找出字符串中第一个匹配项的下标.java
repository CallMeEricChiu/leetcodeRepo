package com.algori.question.leetcode.editor.cn.findTheIndexOfTheFirstOccurrenceInAString28;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int strStr(String haystack, String needle) {

        for(int start = 0; start <= haystack.length() - needle.length(); start++) {
            int i = start, j = 0;
            while(i < haystack.length() && j < needle.length()) {
                if(haystack.charAt(i) != needle.charAt(j)) {
                    break;
                } else {
                    i++;
                    j++;
                }
            }
            if(j == needle.length()) {
                return start;
            }
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
