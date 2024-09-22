//3. Java Program to Calculate the Sum of All Elements in an Integer Array

public class third {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        // Loop through the array to calculate the sum
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("The sum of the array elements is: " + sum);
    }
}
