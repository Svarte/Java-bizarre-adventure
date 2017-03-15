package Labs.L3;

public class Task1 {
    public static void main(String[] args) {
        int[] list = new int[10];
        for (int i = 1; i <= list.length; i++) list[i - 1] = i * 2;
        for (int i = 1; i <= list.length; i++) System.out.print(list[i - 1] + " ");
        System.out.println();
        for (int i = 1; i <= list.length; i++) System.out.println(list[i - 1] + " ");
    }
}
