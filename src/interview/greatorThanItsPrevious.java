package interview;
//Write a java program without using Collections, Streams and sorting.
// Given array like 4 5 2 9 0 Check each and every element, if it is greater than its previous element
// then add that element to another array and return 1 else 0
public class greatorThanItsPrevious {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 9, 0};
        int[] result = new int[arr.length];
        result[0] = 1; // First element is always considered greater than its previous (non-existent) element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                result[i] = 1;
            } else {
                result[i] = 0;
            }
        }

        // Print the result array
        System.out.print("Result: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
