package interview;

import java.util.Arrays;

public class MissingNo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8};
        int n = arr.length+1;
        int expected = n*(n+1)/2;
        int actual = Arrays.stream(arr).sum();
        System.out.println("Missing number is: " + (expected - actual));
    }
}
