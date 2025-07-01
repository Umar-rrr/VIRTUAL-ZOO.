
package Zoo1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
public class ZooApp extends Application
{
    public Label typeLabel = new Label("Type:");
    public Label soundLabel = new Label("Sound:");

    @Override
    public void start(Stage primaryStage) {
        // Buttons for each animal
        Button lionButton = new Button("Lion");
        Button elephantButton = new Button("Elephant");
        Button dogButton = new Button("Dog");
        Button catButton = new Button("Cat");
        Button tigerButton = new Button("Tiger");

        // Add action handlers
        lionButton.setOnAction(e -> {
            typeLabel.setText("Type: Lion");
            soundLabel.setText("Sound: Roar");
        });

        elephantButton.setOnAction(e -> {
            typeLabel.setText("Type: Elephant");
            soundLabel.setText("Sound: Trumpet");
        });

        dogButton.setOnAction(e -> {
            typeLabel.setText("Type: Dog");
            soundLabel.setText("Sound: Bark");
        });

        catButton.setOnAction(e -> {
            typeLabel.setText("Type: Cat");
            soundLabel.setText("Sound: Meow");
        });

        tigerButton.setOnAction(e -> {
            typeLabel.setText("Type: Tiger");
            soundLabel.setText("Sound: Growl");
        });

        VBox layout = new VBox(10,
                new Label("Click an Animal:"),
                lionButton, elephantButton, dogButton, catButton, tigerButton,
                typeLabel, soundLabel
        );
        layout.setStyle("-fx-padding: 20; -fx-alignment: center;");

        Scene scene = new Scene(layout, 300, 350);
        primaryStage.setTitle("Simple Virtual Zoo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
