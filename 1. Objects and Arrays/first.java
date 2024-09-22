//1. Demonstrating Method Overloading with 3 Different Parameters

class first {

    // Method with three parameters
    public void display(String a, int b, double c) {
        System.out.println("Display with String, int, and double: " + a + ", " + b + ", " + c);
    }

    public static void main(String[] args) {
        first obj = new first();
        obj.display("Hello", 25, 30.5);     // Calling third method
    }
}
