package com.exception_.customexception;

public class CustomException {
    public static void main(String[] args) {
        int age= 11;
        if(!(age>=18&&age<=120)){
            throw new AgeException("年龄需要再80到120之间");
        }
        System.out.println("你的年龄范围正确");
    }
}
//一般情况下，自定义异常继承RuntimeException
//把自定义异常做成运行时异常，好处是，可以使用默认的处理机制
class AgeException extends RuntimeException{//自定义运行异常
    public AgeException(String message){//构造器
        super(message);//调用父类构造器RuntimeException-->Exception-->Throwable
    }
}

//throw和throws的区别
//throws 异常处理的一种方式      处于方法声明处  后面跟异常类型
//throw  手动生成异常对象的关键字 处于方法体中   后面跟异常对象