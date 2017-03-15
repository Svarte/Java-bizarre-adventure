package Labs.L6;

public class Dog extends Pet {
    String name;
    void getInfo() {
        System.out.println("This is dog his name is " + this.name);
    }
    public static void main(String[] args) {
        Dog tmp = new Dog();    tmp.name = "i'am error";
        tmp.getInfo();
    }
}
