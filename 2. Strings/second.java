// 2. Check if a Given String is a Palindrome

public class second {
    public static void main(String[] args) {
        String original = "madam";
        boolean isPalindrome = true;

        // Compare characters from the start and end of the string
        for (int i = 0; i < original.length() / 2; i++) {
            if (original.charAt(i) != original.charAt(original.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
