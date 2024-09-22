// 3. Find Maximum Value in an Array Using Recursion

// Problem: Print the maximum value of the array [13, 1, -3, 22, 5].

public class third {
    public static int findMax(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        return Math.max(arr[index], findMax(arr, index + 1));
    }

    public static void main(String[] args) {
        int[] arr = {13, 1, -3, 22, 5};
        System.out.println("Max value: " + findMax(arr, 0));
    }
}
