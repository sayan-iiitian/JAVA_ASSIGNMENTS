// 4. Find the Sum of an Array Using Recursion

// Problem: Find the sum of the array [92, 23, 15, -20, 10].

public class fourth {
    public static int sumArray(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + sumArray(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {92, 23, 15, -20, 10};
        System.out.println("Sum of array: " + sumArray(arr, 0));
    }
}
