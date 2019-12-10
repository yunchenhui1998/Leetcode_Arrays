package com.xupt.practice.doublepointer;

public class TwoSumII {
    //以下为暴力解法
//    public int[] twoSum(int[] numbers, int target) {
//        int[] res=new int[2];
//        for(int i=0;i<numbers.length-1;i++){
//            res[0]=i+1;
//            for(int j=i+1;j<numbers.length;j++){
//                res[1]=j+1;
//                if(target==numbers[i]+numbers[j]){
//                    return res;
//                }
//            }
//        }
//            return null;
//    }
    //以下为双指针解法
    public int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end=numbers.length-1;
        while(start<end){
            if(target==numbers[start]+numbers[end]){
                return new int[]{start+1,end+1};
            }
            else if(target>numbers[start]+numbers[end]){
                start++;
            }
            else
                end--;
        }
        return new int[]{-1,-1};
    }
}
