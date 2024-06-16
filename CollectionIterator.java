package collection_;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class CollectionIterator {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection col=new ArrayList();

        col.add(new Book("三国演义","罗贯中",10.1));
        col.add(new Book("红楼梦","曹雪芹",22.3));
        System.out.println(col);
        System.out.println("----------------");
        //遍历：
        //1.先得到col对应的迭代器
        Iterator iterator =col.iterator();
        //2.使用while循环遍历
        while(iterator.hasNext()){//判断是否还有数据
            //返回下一个元素，类型是Object
            Object obj =iterator.next();
            System.out.println("obj="+obj);
        }
        //当退出while循环后，这时iterator迭代器指向最后的元素
//        iterator.next();//NoSuchElementException

        //快捷键：itit
        //Ctrl+j:提示快捷键


    }
}
class Book{
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
