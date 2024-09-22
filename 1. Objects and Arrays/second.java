//2. Creating an Object of a Class and Calling its Method in the Main Method

class second {
    // Class method
    public void myMethod() {
        System.out.println("This is a method in second.");
    }

    public static void main(String[] args) {
        // Creating an object of second
        second obj = new second();
        // Calling the method using the object
        obj.myMethod();
    }
}
