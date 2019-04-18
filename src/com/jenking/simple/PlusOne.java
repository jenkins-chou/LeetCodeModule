package com.jenking.simple;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 示例 1:
 *
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 示例 2:
 *
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        int len = digits.length;
        int lastSum = digits[len-1]+1;
        if(lastSum<=9){
            digits[len-1] = digits[len-1]+1;
            return digits;
        }else{
            carry = lastSum/10;
            digits[len-1] = 0;
            for(int i = digits.length-2;i>=0;i--){
                int temp = digits[i]+carry;
                if(temp<=9){
                    digits[i] = temp;
                    carry = 0;
                }else{
                    digits[i] = 0;
                    carry = temp/10;
                }
            }
            if(carry>=1){
                int[] result = new int[len+1];
                result[0] = carry;
                for(int i = 0;i<len;i++){
                    result[i+1] = digits[i];
                }
                return result;
            }else{
                return digits;
            }
        }
    }
}
