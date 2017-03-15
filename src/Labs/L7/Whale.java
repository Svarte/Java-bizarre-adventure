package Labs.L7;

/* 1. Переопределить метод getName в классе Whale(Кит), чтобы программа выдавала: Я не корова, Я – кит.
2. Написать метод, который определяет, объект какого класса ему передали, и выводит на экран одну из надписей: Кошка, Собака, Птица, Лампа.*/
public class Whale extends Cow {
    public void printName() {
        System.out.println("Это неправда: ");
        super.printName();
        System.out.println("Я – кит");
    }

    public void getName() {
        System.out.println("Я не корова, Я – кит");
    }

    public static void main(String[] args) {
        Cow test = new Cow();
        //test.getName();
        whom(test);
    }

    public static void whom(Object ob) {
        if (ob instanceof Cat) {
            System.out.println("This is Cat!");
        } else if (ob instanceof Dog) {
            System.out.println("This is Dog!");
        } else if (ob instanceof Cow) {
            System.out.println("This is Cow!");
        } else {
            System.out.println("just object ...");
        }
    }
}
