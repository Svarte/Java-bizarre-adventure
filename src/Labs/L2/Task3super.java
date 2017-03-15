package Labs.L2;

import java.util.Scanner;
public class Task3super {
    public static void main(String[] args) {
        Scanner stream = new Scanner(System.in);
        int x = stream.nextInt();
        int y = stream.nextInt();
        int quarter;
        if (x > 0) {
            quarter = (y > 0) ? 1 : 4;
        } else {
            quarter = (y > 0) ? 2 : 3;
        }
        System.out.println(quarter);
    }
}
