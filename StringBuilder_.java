package com.stringbulider_;

public class StringBuilder_ {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        //StringBuilder 的直接父类是AbstractStringBuilder，
        //实现了Serializable接口，即StringBuilder的对象可以串行化(可以网络传输，可以保存到文件）
        // StringBuilder 是final类，不能被继承；
        //字符序列存放在堆中
        //StringBuildr 的方法没有做互斥处理，即没有synchronized 关键字，单线程情况下使用StringBuilder。

    }
}
