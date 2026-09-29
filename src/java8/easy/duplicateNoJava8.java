package java8.easy;

import java.util.Comparator;
import java.util.*;
import java.util.stream.Collectors;

public class duplicateNoJava8 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 1, 2, 3);
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = list.stream().filter(n -> !set.add(n)).collect(Collectors.toSet());
        System.out.println("Duplicate numbers: " + duplicates);
    }
}
