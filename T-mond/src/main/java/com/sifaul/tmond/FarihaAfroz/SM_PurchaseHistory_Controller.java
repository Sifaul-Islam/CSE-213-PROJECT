package com.sifaul.tmond.FarihaAfroz;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class SM_PurchaseHistory_Controller
{
    @javafx.fxml.FXML
    private Label purchaseHistoryLabel;
    @javafx.fxml.FXML
    private Label department;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void purchaseHistoryButtonOnAction(ActionEvent actionEvent) throws IOException {
        loadScene(actionEvent, "/com/sifaul/tmond/SM_PurchaseHistory.fxml");
    }

    @javafx.fxml.FXML
    public void logoutButtonOnAction(ActionEvent actionEvent) throws IOException {
        loadScene(actionEvent, "/com/sifaul/tmond/Login-view.fxml");
    }

    private void loadScene(ActionEvent actionEvent, String fxmlPath) throws IOException {
        Parent sceneParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(fxmlPath)));
        Scene scene = new Scene(sceneParent);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
}