package Labs.L7plus;

/* 1. Сделать класс Pet (лабораторная работа №6) абстрактным.
2. Создать абстрактный класс Pet с полями name, age, hungry(хочет есть) и абстрактный метод voice(голос). Создать классы Snake, Dog, PatrolDog, Cat, Fish и наследники класса Pet. В каждом классе реализовать метод voice.*/
public abstract class Pet {
    String name;
    int age;
    boolean hungry;
    public abstract void voice();
}
