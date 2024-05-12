package com.hspedu.pkg;

////最好使用第一种
//import java.util.Scanner;
//import java.util.*;//包下的所有类都导入

import java.util.Arrays;

//用Array 完成数组排序
public class Import01 {
    public static void main(String[] args) {
        int[]arr={-1,20,2,13,3};
        Arrays.sort(arr);
        //输出
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
