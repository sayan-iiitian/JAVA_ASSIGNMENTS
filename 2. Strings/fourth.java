// 4. Remove a Particular Character from a String

public class fourth {
    public static void main(String[] args) {
        String original = "Hello World";
        char charToRemove = 'o';
        StringBuilder result = new StringBuilder();

        // Loop through the string and append characters except the one to remove
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) != charToRemove) {
                result.append(original.charAt(i));
            }
        }

        System.out.println("Original String: " + original);
        System.out.println("String after removing '" + charToRemove + "': " + result.toString());
    }
}
