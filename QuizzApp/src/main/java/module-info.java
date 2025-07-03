module com.han.quizzapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.han.quizzapp to javafx.fxml;
    exports com.han.quizzapp;
}
