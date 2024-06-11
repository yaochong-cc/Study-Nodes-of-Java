package com.stringbuffer_;

public class StringAndStringBuffer {
    public static void main(String[] args) {
        //String -->StringBuffer
        //使用构造器
        String str="hello tom";
        StringBuffer sb=new StringBuffer(str);//返回的是StringBuffer 对象，对str本身没有影响。
        //使用append方法；
        StringBuffer sb1=new StringBuffer();
        sb1 =sb1.append(str);

        //StringBuffer-->String
        StringBuffer sb3=new StringBuffer("helloworld");
        //方法一：toString
        String s=sb3.toString();
        //方法二：使用构造器
        String s1=new String(sb3);
    }
}
