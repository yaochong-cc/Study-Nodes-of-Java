package com.arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysMethod {
    public static void main(String[] args) {
        Integer[] integers={1,1,2};
        //遍历
        //for循环
        for(int i:integers){
            System.out.println(i);
        }
        //使用Arrays.toString()
        System.out.println(Arrays.toString(integers));
//        //源码：
//        public static String toString(Object[] a) {
//            if (a == null)
//                return "null";
//
//            int iMax = a.length - 1;
//            if (iMax == -1)
//                return "[]";
//
//            StringBuilder b = new StringBuilder();
//            b.append('[');
//            for (int i = 0; ; i++) {
//                b.append(String.valueOf(a[i]));
//                if (i == iMax)
//                    return b.append(']').toString();
//                b.append(", ");
//            }
//        }

        //排序（sort）：
        Integer arr[] ={1,3,2,90,4,879,-23};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));


        //sort是重载的，可以通过一个接口Comparator 实现定制排序；
//        Arrays.sort(arr, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                Integer i1=(Integer)o1;
//                Integer i2=(Integer)o2;
//                return i2-i1;
//            }
//        });
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(arr));




    }
}
