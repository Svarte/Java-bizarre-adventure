package Labs.L2;

import java.util.Scanner;

public class Task2super {
    public static void main(String[] args) {
        // reading from stream :?
        Scanner stream = new Scanner(System.in);
        int a = stream.nextInt();
        int b = stream.nextInt();
        int c = stream.nextInt();
        int d = stream.nextInt();
        System.out.println(min(d,min(c,min(a,b))));
        // res = min d $ min c $ min a b
    }

    private static int min(int x, int y){
        if (x < y)
            return x;
        else
            return y;
    }

}
