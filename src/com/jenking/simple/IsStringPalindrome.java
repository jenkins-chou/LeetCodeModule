package com.jenking.simple;

/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 示例 1:
 *
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 *
 * 输入: "race a car"
 * 输出: false
 */
public class IsStringPalindrome {
    public boolean isPalindrome(String s) {
        try{
            s= s.toLowerCase();//将大写字母转化为小写字母
            int len = s.length();
            int i = 0,j=len-1;
            while(i<j){
                while(!isValid(s.charAt(i))){
                    i++;
                }
                while(!isValid(s.charAt(j))){
                    j--;
                }
                if(s.charAt(i)==s.charAt(j)){
                    i++;
                    j--;
                    continue;
                }else{
                    return false;
                }
            }

        }catch(Exception e){
            return true;
        }
        return true;
    }

    //验证是否为小写字母
    public boolean isValid(char c){
        return (c >='a'&&c<='z')||(c>='0'&&c<='9');
    }
}
