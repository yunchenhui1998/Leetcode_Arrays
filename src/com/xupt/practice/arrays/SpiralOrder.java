package com.xupt.practice.arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix==null||matrix.length==0||matrix[0]==null||matrix[0].length==0){
            return null;
        }
        int rows=matrix.length;
        int cols=matrix[0].length;
        int boraderLeft=0;
        int borderUp=0;
        int borderDown=rows-1;
        int borderLeft=0;
        int borderRight=cols-1;
        List<Integer> res=new ArrayList<>();
        while(true){
            for(int j=borderLeft;j<=borderRight;j++){
                res.add(matrix[borderUp][j]);
            }
            if(++borderUp>borderDown){break;}
            for(int i=borderUp;i<=borderDown;i++){
                res.add(matrix[i][borderRight]);
            }
            if(--borderRight<borderLeft){break;}
            for(int j=borderRight;j>=borderLeft;j--){
                res.add(matrix[borderDown][j]);
            }
            if(--borderDown<borderUp){break;};
            for(int i=borderDown;i>=borderUp;i--){
                res.add(matrix[i][borderLeft]);
            }
            if(++borderLeft>borderRight){break;}
        }
        return res;
    }
}
