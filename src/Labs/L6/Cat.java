package Labs.L6;

public class Cat extends Pet {
    private String name;
    void getInfo() {System.out.println("This is cat his name is " + this.name);}
    public void setName(String name) {this.name = name;}
    public static void main(String[] args) {
        Cat tmp = new Cat();    tmp.setName("kill me");
        tmp.getInfo();
    }
}
