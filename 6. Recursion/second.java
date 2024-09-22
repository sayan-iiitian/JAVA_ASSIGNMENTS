// 2. Sum of Natural Numbers with Alternate Signs

// Problem: Given a number n, find the sum of natural numbers till n with alternate signs.

public class second {
    public static int second(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return second(n - 1) - n;
        } else {
            return second(n - 1) + n;
        }
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Alternate sum: " + second(n));
    }
}
