package com.jenking.simple;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 示例 1:
 *
 * 输入: 121
 * 输出: true
 * 示例 2:
 *
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 *
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 */
public class IsPalindrome {
    public static boolean isPalindrome(int x) {
        if (x<0)return false;
        int[] array = getIntArray(x);
        for (int i = array.length/2-1;i>=0;i--){
            if (array[i]!=array[array.length-i-1]){
                return false;
            }
        }
        return true;
    }
    public static int[] getIntArray(int x){
        int[] result = new int[getSize(x)];
        for (int i = result.length-1;i>=0;i--){
            result[i] = x%10;
            x = x/10;
        }
        return  result;
    }

    public static int getSize(int x){
        int size = 0;
        while(x>0){
            size++;
            x=x/10;
        }
        return size;
    }

    public static void main(String args[]){
        System.out.println(isPalindrome(11011)+"");
    }
}
