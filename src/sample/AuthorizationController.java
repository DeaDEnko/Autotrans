package sample;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import animations.Shake;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AuthorizationController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField phoneFieldAut;

    @FXML
    private TextField numberCardFieldAut;

    @FXML
    private Button autButton;

    @FXML
    private Button regButtonAut;

    @FXML
    void initialize() {

        autButton.setOnAction(event -> {
            String phoneText = phoneFieldAut.getText().trim();
            String cardText = numberCardFieldAut.getText().trim();

            if (!phoneText.equals("") && !cardText.equals("")) {
                loginUser(phoneText, cardText);
            } else System.out.println("Данные не заполнены!");
        });

        regButtonAut.setOnAction(event -> {

            regButtonAut.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/registration.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

    }

    private void loginUser(String phoneText, String cardText) {
        DatabaseHandler dbHandler = new DatabaseHandler();
        User user = new User();
        user.setPhoneNumber(phoneText);
        user.setCardNumber(cardText);
        ResultSet result = dbHandler.getUser(user);

        int counter = 0;

        while (true) {
            try {
                if (!result.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            counter++;
        }
        if (counter >= 1) {

                autButton.getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("/sample/finalPage.fxml"));
                try {
                    loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.showAndWait();

        }
        else{
            Shake phoneAnimation = new Shake(phoneFieldAut);
            Shake cardAnimation = new Shake(numberCardFieldAut);

            phoneAnimation.playAnimation();
            cardAnimation.playAnimation();
        }
    }
}


