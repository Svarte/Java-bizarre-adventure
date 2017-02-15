package Labs.L5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Triangle {
    protected double a;
    protected double b;
    protected double c;

    private Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
        Scanner tmp = new Scanner(System.in);
        double a = tmp.nextDouble();
        double b = tmp.nextDouble();
        double c = tmp.nextDouble();


        class CheCKer {
            boolean check(double f, double s, double t) {
                boolean p1 = (f + s) >= t;
                boolean p2 = (s + t) >= f;
                boolean p3 = (f + t) >= s;
                return (p1 && p2 && p3);
            }
        }

        CheCKer judge = new CheCKer();
        if (judge.check(a, b, c)) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            System.out.println("Triangle don't exist");
        }

    }

    private double area() {
        double p = (this.a + this.b + this.c) / 2;
        return (Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c)));
    }

    private double perimeter() {
        return (this.a + this.b + this.c);
    }

    public static void main(String[] args) {
        Triangle tmp = new Triangle();
        System.out.println(tmp.perimeter() + "   " + tmp.area());

    }
}
