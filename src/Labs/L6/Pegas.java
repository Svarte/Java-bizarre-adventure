package Labs.L6;

/* 1. Написать два класса: Horse(лошадь) - в конструкторе задается кличка лошади и Pegas(пегас) - релизующий метод полет(сообщает какая лошадь летит). Унаследовать пегаса от лошади.*/
public class Pegas extends Horse {
    public void fly() {
        System.out.println(nickname + " IN FLY!");
    }
    public static void main(String[] args) {
        Pegas tmp = new Pegas();
        tmp.fly();
    }
}
