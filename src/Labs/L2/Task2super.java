package Labs.L2;

import java.util.Scanner;
public class Task2super {
    public static void main(String[] args) {
        Scanner stream = new Scanner(System.in);
        int a = stream.nextInt();   int b = stream.nextInt();
        int c = stream.nextInt();   int d = stream.nextInt();
        System.out.println(min(a, b, c, d));
    }
    private static int min(int a, int b, int c, int d) {
        return Math.min(Math.min(Math.min(a, b), c), d);
    }
}
