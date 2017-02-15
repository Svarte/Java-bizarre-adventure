package Labs.L4;

/* 3. Создать метод, который будет сортировать указанный массив по возрастанию любым
известным вам способом.*/
public class Task3 {
    public static void sort(int[] A) {
        for (int j = 2; j <= A.length; j++) {
            int key = A[j - 1];
            int i = j - 1;
            while ((i > 0) && (A[i - 1] > key)) {
                A[i] = A[i - 1];
                --i;
            }
            A[i] = key;
        }
    }

    public static void main(String[] args) {
        int[] test = new int[]{3, 53, 12, 31, 23, 1, 0};
        Task2.MPR(test);    sort(test);     Task2.MPR(test);
    }
}
