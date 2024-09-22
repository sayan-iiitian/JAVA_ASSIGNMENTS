// 1. Reverse a String Without Using the Inbuilt Method

public class first {
    public static void main(String[] args) {
        String original = "HelloWorld";
        String reversed = "";

        // Loop through the string from end to start and build the reversed string
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}
