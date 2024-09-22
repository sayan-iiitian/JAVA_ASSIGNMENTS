//5. Java Program to Print an Entire Array


public class fifth {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        //Loop through the array to print each element
        System.out.print("Array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
