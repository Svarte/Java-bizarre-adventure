package Labs.L4;

/* 2. Создать метод, который будет выводить указанный массив на экран в строку.С помощью созданного метода и метода из предыдущей задачи заполнить 5 массивов из 10 элементов каждый случайными числами и вывести все 5 массивов на экран, каждый на отдельной строке.*/
public class Task2 {
    public static void main(String[] args) {
        int N = 10;                 int[] A = new int[N];
        int[] B = new int[N];       int[] C = new int[N];
        int[] D = new int[N];       int[] E = new int[N];
        for (int i = 1; i <= N; i++) { A[i - 1] = Task1.MRange(-2, 2);
            B[i - 1] = Task1.MRange(-3, 3);
            C[i - 1] = Task1.MRange(-5, 5);
            D[i - 1] = Task1.MRange(-7, 7);
            E[i - 1] = Task1.MRange(-11, 11);}
        MPR(A);     MPR(B);     MPR(C);     MPR(D);     MPR(E);
    }

    public static void MPR(int[] list) {
        for (int tmp : list) {
            System.out.print(tmp + " ");
        }
        System.out.println();
    }
}