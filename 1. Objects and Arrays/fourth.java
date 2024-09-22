//4. Java Program to Find the Index of a Specific Element in an Integer Array

public class fourth {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;  // Element to find
        int index = -1;

        // Loop through the array to find the index of the target element
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("The index of element " + target + " is: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
