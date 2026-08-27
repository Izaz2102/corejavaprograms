package interview;

import java.util.*;

//
public class ReverseMapDuplicateKey {
    public static void main(String[] args) {
        Map<String, String> originalMap = new HashMap<>();
        originalMap.put("a", "1");
        originalMap.put("b", "2");
        originalMap.put("c", "1");
        originalMap.put("d", "3");
        originalMap.put("e", "2");

        Map<String, String> reversedMap = new HashMap<>();
        for (Map.Entry<String, String> entry : originalMap.entrySet()) {
            String value = entry.getKey();
            String key = entry.getValue();
            if (reversedMap.containsKey(key)) {
                reversedMap.compute(key, (k, existingValue) -> existingValue + "," + value);
            } else {
                reversedMap.put(key, value);
            }
        }
        for (Map.Entry<String, String> entry : reversedMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Values: " + entry.getValue());
        }
    }
}
