package com.jenking.simple;

import java.util.HashSet;

/**
 * 给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。
 *
 * 示例 1:
 *
 * 输入: "abab"
 *
 * 输出: True
 *
 * 解释: 可由子字符串 "ab" 重复两次构成。
 * 示例 2:
 *
 * 输入: "aba"
 *
 * 输出: False
 * 示例 3:
 *
 * 输入: "abcabcabcabc"
 *
 * 输出: True
 *
 * 解释: 可由子字符串 "abc" 重复四次构成。 (或者子字符串 "abcabc" 重复两次构成。)
 */
public class RepeatedSubstringPattern {

    public boolean repeatedSubstringPattern(String s) {
        if (s==null||s.equals(""))return false;
        int len = s.length();
        int lenSqrt = (int)Math.sqrt(len);
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        for (int i = 2;i<=lenSqrt;i++){
            if (len%i == 0){
                set.add(i);
                set.add(len/i);
            }
        }
        for (int n:set){
            String temp = s.substring(0,n);
            int i;
            for (i = n;i<len;i=i+n){
                if (!temp.equals(s.substring(n,i+n)))break;

            }
            if(i == len) return true;
        }
        return false;
    }

    public boolean repeatedSubstringPattern2(String s) {
        int len = s.length();
        if(len == 1) return false;
        int lenSqrt = (int)Math.sqrt(len);
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        for (int i = 2; i <= lenSqrt ; i++) {
            if(len % i == 0){
                set.add(i);
                set.add(len/i);
            }
        }

        for (int n: set) {
            String temp = s.substring(0,n);
            int i ;
            for (i = n; i < len; i = i + n) {
                if(!temp.equals(s.substring(i,i + n))) break;
            }
            if(i == len) return true;
        }
        return false;
    }
}
