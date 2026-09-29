package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//List contains strings and integers, remove strings and return only integer values as list
public class ListStringsInt {
    public static void main(String[] args) {
        List<Object> mixedList = Arrays.asList("Hello", 1, "World", 2, 3, "Java", 4, 5);
        List<Integer> sortedList = mixedList.stream().filter(obj -> obj instanceof Integer).map(obj -> (Integer) obj).collect(Collectors.toList());
        System.out.println("Sorted List of Integers: " + sortedList);
    }
}
