/* Steve Stylin Module 11.2 JavaFX: BorderPane and GridPane */

// MyBorderPane.java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MyBorderPane extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane borderPane = new BorderPane();

        // Creating components
        Label header = new Label("Header");
        Label footer = new Label("Footer");
        Label left = new Label("Left Navigation");
        Label right = new Label("Right Navigation");
        Button centerButton = new Button("Center Button");

        // Adding components to the BorderPane
        borderPane.setTop(header);
        borderPane.setBottom(footer);
        borderPane.setLeft(left);
        borderPane.setRight(right);
        borderPane.setCenter(centerButton);

        // Creating the scene
        Scene scene = new Scene(borderPane, 400, 300);
        primaryStage.setTitle("BorderPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
