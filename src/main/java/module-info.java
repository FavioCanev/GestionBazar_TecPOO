module com.example.gestionbazarluciana {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gestionbazarluciana to javafx.fxml;
    exports com.example.gestionbazarluciana;
}