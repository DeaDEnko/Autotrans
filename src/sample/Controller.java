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

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button send1;

    @FXML
    private Button send2;

    @FXML
    private Button send3;

    @FXML
    private Button send4;

    @FXML
    private TextField mass1;

    @FXML
    private TextField mass12;

    @FXML
    private TextField mass3;

    @FXML
    private TextField mass4;

    @FXML
    private Button choise1;

    @FXML
    private Button choise2;

    @FXML
    private Button choise3;

    @FXML
    private Button choise4;

    @FXML
    private TextField loadCapacity1;

    @FXML
    private TextField loadCapacity2;

    @FXML
    private TextField loadCapacity3;

    @FXML
    private TextField loadCapacity4;

    @FXML
    private TextField notification;

    @FXML
    private TextField quantity;

    @FXML
    public void initialize() {
        int lC1 = Integer.parseInt(loadCapacity1.getText());
        int lC2 = Integer.parseInt(loadCapacity2.getText());
        int lC3 = Integer.parseInt(loadCapacity3.getText());
        int lC4 = Integer.parseInt(loadCapacity4.getText());

        send1.setOnAction(event -> {
            int m1 = Integer.parseInt(mass1.getText());
            notification.setText("Осталось выбрать подходящий транспорт!");
            choise1.setOnAction(event1 -> {
                if(m1>lC1){
                    notification.setText("ОШИБКА! Масса груза слишком велика для этого транспорта!");
                }
                else{
                    button();
                    send1.setVisible(false);
                }
            });
            choise2.setOnAction(event1 -> {
                if(m1>lC2){
                    notification.setText("ОШИБКА! Масса груза слишком велика для этого транспорта!");
                }
                else{
                    button();
                    send1.setVisible(false);
                }
            });
            choise3.setOnAction(event1 -> {
                if(m1>lC3){
                    notification.setText("ОШИБКА! Масса груза слишком велика для этого транспорта!");
                }
                else{
                    button();
                    send1.setVisible(false);
                }
            });
            choise4.setOnAction(event1 -> {
                if(m1>lC4){
                    notification.setText("ОШИБКА! Масса груза слишком велика для этого транспорта!");
                }
                else{
                    button();
                    send1.setVisible(false);
                }
            });
        });

        send2.setOnAction(event -> {
            int m2 = Integer.parseInt(mass12.getText());
            notification.setText("Осталось выбрать подходящий транспорт!");
            int m3 = Integer.parseInt(mass3.getText());
            int m2And3 = m2+m3;
            send3.setOnAction(event1 -> {
                notification.setText("Вы объединили заказы. Общая масса: " + m2And3 + "КГ");
            });
            choise1.setOnAction(event1 -> {
                if(m2And3>lC1 || m2>lC1){
                    notification.setText("ОШИБКА! Масса груза слишком велика для этого транспорта!");
                }
                else{
                    button();
                    send2.setVisible(false);
                    send3.setVisible(false);
                }
            });
            choise2.setOnAction(event1 -> {
                if(m2And3>lC2 || m2>lC2){
                    notification.setText("ОШИБКА! Масса груза слишком велика для этого транспорта!");
                }
                else{
                    button();
                    send2.setVisible(false);
                    send3.setVisible(false);
                }
            });
            choise3.setOnAction(event1 -> {
                if(m2And3>lC3 || m2>lC3){
                    notification.setText("ОШИБКА! Масса груза слишком велика для этого транспорта!");
                }
                else{
                    button();
                    send2.setVisible(false);
                    send3.setVisible(false);
                }
            });
            choise4.setOnAction(event1 -> {
                if(m2And3>lC4 || m2>lC4){
                    notification.setText("ОШИБКА! Масса груза слишком велика для этого транспорта!");
                }
                else{
                    button();
                    send2.setVisible(false);
                    send3.setVisible(false);
                }
            });
        });

        send3.setOnAction(event -> {
            int m3 = Integer.parseInt(mass3.getText());
            int m2 = Integer.parseInt(mass12.getText());
            int m2And3 = m2+m3;
            notification.setText("Осталось выбрать подходящий транспорт!");
            choise1.setOnAction(event1 -> {
                if(m3>lC1 || m2And3>lC1){
                    notification.setText("ОШИБКА! Масса груза слишком велика для этого транспорта!");
                }
                else{
                    button();
                    send2.setVisible(false);
                    send3.setVisible(false);
                }
            });
            choise2.setOnAction(event1 -> {
                if(m3>lC2 || m2And3>lC2){
                    notification.setText("ОШИБКА! Масса груза слишком велика для этого транспорта!");
                }
                else{
                    button();
                    send2.setVisible(false);
                    send3.setVisible(false);
                }
            });
            choise3.setOnAction(event1 -> {
                if(m3>lC3 || m2And3>lC3){
                    notification.setText("ОШИБКА! Масса груза слишком велика для этого транспорта!");
                }
                else{
                    button();
                    send2.setVisible(false);
                    send3.setVisible(false);
                }
            });
            choise4.setOnAction(event1 -> {
                if(m3>lC4 || m2And3>lC4){
                    notification.setText("ОШИБКА! Масса груза слишком велика для этого транспорта!");
                }
                else{
                    button();
                    send2.setVisible(false);
                    send3.setVisible(false);
                }
            });
        });

        send4.setOnAction(event -> {
            int m4 = Integer.parseInt(mass4.getText());
            notification.setText("Осталось выбрать подходящий транспорт!");
            choise1.setOnAction(event1 -> {
                if(m4>lC1){
                    notification.setText("ОШИБКА! Масса груза слишком велика для этого транспорта!");
                }
                else{
                    button();
                    send4.setVisible(false);
                }
            });
            choise2.setOnAction(event1 -> {
                if(m4>lC2){
                    notification.setText("ОШИБКА! Масса груза слишком велика для этого транспорта!");
                }
                else{
                    button();
                    send4.setVisible(false);
                }
            });
            choise3.setOnAction(event1 -> {
                if(m4>lC3){
                    notification.setText("ОШИБКА! Масса груза слишком велика для этого транспорта!");
                }
                else{
                    button();
                    send4.setVisible(false);
                }
            });
            choise4.setOnAction(event1 -> {
                if(m4>lC4){
                    notification.setText("ОШИБКА! Масса груза слишком велика для этого транспорта!");
                }
                else{
                    button();
                    send4.setVisible(false);
                }
            });
        });

    }

    public void button(){

        int qal = Integer.parseInt(quantity.getText());
        int qal1 = qal+1;
        String qal2 = Integer.toString(qal1);
        quantity.setText(qal2);

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/finalPage.fxml"));
            try{
                loader.load();
            } catch (IOException e){
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
    }
}
