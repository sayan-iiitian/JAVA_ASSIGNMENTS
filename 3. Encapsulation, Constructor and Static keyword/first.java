// 1. Class to Keep Track of the Number of Instances Created

public class first  {
    // Static variable to keep count of instances
    private static int instanceCount = 0;

    public first () {
        // Increment the count when a new instance is created
        instanceCount++;
    }

    // Static method to return the count of instances
    public static int getInstanceCount() {
        return instanceCount;
    }

    public static void main(String[] args) {
        first  obj1 = new first ();
        first  obj2 = new first ();
        System.out.println("Number of instances created: " + first .getInstanceCount());
    }
}
