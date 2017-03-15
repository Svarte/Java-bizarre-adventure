package Labs.L3;

public class Task4 {
    public static void main(String[] args) {
        int[][] M = new int[8][5];
        for (int i = 1; i <= M.length; i++) {
            for (int j = 1; j <= M[i - 1].length; j++) {
                M[i - 1][j - 1] = 10 + (int) (Math.random() * 90);
            }
        }
        for (int i = 1; i <= M.length; i++) {
            for (int j = 1; j <= M[i - 1].length; j++) {
                System.out.print(M[i - 1][j - 1] + " ");
            }
            System.out.println();
        }
    }
}
