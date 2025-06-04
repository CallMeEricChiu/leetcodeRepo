package com.algori.question.leetcode.editor.cn;
//给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。 
//
// 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。 
//
// 
// 例如，121 是回文，而 123 不是。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：x = 121
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：x = -121
//输出：false
//解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
// 
//
// 示例 3： 
//
// 
//输入：x = 10
//输出：false
//解释：从右向左读, 为 01 。因此它不是一个回文数。
// 
//
// 
//
// 提示： 
//
// 
// -2³¹ <= x <= 2³¹ - 1 
// 
//
// 
//
// 进阶：你能不将整数转为字符串来解决这个问题吗？ 
//
// Related Topics 数学 👍 3014 👎 0


import java.util.Stack;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean palindrome = solution.isPalindrome(1221);
    }

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
