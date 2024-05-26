package com.exception_;

public class Exception01 {
    public static void main(String[] args) {
        int num1=10;
        int num2=0;
        System.out.println("程序开始执行");
//        int res=num1/num2;//ArithmeticException
        //异常处理机制
        //alt+ctrl+t
        try {
            int res=num1/num2;
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("出现异常的原因："+e.getMessage());
        }
        System.out.println("程序继续运行..");
    }
}
