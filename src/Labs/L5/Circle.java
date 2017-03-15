package Labs.L5;


/* 1. Создайте в классе Circle метод, вычисляющий длину окружности.
* 2. Создайте в классе Circle метод, перемещающий центр круга в случайную точку квадрата координатной плоскости с диагональю от [-99;-99] до [99;99]. Обратите внимание на то, что требуется создать обычный метод, применимый к уже существующему объекту, а не конструктор создающий новый объект.
* 3. Измените в классе Circle конструктор по умолчанию так, чтобы в момент создания объекта с его помощью, координаты центра и радиус окружности пользователь вводил с клавиатуры.
* 4. Создайте в классе Circle метод, вычисляющий расстояние между центрами двух окружностей.
* 5. Создайте в классе Circle метод, проверяющий, касаются ли окружности в одной точке. Учтите, что возможен вариант, когда одна окружность содержится внутри другой и при этом всё равно возможно касание в одной точке.*/

/* 4. С помощью интерфейса с полем значения числа Пи и методами определения длины и площади окружности найти длину и площадь по заданному радиусу.*/

import java.util.Scanner;
interface FigureProperty {
    double PI = Math.PI;
    double area();
    double perimeter();
}

public class Circle implements FigureProperty {
    private double x;
    private double y;
    private double r;

    public void printCircle() {
        System.out.println("Окружность с центром (" + this.x + ";" + this.y + ") и радиусом " + this.r);
    }

    public void moveCircle(double a, double b) {
        this.x = this.x + a;
        this.y = this.y + b;
    }

    public void zoomCircle(double k) {
        this.r = this.r * k;
    }

    public double perimeter() {
        return (2 * PI * this.r);
    }

    public double area() {
        return (PI * this.r * this.r);
    }

    public void moveRandom() {
        this.x = (-99 + (int) (Math.random() * (199)));
        this.y = (-99 + (int) (Math.random() * (199)));
    }

    public Circle() {
        Scanner tmp = new Scanner(System.in);
        this.x = tmp.nextDouble();
        this.y = tmp.nextDouble();
        this.r = tmp.nextDouble();
    }

    private Circle(double a, double b, double s) {
        this.x = a;
        this.y = b;
        this.r = s;
    }

    public static double ctcDistance(Circle a, Circle b) {
        double dx = a.x - b.x;
        double dy = a.y - b.y;
        return (Math.sqrt(dx * dx + dy * dy));
    }

    private static Boolean contact(Circle a, Circle b) {
        double eps = 1.E-14;

        double t1 = Math.acos((a.x - b.x) / (b.r - a.r));
        double t2 = 2 * PI - t1;
        boolean tmp1 = Math.abs(((a.y - b.y)) - ((b.r - a.r) * Math.sin(t1))) <= eps;
        boolean tmp2 = Math.abs(((a.y - b.y)) - ((b.r - a.r) * Math.sin(t2))) <= eps;

        if (tmp1 || tmp2) return true;  // if inside

        t1 = Math.acos((b.x - a.x) / (a.r + b.r));
        t2 = 2 * PI - t1;
        tmp1 = Math.abs(((a.r + b.r) * Math.sin(t1)) - (b.y - a.y)) <= eps;
        tmp2 = Math.abs(((a.r + b.r) * Math.sin(t2)) - (b.y - a.y)) <= eps;

        return tmp1 || tmp2; // if outside
    }
}