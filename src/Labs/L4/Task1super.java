package Labs.L4;

/* 1. Выясните экспериментальном путём, начиная с какого элемента последовательности
фибоначчи, вычисление с использованием рекурсии становится неприемлемым (занимает более
минуты по времени).*/
import java.util.Date;
public class Task1super {
    public static void main(String[] args) {
        int n = -1;     long delta;
        do {
            ++n;
            Date start = new Date();
            System.out.println(fib(n));
            Date end = new Date();
            delta = end.getTime() - start.getTime();
        } while (delta < 60000);
        System.out.println("********");
        System.out.println(n);
    }

    public static long fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return (fib(n - 1) + fib(n - 2));
    }
}
