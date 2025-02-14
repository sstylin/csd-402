/* Steve Stylin Module 9 */
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.io.IOException;

public class FileHandlingExample {
    public static void main(String[] args) {
        Path path = Paths.get("module-9.txt");

        // We Create a new file
        try {
            Files.createFile(path);
            System.out.println("File created: " + path.toAbsolutePath());
        } catch (FileAlreadyExistsException e) {
            System.out.println("File already exists: " + path.toAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }

        // geting and display file attributes
        try {
            BasicFileAttributes attrs = Files.readAttributes(path, BasicFileAttributes.class);
            System.out.println("File size: " + attrs.size() + " bytes");
            System.out.println("Creation time: " + attrs.creationTime());
            System.out.println("Last modified time: " + attrs.lastModifiedTime());
        } catch (IOException e) {
            System.out.println("Error reading file attributes: " + e.getMessage());
        }
    }
}
