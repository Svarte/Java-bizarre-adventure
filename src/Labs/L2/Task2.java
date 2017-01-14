package Labs.L2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner stream = new Scanner(System.in);
        int f = stream.nextInt();
        int s = stream.nextInt();

        for (int i = 1; i <= f; i++){
            for (int j = 1; j <= s; j++){
                System.out.print('8');
            }
            System.out.print('\n');
        }


    }
}
