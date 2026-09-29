package only.java;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {10, 35, 12, 85, 35, 85};
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                secondHighest = num;
            }
        }
        System.out.println("Second Largest: " + secondHighest);
    }
}
