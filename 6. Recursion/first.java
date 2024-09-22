// 1. Sum of Digits Using Recursion

// Problem: Given an integer n, find the sum of its digits using recursion.

public class first {
    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        int n = 1234;
        System.out.println("Sum of digits: " + sumDigits(n));
    }
}
