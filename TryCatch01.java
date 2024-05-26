package com.exception_.try_;

public class TryCatch01 {
    public static void main(String[] args) {
        try {
            String str="韩";
            int a =Integer.parseInt(str);
            System.out.println("数字："+a);
        } catch (NumberFormatException e) {
            System.out.println("异常现象："+e.getMessage());
        } finally {
            System.out.println("finally执行");
        }
        System.out.println("继续");
    }
}
