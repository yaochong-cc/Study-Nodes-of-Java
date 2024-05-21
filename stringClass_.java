package com.class_;

public class stringClass_ {

    static void upperString(String s){
    System.out.println(s);
    s = s.toUpperCase();
    System.out.println(s);
    }
    static void compareString(String s1,String s2){

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));//忽略大小写
    }
    static void subStirng(String s1,CharSequence  s2){
        System.out.println(s1.contains(s2));
//        "注意到contains()方法的参数是CharSequence而不是String，因为CharSequence是String实现的一个接口。"
//        好像Stirng也行？

    }
    static void findSubString(String s1,String s2){
        System.out.println(s1.indexOf(s2));
        System.out.println(s1.lastIndexOf(s2));
    }
    static void findCharacter(String s1,char ch){
        System.out.println(s1.indexOf(ch));
        System.out.println(s1.lastIndexOf(ch));
        //indexOf 和lastIndexOf 的参数是什么？？
    }
    static void getSubstring(String s1){
        System.out.println(s1.substring(2));//下标2的字符极其之后的所以字符

        System.out.println(s1.substring(2,4));
    }
    static void reverseBlank(String s1,String s2){
        System.out.println(s1.trim());//去除首尾空白字符
//        trim()并没有改变字符串的内容，而是返回了一个新字符串。
        System.out.println(s2.strip());
//        strip()方法也可以移除字符串首尾空白字符。它和trim()不同的是，类似中文的空格字符\u3000也会被移除：
        System.out.println(s1.stripLeading());
        System.out.println(s1.stripTrailing());
//        s1.stripLeading() 方法用于去除字符串开头的空白字符。
//        s1.stripTrailing() 方法用于去除字符串末尾的空白字符。
    }
    static void isEmpty(String s){
        System.out.println(s+" is "+s.isEmpty());
        System.out.println(s+" is "+s.isBlank());
//isEmpty()方法用于检查字符串是否为空，而isBlank()方法用于检查字符串是否为空白字符串
    }
    static void replaceString(String s,char c1,char c2,String s1,String s2){
        System.out.println(s.replace(c1,c2));//把字符串中的c1全部替换为c2
        System.out.println(s.replace(s1,s2));

    }
    static void splitString(String s){
        //正则表达式
//        不懂？

        String[] ss = s.split("\\,"); // {"A", "B", "C", "D"}
        System.out.println(ss);
    }
    static void joinStirng(){
        String[] arr = {"A", "B", "C"};
        String s = String.join("***", arr); // "A***B***C"
        System.out.println(s);
    }
    static void formatString(){
        String s = "Hi %s, your score is %d!";
        System.out.println(s.formatted("Alice", 80));
        System.out.println(String.format("Hi %s, your score is %.2f!", "Bob", 59.5));
    }
    static void convertStirng(){//类型转换
//
//        要把任意基本类型或引用类型转换为字符串，可以使用静态方法valueOf()。这是一个重载方法，编译器会根据参数自动选择合适的方法：
        System.out.println(String.valueOf(123));// "123"
        System.out.println(String.valueOf(45.67)); // "45.67"
        System.out.println(String.valueOf(true)); // "true"
        System.out.println(String.valueOf(new Object())); // 类似java.lang.Object@636be97c

//        要特别注意，Integer有个getInteger(String)方法，它不是将字符串转换为int，而是把该字符串对应的系统变量转换为Integer：
//
//        Integer.getInteger("java.version"); // 版本号，11

        String javaVersion = System.getProperty("java.version");
        System.out.println("Java Version: " + javaVersion);
//        String和char[]类型可以互相转换，方法是：
        char[] cs = "Hello".toCharArray();
        String s = new String(cs);
        System.out.println(s);
        cs[0] = 'X';
        System.out.println(cs);
        System.out.println(s);
//        这是因为通过new String(char[])创建新的String实例时，
//        它并不会直接引用传入的char[]数组，
//        而是会复制一份，所以，
//      修改外部的char[]数组不会影响String实例内部的char[]数组，
//      因为这是两个不同的数组。
    }
    public static void main(String[] args) {
        upperString("HelloWorld");//无法从 static 上下文引用非 static 方法
        System.out.println("--------");
        compareString("hello","HEllo");
        System.out.println("--------");
        subStirng("Hello","lx");
        System.out.println("--------");
        findSubString("Helloell0","ello");
        System.out.println("--------");
        findCharacter("Hello",'l');
        System.out.println("---------");
        getSubstring("HelloWhatAreYouDoing");
        System.out.println("---------");
        reverseBlank(" hello  \n","\u3000fffc\u3000");
        System.out.println("----------");
        isEmpty("");
        isEmpty(" ");
        isEmpty(" \n");
        isEmpty("Hello");
        System.out.println("------------");
        replaceString("hello",'l','a',"ell","k");
        System.out.println("------------");
        splitString( "A,,B;C ,D");
        System.out.println("-------------");
        joinStirng();
        System.out.println("--------------");
        formatString();
        System.out.println("--------------");
        convertStirng();
    }


}
