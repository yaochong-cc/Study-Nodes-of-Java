
import java.util.Scanner;
public class StringBufferLearning {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringExample = scanner.next();
        // ---------------------Begin------------------------

        // 将stringExample转换为StringBuffer类
        StringBuffer stringBuffer = new StringBuffer(stringExample);

        // 向转化后的StringBuffer增加字符串educode
        stringBuffer.append("educode");
        System.out.println("添加数据后："+stringBuffer);
        // 删除5-8的字符串
        stringBuffer.delete(5, 9);
        System.out.println("删除5-8的字符串后："+stringBuffer);
        // 将7-13的字符串替换成world
        stringBuffer.replace(7, 14, "world");
        System.out.println("替换7-13的字符串后："+stringBuffer);
        // 截取1-10的字符串并输出
        System.out.println("截取1-10的字符串后："+stringBuffer.substring(0, 10));

        // 反转字符串并输出
        System.out.print("翻转后的字符串为："+stringBuffer.reverse());

        // ---------------------End------------------------
    }

}

