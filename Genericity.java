import java.util.ArrayList;
import java.util.Scanner;

public class Genericity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> stringArrayList = new ArrayList<>();
        while(scanner.hasNext()){
            stringArrayList.add(scanner.next());
        }

        // 添加String类型内容为educode的元素
        stringArrayList.add("educode");

        // 遍历输出ArrayList
        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println("第" + (i + 1) + "个元素为：" + stringArrayList.get(i));
        }
    }
}
