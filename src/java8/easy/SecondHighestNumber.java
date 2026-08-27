package java8.easy;

import java.util.*;

public class SecondHighestNumber {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(6,88,88,99,4,0);
        Optional<Integer> secondHighest = l.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        secondHighest.ifPresent(System.out::println);
    }
}
