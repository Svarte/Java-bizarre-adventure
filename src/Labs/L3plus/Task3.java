package Labs.L3plus;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<String, Cat> map = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            String tmp = "Cat" + i;
            map.put(tmp, new Cat(tmp));
        }
        for (Map.Entry<String, Cat> tmp : map.entrySet()) {
            System.out.println(tmp.getKey() + " - " + tmp.getValue().getName());
        }
    }
}
