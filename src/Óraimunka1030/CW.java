package Óraimunka1030;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CW {
    public static void main(String[] args) {
        Map<Integer, String> ize = new HashMap<>();
        ize.put(1, "alma");
        ize.put(2, "barack");
        ize.put(3, "citrom");

        for (Integer key : ize.keySet()) {
            System.out.println(key+" - "+ize.get(key));
        }
        Set<Map.Entry<Integer, String>> entries = ize.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry);

        }


    }
}
