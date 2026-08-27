package only.java;

import java.util.HashMap;

public class CharacterCount {
    public static void main(String[] args) {
        String input = "hello world";
        HashMap<Character, Integer> charMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (c != ' ') { // Skip spaces if needed
                charMap.put(c, charMap.getOrDefault(c, 0) + 1);
            }
        }
        System.out.println(charMap);
    }
}

