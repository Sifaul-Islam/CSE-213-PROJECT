package com.sifaul.tmond.SifaulIslam;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class CreateuseraccountsController
{
    @javafx.fxml.FXML
    private DatePicker dateofbirthField;
    @javafx.fxml.FXML
    private TextField phonenumberTextfield;
    @javafx.fxml.FXML
    private RadioButton maleRadiobutton;
    @javafx.fxml.FXML
    private ToggleGroup gender;
    @javafx.fxml.FXML
    private TextField passwordTextfield;
    @javafx.fxml.FXML
    private TextArea addressTextarea;
    @javafx.fxml.FXML
    private TextField emailTextfield;
    @javafx.fxml.FXML
    private TextField usernameTextfield;
    @javafx.fxml.FXML
    private RadioButton femaleRadiobutton;
    @javafx.fxml.FXML
    private ComboBox<String> roleCombobox;

    @javafx.fxml.FXML
    public void initialize() {
        roleCombobox.getItems().addAll("Website Administrator","Logistics and Delivery Team","Supply Chain Manager","Finance and Accounting Staff","Marketing Team","Showroom Manager","Human Resource Management","Customer");
    }

    @Deprecated
    public void createuseraccountsOnaction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logoutOncton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void edituseraccountsOnaction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void newgoal(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void createOnaction(ActionEvent actionEvent) {
    }
}