package learn.javafx.pomodoro;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Main class.
 * VM options for IDE Run configuration:
 * --module-path C:\path-to-javafx\javafx-sdk-11\lib --add-modules=javafx.controls,javafx.fxml
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/home.fxml"));
        primaryStage.setTitle("Pomodoro");
        primaryStage.setScene(new Scene(root, 500, 320));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
