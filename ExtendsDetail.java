package com.hspedu.extend_;

public class ExtendsDetail {
    public static void main(String[] args) {
        Sub sub=new Sub();
//        sub.sayOk();
        System.out.println("===第二个===");
        Sub sub2 =new Sub("java");
        System.out.println("===第三个===");
        Sub sub3 =new Sub("king ",10);
    }
}
