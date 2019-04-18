package com.jenking.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 *
 *
 *
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 *
 * 输入: 5
 * 输出:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 */
public class GenerateYanghuiTriangle {
    public List<List<Integer>> generate(int numRows) {
        String s = new String();
        s.toLowerCase();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(numRows<=0) return result;
        result.add(new ArrayList<Integer>());
        result.get(0).add(1);

        for(int i = 1;i<numRows;i++){

            List<Integer> row = new ArrayList<Integer>();
            List<Integer> preList = result.get(i-1);

            row.add(1);
            for(int j = 1;j<i;j++){
                row.add(preList.get(j-1)+preList.get(j));
            }
            row.add(1);
            result.add(row);
        }
        return result;
    }
}
