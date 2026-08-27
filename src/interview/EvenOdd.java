package interview;
//given a number n, if n is even, divide it by 2, if n is odd, multiply it by 3 and add 1.
// Repeat the process until n becomes 1. Print the sequence of numbers generated.
public class EvenOdd {
    public static void main(String[] args) {
        int n = 10; // Example input
        System.out.print(n + " ");
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            System.out.print(n + " ");
        }
    }
}
