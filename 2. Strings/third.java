// 3. Convert Upper Case to Lower Case and Vice Versa

public class third {
    public static void main(String[] args) {
        String original = "HeLLo WoRLd";
        StringBuilder converted = new StringBuilder();

        // Loop through the string and convert case character by character
        for (int i = 0; i < original.length(); i++) {
            char ch = original.charAt(i);
            if (Character.isUpperCase(ch)) {
                converted.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                converted.append(Character.toUpperCase(ch));
            } else {
                converted.append(ch); // If it's not a letter, just append the character
            }
        }

        System.out.println("Original String: " + original);
        System.out.println("Converted String: " + converted.toString());
    }
}
