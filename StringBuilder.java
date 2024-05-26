package com.class_;

public class StringBuilder {
    public static void main(String[] args) {
        // 为了能高效拼接字符串，Java标准库提供了StringBuilder，
        // 它是一个可变对象，可以预分配缓冲区，这样，往StringBuilder中新增字符时，
        // 不会创建新的临时对象：
        java.lang.StringBuilder sb = new java.lang.StringBuilder(1024);
        for (int i = 0; i < 1000; i++) {
            sb.append(',');
            sb.append(i);
        }
        String s = sb.toString();
        System.out.println(s);
        System.out.println("--------------");

        java.lang.StringBuilder sa = new java.lang.StringBuilder(1024);
        sa.append("Mr ")
                .append("Bob")
                .append("!")
                .insert(0, "Hello, ");
        System.out.println(sa.toString());
    }
}


