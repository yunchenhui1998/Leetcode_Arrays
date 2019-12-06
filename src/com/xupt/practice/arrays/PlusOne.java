package com.xupt.practice.arrays;

import java.util.Arrays;

public class PlusOne {
    public int[] plusOneSolution(int[] digits){
        //以下注释掉的代码由于数字超出long范围，不可用
//        StringBuilder digit=new StringBuilder("");
//        for(int d:digits){
//            digit.append(d);
//        }
//        long num=Long.parseLong(digit.toString());
//        num=num+1;
//        String res=Long.toString(num);
//        char[] result=res.toCharArray();
//        int[] results=new int[result.length];
//        for(int i=0;i<results.length;i++){
//            results[i]=result[i]-48;
//        }
//        return results;
        int carry=1;
        for(int i=digits.length-1;i>=0;i--){
            if(carry==0){
                return digits;
            }
            int tmp=digits[i]+carry;
            carry=tmp/10;
            digits[i]=tmp%10;
        }
        if(carry==1){
            int[] res=new int[digits.length+1];
            res[0]=1;
            return res;
        }
        return digits;
    }
    public static void main(String[] args){
        PlusOne p=new PlusOne();
        int[] number={1,2,3,4};
        int[] plusNum=p.plusOneSolution(number);
        System.out.println(Arrays.toString(plusNum));
    }
}
