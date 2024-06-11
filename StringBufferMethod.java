package com.stringbuffer_;

public class StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("hello");
        //增
        sb.append(',');
        sb.append("张三");
        sb.append("李四").append(100).append(true).append(121.3);
        System.out.println(sb);
        //删 [,)
        sb.delete(11,14);//[11,14)
        System.out.println(sb);
        //改
        sb.replace(8,10,"哈哈哈哈");
        System.out.println(sb);
        //查
        int index = sb.indexOf("张三");//首次出现"张三" 的索引
        System.out.println(index);

        int index2 = sb.indexOf("李四");//首次出现"张三" 的索引
        System.out.println(index2);
        //插
        sb.insert(8,"李四");//在索引为8的地方插入，其他的索引自动后移
        System.out.println(sb);
        //长度
        System.out.println(sb.length());

    }
}
