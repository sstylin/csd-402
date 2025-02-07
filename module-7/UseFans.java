import java.util.ArrayList;
import java.util.List;

public class UseFans {
    // Collection of Fan instances
    private List<Fan> fans;

    // Constructor to initialize the collection
    public UseFans() {
        this.fans = new ArrayList<>();
    }

    // Method to add a Fan to the collection
    public void addFan(Fan fan) {
        this.fans.add(fan);
    }

    // Method to display all fans in the collection
    public void displayAllFans() {
        for (Fan fan : this.fans) {
            fan.displayFanDetails();
        }
    }

    // Method to display a single fan
    public void displaySingleFan(Fan fan) {
        fan.displayFanDetails();
    }

    // Test code
    public static void main(String[] args) {
        UseFans useFans = new UseFans();

        // Creating Fan instances
        Fan defaultFan = new Fan();
        Fan customFan = new Fan(Fan.MEDIUM, true, 7, "Orange");

        // Adding fans to the collection
        useFans.addFan(defaultFan);
        useFans.addFan(customFan);

        // Displaying all fans
        System.out.println("Displaying all fans:");
        useFans.displayAllFans();

        // Displaying a single fan
        System.out.println("\nDisplaying a single fan:");
        useFans.displaySingleFan(customFan);
    }
}
