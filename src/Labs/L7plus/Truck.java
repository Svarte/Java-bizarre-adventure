package Labs.L7plus;

public class Truck implements CargoAuto {
    @Override
    public void transferGoods(int[] listOfMasses) {
        int sum = 0;
        for (int i = 1; i <= listOfMasses.length; i++) {sum += listOfMasses[i - 1];}
        if (sum <= 30000) {System.out.println("go to destination ...");
        } else {System.out.println("overloading");}
    }
}
