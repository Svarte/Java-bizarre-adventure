package Labs.L2;

import java.util.Scanner;

public class Task3super {
    public static void main(String[] args) {
        Scanner stream = new Scanner(System.in);
        int x = stream.nextInt();
        int y = stream.nextInt();
        int quarter;

        if (x > 0) {
            if (y > 0) {
                quarter = 1;
            } else {
                quarter = 4;
            }
        } else {
            if (y > 0) {
                quarter = 2;
            } else {
                quarter = 3;
            }
        }
        System.out.println(quarter);
    }
}
