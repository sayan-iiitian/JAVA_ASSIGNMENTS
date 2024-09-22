// 5. Find the Index of a Substring

public class fifth {
    public static void main(String[] args) {
        String original = "HelloWorld";
        String substring = "World";

        int index = -1;

        // Loop through the original string to find the substring
        for (int i = 0; i <= original.length() - substring.length(); i++) {
            if (original.substring(i, i + substring.length()).equals(substring)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("The index of substring \"" + substring + "\" is: " + index);
        } else {
            System.out.println("Substring not found.");
        }
    }
}
