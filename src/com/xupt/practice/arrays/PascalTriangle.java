package com.xupt.practice.arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        int[][] arr=new int[numRows][numRows];
        for(int i=0;i<numRows;i++){
            List<Integer> subList=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    arr[i][j]=1;
                }else{
                    arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
                }
                subList.add(arr[i][j]);
            }
            list.add(subList);
        }
        return list;
    }
}
