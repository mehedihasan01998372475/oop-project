module oop.practicepoject.amusemenetpark {
    requires javafx.controls;
    requires javafx.fxml;


    opens oop.practicepoject.amusemenetpark to javafx.fxml;
    exports oop.practicepoject.amusemenetpark;
    exports Rafid;
    opens Rafid to javafx.fxml;
}