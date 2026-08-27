package interview;

import java.util.Arrays;

public class SplitWordsCountJava8 {
    public static void main(String[] args) {
        String input = "Hello world this is Java 8";
        String[] arr=input.split(" ");
        Arrays.stream(arr).forEach(word -> System.out.println(word + ": " + word.length()));
    }
}
