package com.generic_;

public class Generic03 {
    public static void main(String[] args) {
        Person<String> p = new Person<String>("Hello");

//        相当于：
//        class Person<String>{
//            String s;//E表示s 的数据类型，该数据类型在定义Person对象的时候指定，即在编译 期间确定 E的类型
//            public Person(String s){//E也可以是参数类型
//                this.s=s;
//            }
//            public String f(){//E也可以是返回类型
//                return s;
//            }
//        }
        Person<Integer> p2 = new Person<>(100);



    }
}
//泛型的作用是：可以在类声明时通过一个标识表示类中某个属性的类型
//或者是某个方法的返回值的类型，或者是参数类型
class Person<E>{
    E s;//E表示s 的数据类型，该数据类型在定义Person对象的时候指定，即在编译 期间确定 E的类型
    public Person(E s){//E也可以是参数类型
        this.s=s;
    }
    public E f(){//E也可以是返回类型
        return s;
    }
}