package Labs.L4;

/* 1. Создать статический метод, который будет иметь два целочисленных параметра a и b, и в качестве своего значения возвращать случайное целое число из отрезка [a;b]. C помощью данного метода заполнить массив из 20 целых чисел и вывести его на экран.*/
public class Task1 {
    public static void main(String[] args) {
        int[] test = new int[20];
        for (int i = 1; i <= test.length; i++) {
            test[i - 1] = MRange(-5, 5);
        }
        for (int tmp : test) {
            System.out.print(tmp + " ");
        }
    }
    public static int MRange(int a, int b) {
        return (a + (int) (Math.random() * (b - a + 1)));
    }
}
