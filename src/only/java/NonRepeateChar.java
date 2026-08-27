package only.java;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeateChar {
        public static void main(String[] args) {
            String inputStr = "swiss";
            char result = findFirstNonRepeatedChar(inputStr);

            if (result != '\0') {
                System.out.println("The first non-repeated character is: " + result);
            } else {
                System.out.println("All characters are repeated.");
            }
        }

        public static char findFirstNonRepeatedChar(String str) {
            if (str == null || str.isEmpty()) {
                return '\0';
            }

            // LinkedHashMap maintains the insertion order of characters
            Map<Character, Integer> charCountMap = new LinkedHashMap<>();

            // Step 1: Build the frequency map
            for (char ch : str.toCharArray()) {
                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            }

            // Step 2: Iterate through the map to find the first character with a count of 1
            for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                if (entry.getValue() == 1) {
                    return entry.getKey();
                }
            }

            // Return null character if no unique character exists
            return '\0';
        }
}
