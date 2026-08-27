package interview;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class duplicateCharFromStrJava8 {
    public static void main(String args[]) {
        String str = "programming";
        Map<Character, Long> charCount = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        charCount.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}