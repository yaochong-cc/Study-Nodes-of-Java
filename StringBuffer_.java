package com.stringbuffer_;

public class StringBuffer_ {
    public static void main(String[] args) {
        //创建一个大小为16 的char[] ，用于存放字符内容
        StringBuffer sb = new StringBuffer();
        //StringBuffer 的直接父类是AbstractStringBuilder，
        //StringBuffer 实现了Serializable接口，即StringBuffer的对象可以串行化
        //  byte[] value; value 数组存放在堆中，不在常量池
        // StringBuffer 是final类，不能被继承；
        //StringBuffer 效率高于String,增加或减少时不用新的地址




        //通过构造器指定char[]的大小
        StringBuffer s2=new StringBuffer(89);
        //通过给一个String 创建一个StringBuffer,char[] 大小就是str.length()+1
        StringBuffer s3 =new StringBuffer("hello");

    }
}
