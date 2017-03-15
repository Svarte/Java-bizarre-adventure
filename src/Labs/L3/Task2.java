package Labs.L3;

public class Task2 {
    public static void main(String[] args) {
        int[] list = new int[50];
        for (int i = 1; i <= list.length; i++) list[i - 1] = i * 2 - 1;
        for (int i = 1; i <= list.length; i++) System.out.print(list[i - 1] + " ");
        System.out.println();
        for (int i = list.length; i >= 1; i--) System.out.print(list[i - 1] + " ");
    }
}
