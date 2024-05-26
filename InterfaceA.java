package com.interface_;

public interface InterfaceA {
    public int n1=10;

    public void hi();
    default void hello(){
        System.out.println("Hello from InterfaceA");
    }
    static void bye(){
        System.out.println("Goodbye from InterfaceA");
    }

}
//JDK7 interface里全是抽象方法
//JDK8 interface里可以有默认方法和静态方法，需要default关键字修饰
//JDK8 interface里可以有静态方法.

class A implements InterfaceA {
    public void hi(){
        System.out.println("Hello from A");
    }
}
