package com.jenking.simple;

/**
 * 给定两个字符串 A 和 B, 寻找重复叠加字符串A的最小次数，使得字符串B成为叠加后的字符串A的子串，如果不存在则返回 -1。
 *
 * 举个例子，A = "abcd"，B = "cdabcdab"。
 *
 * 答案为 3， 因为 A 重复叠加三遍后为 “abcdabcdabcd”，此时 B 是其子串；A 重复叠加两遍后为"abcdabcd"，B 并不是其子串。
 *
 * 注意:
 *
 *  A 与 B 字符串的长度在1和10000区间范围内。
 */
public class RepeatedStringMatch {

    public int repeatedStringMatch(String A, String B) {
        StringBuilder stringBuilder = new StringBuilder(A);
        int result = 0;
        int lenA = A.length();
        int lenB = B.length();
        int lenStr = lenA;
        while (lenStr<lenB){
            result++;
            stringBuilder.append(A);
            lenStr +=lenA;
        }
        String tempStr = stringBuilder.toString();
        if (!tempStr.contains(B)){
            tempStr += A;
            result++;
            if (!tempStr.contains(B))return -1;
        }
        return result;
    }
}
