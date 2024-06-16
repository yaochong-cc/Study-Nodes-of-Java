package collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection col=new ArrayList();
        col.add(new Book("三国演义","罗贯中",10.1));
        col.add(new Book("红楼梦","曹雪芹",22.3));

        //使用增强for循环
        //底层是迭代器
        for(Object book:col){
            System.out.println("book="+book);
        }
    }

}
