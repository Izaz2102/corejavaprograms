//Write a Java Program to count the number of words in a string using HashMap

package java.izaz.genz;

public class CountWordsStringUsingHMap {
    public static void main(String[] args) {
        String str = "This is a sample string with some sample words";
        String[] words = str.split(" ");
        java.util.HashMap<String, Integer> wordCountMap = new java.util.HashMap<>();

        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        System.out.println("Word Count: " + wordCountMap);
    }
}
