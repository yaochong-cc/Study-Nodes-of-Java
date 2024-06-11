package com.string;

public class StringExercise03 {
    public static void main(String[] args) {
        String str="Hello";
//    str ="Hella";//字符串是不可变的。一个字符串对象一旦被分配，其内容是不可变的。
        String a="hello"+"abc";//只创建了一个对象

        String s1="hello";
        String s2="abc";
        // 先创建一个StringBuilder sb=StringBuilder()
        // 执行 sb.append("hello");
        //     sb.append("abc")
        //String s3=sb.toString()
        //s3 指向堆中的对象(String) value[]-> 池中“helloabc"
        String s3=s1+s2;//一共有三个对象

        String s4="helloabc";
        System.out.println(s3==s4);//F:s3指向堆，s4指向常量池。
        //字符串常量相加，在池里；字符串变量相加，在堆中。
        String s5="hello"+"abc";
        System.out.println(s4==s5);//T

    }
}
