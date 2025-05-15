package com.algori.question.classic150;

/**
 * @author qiuzhiyi
 * @date 2025/02/11
 */
public class Number165 {

    public int compareVersion(String version1, String version2) {
        String[] split1 = version1.split("\\.");
        String[] split2 = version2.split("\\.");
        int maxLen = Math.max(split1.length, split2.length);
        for(int i = 0; i < maxLen; i++) {
            int subVersion1 = 0;
            int subVersion2 = 0;
            if(i > split1.length - 1) {
                subVersion2 = Integer.parseInt(split2[i]);
            } else if(i > split2.length - 1) {
                subVersion1 = Integer.parseInt(split1[i]);
            } else {
                subVersion1 = Integer.parseInt(split1[i]);
                subVersion2 = Integer.parseInt(split2[i]);
            }
            if(subVersion1 < subVersion2) {
                return -1;
            } else if(subVersion1 > subVersion2) {
                return 1;
            }
        }
        return 0;
    }
}
