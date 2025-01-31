/* Steve Stylin
 * Java for rogrammer
 Module 5.2
 */

public class ArrayLocator {

    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = new int[2];
        double largest = arrayParam[0][0];
        
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    location[0] = i; // row index
                    location[1] = j; // column index
                }
            }
        }
        return location;
    }

    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = new int[2];
        int largest = arrayParam[0][0];
        
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    location[0] = i; // row index
                    location[1] = j; // column index
                }
            }
        }
        return location;
    }

    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = new int[2];
        double smallest = arrayParam[0][0];
        
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    location[0] = i; // row index
                    location[1] = j; // column index
                }
            }
        }
        return location;
    }

    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = new int[2];
        int smallest = arrayParam[0][0];
        
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    location[0] = i; // row index
                    location[1] = j; // column index
                }
            }
        }
        return location;
    }

    public static void main(String[] args) {
        double[][] doubleArray = {
            {30.5, 2.35, 6.7},
            {0.1, 2.6, 0.2},
            {2.2, 6.95, 9.14}
        };

        int[][] intArray = {
            {11, 72, 53},
            {42, 25, 10},
            {30, 108, 701}
        };

        int[] largestLocationDouble = locateLargest(doubleArray);
        int[] smallestLocationDouble = locateSmallest(doubleArray);
        int[] largestLocationInt = locateLargest(intArray);
        int[] smallestLocationInt = locateSmallest(intArray);

        System.out.println("Largest in double array at: [" + largestLocationDouble[0] + ", " + largestLocationDouble[1] + "]");
        System.out.println("Smallest in double array at: [" + smallestLocationDouble[0] + ", " + smallestLocationDouble[1] + "]");
        System.out.println("Largest in int array at: [" + largestLocationInt[0] + ", " + largestLocationInt[1] + "]");
        System.out.println("Smallest in int array at: [" + smallestLocationInt[0] + ", " + smallestLocationInt[1] + "]");
    }
}
