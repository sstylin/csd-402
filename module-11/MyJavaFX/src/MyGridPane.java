/* Steve Stylin Module 11.2 JavaFX: BorderPane and GridPane */

// MGridPane.java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MyGridPane extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();

        // Creating components
        Label nameLabel = new Label("Name: ");
        TextField nameField = new TextField();
        Label emailLabel = new Label("Email: ");
        TextField emailField = new TextField();
        Button submitButton = new Button(" Submit ");

        // Adding components to the GridPane
        gridPane.add(nameLabel, 0, 0); // Column 0, Row 0
        gridPane.add(nameField, 1, 0); // Column 1, Row 0
        gridPane.add(emailLabel, 0, 1); // Column 0, Row 1
        gridPane.add(emailField, 1, 1); // Column 1, Row 1
        gridPane.add(submitButton, 1, 2); // Column 1, Row 2

        // Creating the scene
        Scene scene = new Scene(gridPane, 300, 200);
        primaryStage.setTitle("GridPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
