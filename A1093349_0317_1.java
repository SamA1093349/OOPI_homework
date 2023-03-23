import java.util.Scanner;

public class A1093349_0317_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("請輸入 n 的值：");
        int n = scanner.nextInt();
        
        System.out.print("請輸入 m 的值：");
        int m = scanner.nextInt();
        
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (i+1) * (j+1);
            }
        }
        
        System.out.println("二維陣列內容：");
        for (int[] row : arr) {
            for (int col : row) {
                System.out.print(col + "\t");
            }
            System.out.println();
        }
        
    }
}
