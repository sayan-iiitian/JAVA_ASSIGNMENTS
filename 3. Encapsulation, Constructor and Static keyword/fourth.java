// 4. Calling a Method Without Creating an Object of a Class

public class fourth {
    // Static method
    public static void printMessage() {
        System.out.println("This is a static method called without creating an object.");
    }

    public static void main(String[] args) {
        // Calling static method directly using class name
        fourth.printMessage();
    }
}

