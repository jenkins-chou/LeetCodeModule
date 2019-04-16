package com.jenking.simple;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        for(int i = 0;i<nums.length-1;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static void main(String args[]){
        int[] source = new int[]{2, 7};
        int target = 22;

        int result[] = twoSum(source,target);
        for (int i = 0;i<result.length;i++){
            System.out.println(result[i]);
        }

    }
}
