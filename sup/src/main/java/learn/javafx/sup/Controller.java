package learn.javafx.sup;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public TextField firstName;

    public void handleSaySup(ActionEvent event) {
        System.out.printf("Sup %s!%n", firstName.getText());
    }
}
