package com.jenking.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
public class lengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int result = 0;
        for (int i = 0;i<s.length();i++){
            for (int j = i+1;j<=s.length();j++){
                if (isUnique(s,i,j)){
                    result = Math.max(result,j-i);
                }
            }
        }
        return result;
    }

    public static boolean isUnique(String a,int start,int end){
        Set<Character> set = new HashSet<>();
        for (int i= start;i<end;i++){
            System.out.print(start+","+end+" ");
            if (set.contains(a.charAt(i))){
                return false;
            }else{
                set.add(a.charAt(i));
            }
        }
        System.out.print("true"+"\n");
        return true;
    }

    public static void main(String args[]){
        System.out.println(lengthOfLongestSubstring("abcddddd"));
    }
}
