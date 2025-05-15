package com.algori.question.classic150;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number93 {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        backtrack(new ArrayList<>(), s, 0, res);
        return res;
    }

    private void backtrack(List<String> ipList, String s, int start, List<String> res) {
        if (ipList.size() >= 4 && start < s.length()) {
            return;
        }
        if(start >= s.length()) {
            if(ipList.size() == 4) {
                String ip = String.join(".", ipList);
                res.add(ip);
            }
            return;
        }
        for(int i = 1; i <= Math.min(3, s.length() - start); i++) {
            String subIp = s.substring(start, start + i);
            if(("0".equals(subIp)) || (!subIp.startsWith("0") && Integer.parseInt(subIp) <= 255)) {
                ipList.add(subIp);
                backtrack(ipList, s, start + i, res);
                ipList.remove(ipList.size() - 1);
            }
        }
    }
}
