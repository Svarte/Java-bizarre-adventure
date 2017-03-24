package Labs.L7plus;

/*Реализовать два интерфейса PassangersAuto(описать метод перевозки пассажиров) и CargoAuto (описать метод перевозки груза). Написать классы Truck, Sedan, Pickup реализующие эти интерфейсы*/
public interface CargoAuto {
    void transferGoods(int [] listOfMasses);
}
