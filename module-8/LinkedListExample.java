import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> states = new LinkedList<>();

        // Adding elements
        states.add("New York");
        states.add("New Jersey");
        states.add("Massachusetts");

        // Accessing elements
        System.out.println("First city: " + states.get(0)); // Output: New Jersey

        // Removing an element
        states.remove("New Jersey");

        // Iterating through the LinkedList
        for (String state : states) {
            System.out.println(state);
        }
    }
}
