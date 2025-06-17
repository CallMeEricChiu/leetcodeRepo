package com.algori.question.leetcode.editor.cn.longestSubstringWithAtLeastKRepeatingCharacters395;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestSubstring(String s, int k) {
        return backTrack(s, k, 0, s.length() - 1);
    }

    private int backTrack(String s, int k, int l, int r) {
        int[] cnt = new int[26];
        for(int i = l; i <= r; i++) {
            cnt[s.charAt(i) - 'a']++;
        }
        char split = 0;
        for(int i = 0; i < 26; i++) {
            if(cnt[i] > 0 && cnt[i] < k) {
                split = (char)(i + 'a');
                break;
            }
        }
        if(split == 0) {
            return r-l+1;
        }
        int res = 0;
        int end = l;
        while(end <=r) {

            while(end <= r && s.charAt(end) == split) {
                end++;
            }
            if(end > r) {
                break;
            }
            int start = end;
            while(end <= r && s.charAt(end) != split) {
                end++;
            }
            int subRes = backTrack(s, k, start, end - 1);
            res = Math.max(res, subRes);
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
