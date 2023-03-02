import java.util.Scanner;

public class A1093349_0224_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入攝氏溫度：");
        float num = scanner.nextInt();

        System.out.println(num + " 轉成華氏是" + (1.8*num + 32) +"度！");
        
    }
}
