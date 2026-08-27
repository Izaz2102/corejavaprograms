package only.java;

import java.util.HashSet;

public class FindDuplicate {
    public static void main(String[] args) {
        String[] names = {"Java", "C", "Python", "Java", "C++", "C"};
        HashSet<String> set = new HashSet<>();

        System.out.print("Duplicate elements: ");
        for (String name : names) {
            if (!set.add(name)) { // returns false if element already exists
                System.out.print(name + " ");
            }
        }
    }
}

