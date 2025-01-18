/* Steve Stylin 
Programming with Java
Module 3.2 
*/ 

public class NestedLoopPattern {
    public static void main(String[] args) {
        int rows = 7; // Number of rows in the pattern

        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("  ");
            }

            // Print increasing powers of 2
            for (int j = 0; j <= i; j++) {
                System.out.print((int) Math.pow(2, j) + " ");
            }

            // Print decreasing powers of 2
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((int) Math.pow(2, j) + " ");
            }

            // Print the "@" symbol at the end of each line
            System.out.print("@");
            System.out.println(); // Move to the next line
        }
    }
}
