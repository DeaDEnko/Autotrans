package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegistrationController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField nameField;

    @FXML
    private TextField success;

    @FXML
    private TextField patronymicField;

    @FXML
    private TextField surnameField;

    @FXML
    private TextField phoneField;

    @FXML
    private TextField numberCardField;

    @FXML
    private Button regButton;

    @FXML
    private Button autButtonReg;

    @FXML
    void initialize() {

        regButton.setOnAction(event -> {

            signUpNewUser();

        });

        autButtonReg.setOnAction(event -> {

            autButtonReg.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/autorization.fxml"));
            try{
                loader.load();
            } catch (IOException e){
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

    }

    private void signUpNewUser() {
        success.setText("Аккаунт успешно создан!");
        DatabaseHandler dbHandler = new DatabaseHandler();

        String name = nameField.getText();
        String surname = surnameField.getText();
        String patronymic = patronymicField.getText();
        String phoneNumber = phoneField.getText();
        String cardNumber = numberCardField.getText();

        User user = new User(name, surname, patronymic, phoneNumber, cardNumber);

        dbHandler.signUpUser(user);
    }
}

