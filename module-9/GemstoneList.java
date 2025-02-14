
/*Steve Stylin 
 * Module 9 Introduction: Exception Handling & Text I/O
 */

import java.util.ArrayList;
import java.util.Scanner;
/**
 * This program demonstrates the use of an ArrayList to store gemstone names
 * and allows the user to retrieve a specific gemstone by its index.
 */
public class GemstoneList {
    public static void main(String[] args) {
        ArrayList<String> gemstones = new ArrayList<>();
        gemstones.add("Blue diamond 3,390,000 euros per carat");
        gemstones.add("Red diamond  1,727,940 euros per carat");
        gemstones.add("Blue Garnet  1,296,060 euros per carat");
        gemstones.add("Taaffeite  30,249 euros per carat");
        gemstones.add(" Grandidierite 1,7295 euros per carat");
        gemstones.add(" Jadeite 17,295 euros per carat");
        gemstones.add("Serendibite 15,571 euros per carat");
        gemstones.add("Diamond 12,961 euros per carat");
        gemstones.add("Ruby 12,961 euros per carat");
        gemstones.add(" Alexandrite 10,379 euros per carat");

        // Print the ArrayList using a for-each loop
        System.out.println("Gemstones List:");
        for (String gemstone : gemstones) {
            System.out.println(gemstone);
        }

        // User input to retrieve a gemstone
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the gemstone you would like to see again (0-9): ");
        int index = scanner.nextInt();

        // Attempt to print the gemstone at the specified index
        try {
            System.out.println("You selected: " + gemstones.get(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: Out of Bounds");
        } finally {
            scanner.close();
        }
    }
}
