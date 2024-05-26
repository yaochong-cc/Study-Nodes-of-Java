package com.hspedu.pkg;

import com.hspedu.modifier.A;

public class Test {
    public static void main(String[] args) {
        A a =new A();
        //在不同包下，只能访问public；
        System.out.println(a.n1);
    }
}
