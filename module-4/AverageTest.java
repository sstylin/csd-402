/*Steve Stylin Module 4@ Bellevue University:
 Programming in Java 
 */

public class AverageTest {
    public static void main(String[] args) {
        // Test data
        short[] shortArray = {50, 20, 70, 40, 90};
        int[] intArray = {200, 200, 500, 400};
        long[] longArray = {1000L, 8000L, 3000L, 9000L, 5000L, 6000L};
        double[] doubleArray = {6.5, 2.5, 4.5, 3.5, 0.5};

        // Calculating averages
        short shortAvg = AverageCalculator.average(shortArray);
        int intAvg = AverageCalculator.average(intArray);
        long longAvg = AverageCalculator.average(longArray);
        double doubleAvg = AverageCalculator.average(doubleArray);

        // Displaying results
        System.out.println("Short Array: " + arrayToString(shortArray));
        System.out.println("Average of Short Array: " + shortAvg);
        
        System.out.println("Int Array: " + arrayToString(intArray));
        System.out.println("Average of Int Array: " + intAvg);
        
        System.out.println("Long Array: " + arrayToString(longArray));
        System.out.println("Average of Long Array: " + longAvg);
        
        System.out.println("Double Array: " + arrayToString(doubleArray));
        System.out.println("Average of Double Array: " + doubleAvg);
    }

    // Helper method to convert array to string for easy display
    private static String arrayToString(short[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private static String arrayToString(long[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private static String arrayToString(double[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
