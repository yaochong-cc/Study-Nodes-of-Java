package collection_;

import java.util.ArrayList;
import java.util.List;

public class Collection_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list=new ArrayList();
//        add
        list.add("jack");
        list.add(10);
        list.add(true);
        System.out.println(list);
//        remove
        list.remove(0);//按索引删除
        System.out.println(list);
        list.remove(true);//指定删除
        System.out.println(list);
//        contains:查找元素是否存在
        System.out.println(list.contains(10));//true
        System.out.println(list.contains("jack"));//false
//        size()
        System.out.println(list.size());

//        clear():清空
//        list.clear();
//        System.out.println(list.size());

//        isEmpty
        System.out.println(list.isEmpty());

//        addAll：添加多个元素
        ArrayList list2=new ArrayList();
        list2.add("红楼");
        list2.add("水浒");
        list.addAll(list2);
        System.out.println(list);
//        containsAll:查找多个元素是否都存在
        System.out.println(list.containsAll(list2));
//        removeAll:删除多个元素
        list.removeAll(list2);
        System.out.println(list);
        System.out.println(list2);

//        ArrayList以实现类来演示
    }
}
