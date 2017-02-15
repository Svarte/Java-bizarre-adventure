package Labs.L5;

public class TriangleP extends Triangle {

    void typeTriangle() {
        double eps = 1.e-14;
        boolean p1 = Math.abs((this.a * this.a + this.b * this.b) - (this.c * this.c)) <= eps;
        boolean p2 = Math.abs((this.c * this.c + this.a * this.a) - (this.b * this.b)) <= eps;
        boolean p3 = Math.abs((this.b * this.b + this.c * this.c) - (this.a * this.a)) <= eps;
        if (p1 || p2 || p3) {
            System.out.println("Right-angled triangle");
            return;
        }
        p1 = (this.a * this.a + this.b * this.b) >= (this.c * this.c);
        p2 = (this.c * this.c + this.a * this.a) >= (this.b * this.b);
        p3 = (this.b * this.b + this.c * this.c) >= (this.a * this.a);

        if (p1 && p2 && p3) {
            System.out.println("Acute-angled triangle");
            return;
        }

        System.out.println("Obtuse-angled triangle");
    }


    public static void main(String[] args) {
        TriangleP tmp = new TriangleP();
        tmp.typeTriangle();
    }
}
