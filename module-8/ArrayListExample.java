import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> states = new ArrayList<>();

        // Adding elements
        states.add("New York");
        states.add("New Jersey");
        states.add("Massachusetts");

        // Accessing elements
        System.out.println("First State: " + states.get(0)); // Output: New York

        // Removing an element
        states.remove("Massachusetts");

        // Iterating through the ArrayList
        for (String sate : states) {
            System.out.println(sate);
        }
    }
}
