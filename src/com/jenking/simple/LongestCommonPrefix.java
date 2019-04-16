package com.jenking.simple;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 */
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs==null||strs.length<=0)return "";
        String result = "";
        int minLength = strs[0].length();
        for (int i = 0;i<strs.length;i++){
            minLength = Math.min(minLength,strs[i].length());
            //System.out.println("minLength:"+minLength);
        }
        for (int i = 0;i<minLength;i++) {
            char cur = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (cur != strs[j].charAt(i))
                    return result;
            }
            result = result+cur;
        }
        return result;
    }

    public static void main(String args[]){
        String[] strs = {"abcd","abcde","abcnnnmm"};
        System.out.println(longestCommonPrefix(strs));
    }
}
