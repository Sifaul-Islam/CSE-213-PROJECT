module com.sifaul.tmond {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sifaul.tmond to javafx.fxml;
    exports com.sifaul.tmond;
}