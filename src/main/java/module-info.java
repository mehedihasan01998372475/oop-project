module com.example.oopprojectfinal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oopprojectfinal to javafx.fxml;
    exports com.example.oopprojectfinal;
}