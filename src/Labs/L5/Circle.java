package Labs.L5;

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
        this.x = tmp.nextInt();
        this.y = tmp.nextInt();
        this.r = tmp.nextInt();
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
        double t2 = 2 * Math.PI - t1;

        boolean tmp1 = Math.abs(((a.y - b.y)) - ((b.r - a.r) * Math.sin(t1))) <= eps;
        boolean tmp2 = Math.abs(((a.y - b.y)) - ((b.r - a.r) * Math.sin(t2))) <= eps;

        if (tmp1 || tmp2) return true;  // if inside
        //----------------------------------------------------------------
        t1 = Math.acos((b.x - a.x) / (a.r + b.r));
        t2 = 2 * Math.PI - t1;

        tmp1 = Math.abs(((a.r + b.r) * Math.sin(t1)) - (b.y - a.y)) <= eps;
        tmp2 = Math.abs(((a.r + b.r) * Math.sin(t2)) - (b.y - a.y)) <= eps;

        return tmp1 || tmp2;

    }

    public static void main(String[] args) {
        Circle A = new Circle(0, 0, 1);
        Circle B = new Circle(0, 0, 1);
        System.out.println(contact(A, B));

    }
}
