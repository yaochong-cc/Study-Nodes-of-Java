package com.hspedu.override;

//Dog是Animal的子类
//Dog 和Animal 的cry方法形式一致（名称，返回类型，参数）
//这是就说Dog的cry重新了Animal的cry
public class Override01 {
    public static void main(String[] args) {
        Dog dog =new Dog();
        dog.cry();
    }

}
