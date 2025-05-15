package com.algori.question.classic150;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number139 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("cats");
        list.add("dog");
        list.add("sand");
        list.add("and");
        list.add("cat");
        Number139 number139 = new Number139();
        boolean catsandog = number139.wordBreak("catsandog", list);
        System.out.println(catsandog);
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        int length = s.length();
        boolean[] dp = new boolean[length + 1];
        dp[0] = true;

        for(int i = 1; i <= length; i++) {
            for(String string : wordDict) {
                if(i - string.length() >= 0 && s.startsWith(string, i - string.length()) && dp[i - string.length()]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[length];
    }
}
