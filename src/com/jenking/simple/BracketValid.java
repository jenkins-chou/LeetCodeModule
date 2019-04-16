package com.jenking.simple;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 *
 * 输入: "()"
 * 输出: true
 * 示例 2:
 *
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 *
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 *
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 *
 * 输入: "{[]}"
 * 输出: true
 */
public class BracketValid {
    private Map<Character,Character> params;
    public BracketValid(){
        params = new HashMap<>();
        params.put(')','(');
        params.put('}','{');
        params.put('[',']');

    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if (params.containsKey(c)){
                char temp = stack.empty()?'?':stack.pop();
                if (temp!=params.get(temp)){
                    return false;
                }
            }else{
                //开括号入栈
                stack.push(c);
            }
        }
        return stack.empty();
    }
}
