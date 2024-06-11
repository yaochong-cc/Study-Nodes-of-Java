package com.arrays_;

import java.util.Arrays;
import java.util.List;

public class ArraysMethod02 {
    public static void main(String[] args) {
        Integer[] arr={1,2,90,223,456};
        int index= Arrays.binarySearch(arr,1);//有序的
        System.out.println(index);

        //如果数组中不存在该元素，就返回 -(low+1)
        int index02=Arrays.binarySearch(arr,399);//-(4+1)
        System.out.println(index02);


        //copyOf :数组元素的复制
        Integer[] newArray =Arrays.copyOf(arr,arr.length-1);//[,)
        System.out.println(Arrays.toString(newArray));
        //如果拷贝的长度> arr.length ,就增加null

        //fill ：数组元素填充
        Integer[] num=new Integer[]{9,3,2};
        Arrays.fill(num,33);
        System.out.println(Arrays.toString(num));

        //equals;
        Integer[] arr2=new Integer[]{1,2,3,4};
        boolean equals=Arrays.equals(arr,arr2);
        System.out.println(equals);

        //asList
        //返回的asList 编译类型是List接口
        List<Integer> asList =Arrays.asList(2,3,4,5,6);
        System.out.println("asList="+asList);
        System.out.println("asList 的运行类型是"+asList.getClass());
    }
}
