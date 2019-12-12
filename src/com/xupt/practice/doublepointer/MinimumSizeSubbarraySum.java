package com.xupt.practice.doublepointer;

public class MinimumSizeSubbarraySum {
    public int minSubArrayLen(int s, int[] nums) {
        int res=0;
        int i=0;
        int min=Integer.MAX_VALUE;
        while(true){
            if(i>=nums.length){
                break;
            }
            int j=i;
            int sum=0;
            while(sum<s&&j<nums.length){
                sum+=nums[j++];
            }
            if(sum>=s){
                if(j-i<min){
                    min=j-i;
                }
            }
            i++;
        }
        if(min==Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
}
