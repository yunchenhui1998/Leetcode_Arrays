package com.xupt.practice.arrays;

public class DominantIndex {
    public int dominantIndexSolution(int[] nums){
        int flag=-1;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                flag=i;
            }
        }
        for(int n:nums){
            if(n!=max){
                if(max<n*2){
                    flag=-1;
                }
            }
        }
        return flag;
    }
}
