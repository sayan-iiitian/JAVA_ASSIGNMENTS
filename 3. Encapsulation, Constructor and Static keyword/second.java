// 2. Constructor with Parameters to Initialize Variables

public class second  {
    private String name;
    private int age;

    // Constructor with parameters
    public second (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        second  second  = new second ("John Doe", 30);
        second .display();
    }
}
