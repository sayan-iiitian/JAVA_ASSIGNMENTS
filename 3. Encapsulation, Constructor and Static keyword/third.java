// 3. Using Private Keyword and Getter/Setter Methods

public class third {
    private String name;
    private int id;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        third third = new third();
        third.setName("Alice");
        third.setId(12345);
        System.out.println("third Name: " + third.getName());
        System.out.println("third ID: " + third.getId());
    }
}
