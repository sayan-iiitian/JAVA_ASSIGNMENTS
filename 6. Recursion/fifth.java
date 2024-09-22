// 5. Armstrong Number Check Using Recursion

// Problem: Check if a number n is an Armstrong number.

public class fifth {
    public static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * power(base, exp - 1);
    }

    public static int sumOfPowers(int n, int digits) {
        if (n == 0) {
            return 0;
        }
        int lastDigit = n % 10;
        return power(lastDigit, digits) + sumOfPowers(n / 10, digits);
    }

    public static boolean isArmstrong(int n) {
        int digits = Integer.toString(n).length();
        return sumOfPowers(n, digits) == n;
    }

    public static void main(String[] args) {
        int n = 153;
        System.out.println(n + " is an Armstrong number: " + isArmstrong(n));
    }
}
