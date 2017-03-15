package Labs.L3plus;

import java.util.HashMap;
import java.util.Map;

public class Task6 {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("арбуз", 123);      map.put("банан", 768);
        map.put("вишня", 341);      map.put("груша", 123);
        map.put("дыня", 567);       map.put("ежевика", 485);
        map.put("жень-шень", 234);  map.put("земляника", 487);
        map.put("ирис", 1234);      map.put("картофель", 453);
        for (Map.Entry<String, Object> tmp : map.entrySet()) {
            System.out.println(tmp.getKey() + " - " + tmp.getValue());
        }
    }
}
