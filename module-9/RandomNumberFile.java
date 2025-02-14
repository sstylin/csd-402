/*Steve Stylin 
 * Module 9 Introduction: Exception Handling & Text I/O
 */



 import java.io.*;
 import java.util.Random;
 
 /**
  * This program creates a file named data.file, writes 10 random numbers to it,
  * and then reads the numbers back from the file.
  */
 public class RandomNumberFile {
     public static void main(String[] args) {
         String fileName = "data.file";
         Random random = new Random();
 
         // Create and write to the file
         try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
             for (int i = 0; i < 10; i++) {
                 int randomNumber = random.nextInt(100); // Random number between 0 and 99
                 writer.write(randomNumber + " ");
             }
             writer.newLine(); // Move to the next line after writing numbers
         } catch (IOException e) {
             System.out.println("An error occurred while writing to the file.");
         }
 
         // Read from the file
         try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
             String line;
             System.out.println("Numbers in the file:");
             while ((line = reader.readLine()) != null) {
                 System.out.println(line);
             }
         } catch (IOException e) {
             System.out.println("An error occurred while reading from the file.");
         }
     }
 }
 