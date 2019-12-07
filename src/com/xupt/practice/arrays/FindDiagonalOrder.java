package com.xupt.practice.arrays;

public class FindDiagonalOrder {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix.length==0||matrix[0].length==0){
            return new int[0];
        }
        int rows=matrix.length;
        int cols=matrix[0].length;
        int[] res=new int[rows*cols];
        int i=0;
        int j=0;
        for(int n=0;n<rows*cols;n++){
            res[n]=matrix[i][j];
            if((i+j)%2==0){
                //下面if代码顺序不可变，因为右上角元素进行的是行加操作
                if(j==cols-1){
                    i++;
                }
                else if(i==0){
                    j++;
                }
                else{
                    i--;
                    j++;
                }
            }
            else{
                //下面if代码顺序不可变，因为左下角元素进行的是列加操作
                if(i==rows-1){
                    j++;
                }
                else if(j==0){
                    i++;
                }
                else{
                    i++;
                    j--;
                }
            }
        }
        return res;
    }
}
