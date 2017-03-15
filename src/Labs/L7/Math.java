package Labs.L7;

/* 1. Написать два метода: print(int) и print(String).
2. Написать два метода: print(int) и print(Integer).Написать такой код в методе main, чтобы вызвались они оба.
3. Написать пять методов print с разными параметрами.
4. Написать public static методы: int min(int, int), long min(long, long), double min(double, double). Каждый метод должен возвращать минимальное из двух переданных в него чисел.
5. Написать public static методы: int max(int, int), long max (long, long), double max (double, double). Каждый метод должен возвращать максимальное из двух переданных в него чисел.*/
public class Math {
    public static void print(int k) {System.out.println(k);}
    public static void print(String k) {System.out.println(k);}
    public static void print(Integer k) {System.out.println(k.toString());}
    public static void print(Object ob) {System.out.println(ob.toString());}
    public static void print(Double k) {System.out.println(k.toString());}

    public static int min(int a, int b) {return ((a < b) ? a : b);}
    public static long min(long a, long b) {return ((a < b) ? a : b);}
    public static double min(double a, double b) {return ((a < b) ? a : b);}

    public static int max(int a, int b) {return ((a > b) ? a : b);}
    public static long max(long a, long b) {return ((a > b) ? a : b);}
    public static double max(double a, double b) {return ((a > b) ? a : b);}

    public static void main(String[] args) {
        print(34);
        print("Java bizarre adventure");
        Integer num = 123;
        print(num);
    }
}
