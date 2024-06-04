import java.util.HashMap;
import java.util.Scanner;

public class Map {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> hashMapExample = new HashMap<>();
        for(int i=0; i<2; i++){
            hashMapExample.put(sc.next(), sc.next());
        }

        // 增加key为name，value为lihong的元素
        hashMapExample.put("name", "lihong");

        // 删除key为firstkey的元素
        hashMapExample.remove("firstkey");

        // 修改key为secondkey的元素值为educode（先判断后修改）
        if (hashMapExample.containsKey("secondkey")) {
            hashMapExample.put("secondkey", "educode");
        } else {
            System.out.println("要修改的元素不存在");
        }

        // 打印输出HashMap
        System.out.print("{");
        int size = hashMapExample.size();
        int count = 0;
        for (String key : hashMapExample.keySet()) {
            System.out.print(key + "=" + hashMapExample.get(key));
            count++;
            if (count < size) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
