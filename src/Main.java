// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
import java.util.Scanner;

public class Main {
    static Thread A, B, C;
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){   //sc.hasNextInt()
            int a = sc.nextInt(); //读取数值
            String b = sc.next();  //不可以读取带空格的字符串
            String c = sc.nextLine();//按行读取 可以带空格
            System.out.println(b);
        }
    }
}


