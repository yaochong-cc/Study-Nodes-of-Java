package com.arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortCustom {
    public static void main(String[] args) {
        int []arr ={1,-1,8,0,20};
//        bobble01(arr);
//        System.out.println(Arrays.toString(arr));

        bobble02(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1=(Integer) o1;
                int i2 =(Integer) o2;
                return i2-i1;
            }
        });
        System.out.println(Arrays.toString(arr));
    }

    //冒泡：
    public static void bobble01(int arr[]){
        int tem=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    tem=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tem;
                }
            }
        }
    }
    //冒泡+定制
    public static void bobble02(int[]arr, Comparator c){
        int tem=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(c.compare(arr[i],arr[j])>0){
                    tem=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tem;
                }
            }
        }
    }

}
