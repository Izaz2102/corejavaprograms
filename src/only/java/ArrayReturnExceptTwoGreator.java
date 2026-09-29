package only.java;

import java.util.Arrays;

public class ArrayReturnExceptTwoGreator {
    public static void main(String[] args) {
        int[] numbers = {10, 35, 12, 85, 35, 85};
        Arrays.sort(numbers);
        int[] result = Arrays.copyOfRange(numbers, 0, numbers.length - 2);

        System.out.println("ArrayReturnExceptTwoGreator " + Arrays.toString(result));
    }
}
