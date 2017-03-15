package Labs.L7;

/* 3. Создать два класса Cat(кот) и Dog(собака), класс Dog(собака) происходит от Cat(кот). Определить метод getChild в классах Cat(кот) и Dog(собака), чтобы кот порождал кота, а собака – собаку.*/
public class Cat {
    public Cat getChild() {
        return new Cat ();
    }
}
