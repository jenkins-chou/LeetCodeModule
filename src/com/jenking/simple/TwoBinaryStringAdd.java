package com.jenking.simple;

/**
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 *
 * 输入为非空字符串且只包含数字 1 和 0。
 *
 * 示例 1:
 *
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 *
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 */
public class TwoBinaryStringAdd {
    /**
     * 这是一个比较笨的方法
     * @param a
     * @param b
     * @return
     */
    public static String addBinary1(String a, String b) {
        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();

        int lengthA = arrayA.length;
        int lengthB = arrayB.length;
        char carry = '0';
        String result = "";

        for (int i = lengthA<lengthB?lengthA-1:lengthB-1;i>=0;i--){
            int x = Integer.parseInt(arrayA[i+(lengthA>lengthB?lengthA-lengthB:0)]+"");
            int y = Integer.parseInt(arrayB[i+(lengthA<lengthB?lengthB-lengthA:0)]+"");
            int z = Integer.parseInt(carry+"");
            int stem = x + y + z;
            carry = '0';
            if (stem>1){
                carry = '1';
                result = (stem-2) + result;
            }else{
                result = stem + result;
            }

            System.out.println(i+":"+result+",carry:"+carry);
        }

        if (lengthA!=lengthB){
            char[] arrayC = lengthA>lengthB?arrayA:arrayB;
            for (int j = Math.abs(lengthA-lengthB)-1;j>=0;j--){
                int x = Integer.parseInt(arrayC[j]+"");
                int y = Integer.parseInt(carry+"");
                int stem = x + y;
                carry = '0';
                if (stem>1){
                    carry = '1';
                    result = (stem-2)+result;
                }else{
                    result = stem + result;
                }
                System.out.println(j+":"+result+",carry:"+carry);
            }
        }
        if (carry=='1'){
            result = carry + result;
        }
        return result;
    }

    public static String addBinary2(String a,String b){
        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();
        int carry = 0,i = arrayA.length-1,j = arrayB.length-1;
        String c = "";
        while (i>=0||j>=0||carry==1){
            int x = Integer.parseInt(i>=0?arrayA[i]+"":"0");
            int y = Integer.parseInt(j>=0?arrayB[j]+"":"0");
            int z = Integer.parseInt(carry+"");
            int stem = x+y+z;
            if (stem>1){
                carry = 1;
                c = (stem%2)+c;
            }else{
                c = stem+c;
            }
            i--;j--;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(addBinary2("101","110010"));
    }
}
