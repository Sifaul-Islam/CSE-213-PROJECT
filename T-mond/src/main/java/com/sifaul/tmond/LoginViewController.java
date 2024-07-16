package com.sifaul.tmond;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.EventObject;

public class LoginViewController
{
    @javafx.fxml.FXML
    private TextField UsernameTextfield;
    @javafx.fxml.FXML
    private PasswordField Passwordfield;
    @javafx.fxml.FXML
    private ComboBox<String> selectyourroleCombobox;

    @javafx.fxml.FXML
    public void initialize() {
        selectyourroleCombobox.getItems().addAll("Website Administrator","Logistics and Delivery Team","Supply Chain Manager","Finance and Accounting Staff","Marketing Team","Showroom Manager","Human Resource Management","Customer");
    }

    @javafx.fxml.FXML
    public void registrationonaction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loginonaction(ActionEvent actionEvent) {

    }
}