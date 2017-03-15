package Labs.L3;

public class Task5 {
    public static void main(String[] args) {
        int[][] M = new int[7][4];
        int Max = Integer.MIN_VALUE;    int Index = 0;
        for (int i = 1; i <= M.length; i++) {
            for (int j = 1; j <= M[i - 1].length; j++) {
                M[i - 1][j - 1] = ((int) (Math.random() * 11)) - 5;
            }
        }
        for (int i = 1; i <= M.length; i++) {
            for (int j = 1; j <= M[i - 1].length; j++) {
                System.out.print(M[i - 1][j - 1] + " ");
            }
            System.out.println();
        }
        for (int i = 1; i <= M.length; i++) {
            int TMP = 1;
            for (int j = 1; j <= M[i - 1].length; j++)  TMP *= Math.abs(M[i - 1][j - 1]);
            if (TMP > Max) {
                Max = TMP;
                Index = i;
            }
        }
        System.out.println(Index);
    }
}
