module com.ucenfotec.ac.cr.quiros.selena.libraryfrontend {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ucenfotec.ac.cr.quiros.selena.libraryfrontend to javafx.fxml;
    exports com.ucenfotec.ac.cr.quiros.selena.libraryfrontend;
}