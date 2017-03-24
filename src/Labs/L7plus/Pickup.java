package Labs.L7plus;

public class Pickup implements CargoAuto, PassangersAuto {
    @Override
    public void transferGoods(int[] listOfMasses) {
        int sum = 0;
        for (int i = 1; i <= listOfMasses.length; i++) {sum += listOfMasses[i - 1];}
        if (sum <= 2000) {System.out.println("go to destination ...");
        } else {System.out.println("overloading");}
    }
    @Override
    public void transferPeoples(int numberOfPassengers) {
        if (numberOfPassengers <= 7) {System.out.println("go to destination ...");
        } else {System.out.println("many passengers");}
    }
}
