package Labs.L3;

public class Task3 {
    public static void main(String[] args) {
        int[] A = new int[15];  int ACC = 0;
        for (int i = 1; i <= A.length; i++) A[i - 1] = (int) (Math.random() * 10);
        for (int i = 1; i <= A.length; i++) System.out.print(A[i - 1] + " ");
        for (int i = 1; i <= A.length; i++) if (A[i - 1] % 2 == 0) ++ACC;
        System.out.println(); System.out.println(ACC);
    }
}
