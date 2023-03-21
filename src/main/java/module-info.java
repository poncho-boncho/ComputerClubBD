module com.example.computerclubbd {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.computerclubbd to javafx.fxml;
    exports com.example.computerclubbd;
}