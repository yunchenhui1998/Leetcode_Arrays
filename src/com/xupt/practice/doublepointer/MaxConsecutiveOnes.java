package com.xupt.practice.doublepointer;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                int count=i;
                while(++count<nums.length&&nums[count]==1);
                if((count-i)>max){
                    max=count-i;
                }
            }
        }
        return max;
    }
}
