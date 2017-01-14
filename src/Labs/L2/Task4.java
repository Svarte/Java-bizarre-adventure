package Labs.L2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner stream = new Scanner(System.in);
        int f = stream.nextInt();
        int s = stream.nextInt();
        System.out.println(Math.min(f,s)); //Math.min()
    }
    /*
    public static int  min(int x, int y){
        if (x < y) {
            return x;
        } else {
            return y;
        }
    }
    */
}
