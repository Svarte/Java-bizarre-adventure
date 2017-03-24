package Labs.L7plus;

public class Sedan implements PassangersAuto {
    @Override
    public void transferPeoples(int numberOfPassengers) {
        if (numberOfPassengers <= 12) {System.out.println("go to destination ...");
        } else {System.out.println("many passengers");}
    }
}
