package Labs.L7;

public class Cow {
    public void printAll() {
        printColor();
        printName();
    }

    public void printColor() {
        System.out.println("Я-белая");
    }

    public void printName() {
        System.out.println("Я – корова");
    }

    public void getName() {
        printName();
    }
}
