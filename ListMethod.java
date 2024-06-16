package list_;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("tom");
        list.add("jack");
        //插入
        list.add(1,"rose");
        System.out.println(list);
        //插入所有
        List list2=new ArrayList();
        list2.add("aa");
        list2.add("bb");
        list.addAll(1,list2);
        System.out.println(list);
        //索引
        System.out.println(list.indexOf("tom"));
        list.add("tom");
        System.out.println(list.lastIndexOf("tom"));
        //移除
        list.remove(0);
        System.out.println(list);
        //替换:set
        list.set(2,"肉丝");
        System.out.println(list);
        //子集合
        List res=list.subList(0,2);
        System.out.println(res);

    }
}
