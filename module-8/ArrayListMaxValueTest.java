


import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class contains a method to find the maximum integer value
 * from an ArrayList populated with user input.
 */
public class ArrayListMaxValueTest {

    /**
     * This method receives an ArrayList of Integer and returns the largest value.
     * If the ArrayList is empty, it returns 0.
     *
     * @param list the ArrayList of Integer values
     * @return the maximum Integer value in the list or 0 if the list is empty
     */
    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }
        Integer maxValue = list.get(0);
        for (Integer value : list) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        Integer input;

        System.out.println("Enter integers (0 to stop):");
        while (true) {
            input = scanner.nextInt();
            numbers.add(input);
            if (input == 0) {
                break;
            }
        }

        Integer maxValue = max(numbers);
        System.out.println("The largest value entered is: " + maxValue);
        scanner.close();
    }
}
