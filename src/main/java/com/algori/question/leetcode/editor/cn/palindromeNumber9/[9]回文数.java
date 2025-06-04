package com.algori.question.leetcode.editor.cn.palindromeNumber9;

import java.util.Stack;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        } else if(x == 0) {
            return true;
        } else {
            int num = 0;
            int y = x;
            while(y > 0) {
                y = y / 10;
                num++;
            }
            Stack<Integer> stack = new Stack<>();
            for(int i = 1; i <= num / 2; i++) {
                stack.push(x % 10);
                x = x / 10;
            }
            if(num % 2 == 1) {
                x = x / 10;
            }
            while(!stack.isEmpty()) {
                if(stack.peek() == x % 10) {
                    x = x / 10;
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
