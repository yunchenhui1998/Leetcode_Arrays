package com.xupt.practice.arrays;

public class PivotIndexOfArrays {
    public int pivotIndex(int[] nums) {
        int sum=0,sumLeft=0,sumRight=0;
        for(int n:nums){
            sum+=n;
        }
        for(int i=0;i<nums.length;i++){
            if(i==0){
                sumLeft=0;
            }
            else{
                sumLeft+=nums[i-1];
            }
            sumRight=sum-sumLeft-nums[i];
            if(sumRight==sumLeft){
                return i;
            }
        }
        return -1;
    }
}
