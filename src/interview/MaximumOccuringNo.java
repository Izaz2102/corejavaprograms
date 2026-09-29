package interview;

import java.util.*;

public class MaximumOccuringNo {
    public static void main(String [] args) {
        int[] arr = {3,7,3,9,1,4,4};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int maxOccuring = map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
        System.out.println("Maximum occurring number is: " + maxOccuring);
    }
}
