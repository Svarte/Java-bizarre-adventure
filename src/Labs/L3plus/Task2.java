package Labs.L3plus;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("арбуз", "ягода");      map.put("банан", "трава");
        map.put("вишня", "ягода");      map.put("груша", "фрукт");
        map.put("дыня", "овощ");        map.put("ежевика", "куст");
        map.put("жень-шень", "корень"); map.put("земляника", "ягода");
        map.put("ирис", "цветок");      map.put("картофель", "клубень");
        for (Map.Entry<String, String > tmp : map.entrySet()){
            System.out.println(tmp.getKey() + " - " + tmp.getValue());
        }
    }
}
