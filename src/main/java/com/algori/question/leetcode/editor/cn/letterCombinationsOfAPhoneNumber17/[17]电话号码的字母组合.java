package com.algori.question.leetcode.editor.cn.letterCombinationsOfAPhoneNumber17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    HashMap<Character, List<Character>> map = new HashMap<Character, List<Character>>() {{
        put('2', Arrays.asList('a', 'b', 'c'));
        put('3', Arrays.asList('d', 'e', 'f'));
        put('4', Arrays.asList('g', 'h', 'i'));
        put('5', Arrays.asList('j', 'k', 'l'));
        put('6', Arrays.asList('m', 'n', 'o'));
        put('7', Arrays.asList('p', 'q', 'r', 's'));
        put('8', Arrays.asList('t', 'u', 'v'));
        put('9', Arrays.asList('w', 'x', 'y', 'z'));
    }};

    public List<String> letterCombinations(String digits) {
        StringBuilder sb = new StringBuilder();
        List<String> res = new ArrayList<>();
        backTrack(digits, 0, sb, res);
        return res;
    }

    private void backTrack(String digits, int i, StringBuilder sb, List<String> res) {
        if(sb.length() == digits.length()) {
            if(sb.length() > 0) {
                res.add(sb.toString());
            }
            return;
        }
        char digit = digits.charAt(i);
        List<Character> characters = map.get(digit);
        for(Character character : characters) {
            sb.append(character);
            backTrack(digits, i + 1, sb, res);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
