module com.example.calculator_gui {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.scripting;


    opens com.example.calculator_gui to javafx.fxml;
    exports com.example.calculator_gui;
}