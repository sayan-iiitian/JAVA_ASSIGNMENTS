// 5. Static Block and Constructor Overloading

public class fifth  {
    private int a;
    private int b;

    // Static block
    static {
        System.out.println("Static block executed");
    }

    // Constructor with no parameters
    public fifth () {
        this.a = 0;
        this.b = 0;
    }

    // Constructor with one parameter
    public fifth (int a) {
        this.a = a;
        this.b = 0;
    }

    // Constructor with two parameters
    public fifth (int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void display() {
        System.out.println("a: " + a + ", b: " + b);
    }

    public static void main(String[] args) {
        fifth  obj1 = new fifth ();
        fifth  obj2 = new fifth (10);
        fifth  obj3 = new fifth (10, 20);

        obj1.display();
        obj2.display();
        obj3.display();
    }
}
