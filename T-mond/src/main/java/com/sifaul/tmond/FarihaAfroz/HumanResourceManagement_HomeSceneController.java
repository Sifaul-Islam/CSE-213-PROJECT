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

public class HumanResourceManagement_HomeSceneController {

    @javafx.fxml.FXML
    private Label welcomeLabel;
    @javafx.fxml.FXML
    private Label department;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void workforcePlanButtonOnAction(ActionEvent actionEvent) throws IOException {
        loadScene(actionEvent, "/com/sifaul/tmond/HRM_WorkForcePlan.fxml");
    }

    @javafx.fxml.FXML
    public void policyManagementButtonOnAction(ActionEvent actionEvent) throws IOException {
        loadScene(actionEvent, "/com/sifaul/tmond/HRM_PolicyManagement.fxml");
    }

    @javafx.fxml.FXML
    public void performancesButtonOnAction(ActionEvent actionEvent) throws IOException {
        loadScene(actionEvent, "/com/sifaul/tmond/HRM_Performances.fxml");
    }

    @javafx.fxml.FXML
    public void payrollsAndCompensationsButtonOnAction(ActionEvent actionEvent) throws IOException {
        loadScene(actionEvent, "/com/sifaul/tmond/HRM_PayrollsAndCompensations.fxml");
    }

    @javafx.fxml.FXML
    public void complianceAndLegalButtonOnAction(ActionEvent actionEvent) throws IOException {
        loadScene(actionEvent, "/com/sifaul/tmond/HRM_ComplianceAndLegal.fxml");
    }

    @javafx.fxml.FXML
    public void employeeDevelopmentButtonOnAction(ActionEvent actionEvent) throws IOException {
        loadScene(actionEvent, "/com/sifaul/tmond/HRM_EmployeeDevelopment.fxml");
    }

    @javafx.fxml.FXML
    public void surveysAndFeedbacksButtonOnAction(ActionEvent actionEvent) throws IOException {
        loadScene(actionEvent, "/com/sifaul/tmond/HRM_SurveysAndFeedbacks.fxml");
    }

    @javafx.fxml.FXML
    public void interviewsButtonOnAction(ActionEvent actionEvent) throws IOException {
        loadScene(actionEvent, "/com/sifaul/tmond/HRM_Interviews.fxml");
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
