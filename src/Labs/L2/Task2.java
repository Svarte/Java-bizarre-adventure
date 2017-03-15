package Labs.L2;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner stream = new Scanner(System.in);
        int m = stream.nextInt();   int n = stream.nextInt();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print('8');
            }
            System.out.print('\n');
        }
    }
}
