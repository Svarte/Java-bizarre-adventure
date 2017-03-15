package Labs.L3plus;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Set<String> Plants = new HashSet<>();
        Plants.add("арбуз");        Plants.add("банан");
        Plants.add("вишня");        Plants.add("груша");
        Plants.add("дыня");         Plants.add("ежевика");
        Plants.add("жень-шень");    Plants.add("земляника");
        Plants.add("ирис");         Plants.add("картофель");
        for (String tmp : Plants) System.out.println(tmp);
    }
}
