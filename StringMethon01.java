package com.string;

import java.sql.SQLOutput;

public class StringMethon01 {
    public static void main(String[] args) {
        //1.equals：考虑大小写判断是否相等
        String str1 ="hello";
        String str2="Hello";
        System.out.println(str1.equals(str2));

        //equalsIgnoreCase:忽略大小写判断是否相同
        String name="Jhon";
        if("jhon".equalsIgnoreCase(name)){
            System.out.println("Success!");
        }else{
            System.out.println("Failure");
        }
        //获取字符串长度：
        System.out.println("chencheng".length());
        System.out.println("陈程".length());
        //indexOf:获取字符在字符串中第一次出现的索引，索引从0开始。找不到返回-1；
        String str3="cenchenchg";
//        int indexOf= str3.indexOf('c');
//        System.out.println(indexOf);
        int indexOf= str3.indexOf("ch");
        System.out.println(indexOf);//子串中第一次出现ch的索引（c的索引）
        //lastIndexOf :获取字符在字符串中最后一次出现的索引。索引从0开始，找不到返回-1；
//        int lastIndex=str3.lastIndexOf('c');
//        System.out.println(lastIndex);
        int lastIndex=str3.lastIndexOf("ch");
        System.out.println(lastIndex);//子串中最后一次出现ch的索引（c的索引）


        //substring :截取指定范围的子串
        String names="hello,张三";
        System.out.println(names.substring(6));//[6,00)
        System.out.println(names.substring(2,5));//[0,5)

        System.out.println("---------------------------");
        //toUpperCase转换成大写
        String s1="hello";
        System.out.println(s1.toUpperCase());
        //toLowersCase 转换成小写
        String s2="Hello";
        System.out.println(s2.toLowerCase());
        //concat拼接字符串
        String s3="宝玉";
        s3=s3.concat("黛玉").concat("宝钗");
        System.out.println(s3);
        //replace 替换字符串中的字符；
        String s4="宝玉 and 宝钗 宝钗";
        String s5=s4.replace("宝钗","黛玉");//替换所有，前一个是target后一个是replacement.将前一个替换为后一个
        //s4.replace  返回的结果才是替换的，s4没有改变。
        System.out.println(s4);
        System.out.println(s5);
        //split 分割字符串。对于某些分割字符，我们需要转义。
        String poem ="锄禾日当午，汗滴禾下土，谁知盘中餐，粒粒皆辛苦";
        //以 , 为标准对poem进行分割，返回一个数组。
        String[] split =poem.split("，");//注意中英文标点符号不同。
        for(int i=0;i<split.length;i++){
            System.out.println(split[i]);
        }

        String str="E:\\aaa\\b";
        String[] split2=str.split("\\\\");//转义字符。
        for(int i=0;i<split2.length;i++){
            System.out.println(split2[i]);
        }

        //toCharArray 转换成字符数组
        String s="happy";
        char[] chs =s.toCharArray();
        for(int i=0;i<chs.length;i++){
            System.out.println(chs[i]);
        }
        //compareTo比较两个字符的大小，前者大返回正数，后者大返回负数，相等返回0
        String a="jchn";
        String b="jack";
        System.out.println(a.compareTo(b));//'c'-'a'=2
        //compareTo源码
//        public int compareTo(String anotherString) {
//            byte v1[] = value;
//            byte v2[] = anotherString.value;
//            byte coder = coder();
//            if (coder == anotherString.coder()) {
//                return coder == LATIN1 ? StringLatin1.compareTo(v1, v2)
//                        : StringUTF16.compareTo(v1, v2);
//            }
//            return coder == LATIN1 ? StringLatin1.compareToUTF16(v1, v2)
//                    : StringUTF16.compareToLatin1(v1, v2);
//        }

        //format 格式化字符串
        String name2="john";
        int age =10;
        char gender ='男';
        double score =98.3/3;
        String info="我的姓名是"+name2+"，年龄是"+age+",成绩是"+score+",性别是"+gender+"。喜欢打架。";
        System.out.println(info);
        String formatStr="我的姓名是%s,年龄是%d,成绩是%.2f,性别是%c.";
        String info2 =String.format(formatStr,name,age,score,gender);
        System.out.println("info2="+info2);
        //%.2f 保留两位小数，并且四舍五入。


    }
}
