
/* Steve Stylin Module 9 */
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {
    public static void main(String[] args) {
        String data = "Java for Programers, wek 6: Module 9";
        
        // Using try-with-resources to ensure proper resource management
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("mod9.txt"))) {
            bos.write(data.getBytes());
            bos.flush(); // Ensure all data is written to the file
            System.out.println("Data written to mod9.txt");
           
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
