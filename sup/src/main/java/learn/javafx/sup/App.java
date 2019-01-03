package learn.javafx.sup;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Text txt = new Text("Sup?");
        txt.setFont(new Font("Papyrus", 80));
        Label label = new Label("Name:");
        TextField nameFld = new TextField();
        Button btn = new Button("Say Sup!");
        GridPane grid = new GridPane();
        grid.setHgap(20);
        grid.setVgap(10);
        grid.add(label, 0, 0);
        grid.add(nameFld, 1, 0);
        grid.add(btn, 1, 1);
        btn.setOnAction(e -> System.out.printf("Hello, %s!%n", nameFld.getText()));
        VBox box = new VBox(10);
        box.getChildren().addAll(txt, grid);
        root.getChildren().add(box);
        primaryStage.setTitle("Sup");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
