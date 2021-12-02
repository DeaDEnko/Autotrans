package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FinalController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button customer;

    @FXML
    private Button driver;

    @FXML
    private TextField notification;

    @FXML
    private Button main;

    @FXML
    void initialize() {
   customer.setOnAction(event -> {
       notification.setText("Заказчику отправлено письмо на электронную почту");
   });
        driver.setOnAction(event -> {
            notification.setText("Водителю поступило сообщение о поступлении нового заказа");
        });
        main.setOnAction(event -> {
            Stage stage = (Stage) main.getScene().getWindow();
            stage.close();

        });

    }
}
