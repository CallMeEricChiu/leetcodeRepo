package com.algori.question.classic150;

import java.util.Objects;
import java.util.Stack;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number71 {

    public String simplifyPath(String path) {
        String[] subPaths = path.split("/");
        Stack<String> stack = new Stack<>();

        for(String subPath : subPaths) {
            if(Objects.equals(subPath, "..")) {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            } else if(!"".equals(subPath) && !".".equals(subPath)){
                stack.push(subPath);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.insert(0, stack.pop());
            sb.insert(0, "/");
        }
        return sb.length() == 0 ? "/" : sb.toString();
    }
}
