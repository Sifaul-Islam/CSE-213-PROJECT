module com.sifaul.tmond {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sifaul.tmond to javafx.fxml;
    exports com.sifaul.tmond;
    exports com.sifaul.tmond.SifaulIslam;
    opens com.sifaul.tmond.SifaulIslam to javafx.fxml;
    exports com.sifaul.tmond.FarihaAfroz;
    opens com.sifaul.tmond.FarihaAfroz to javafx.fxml;
}
