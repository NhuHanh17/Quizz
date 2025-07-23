module com.han.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;
    
    opens com.han.quizapp to javafx.fxml;
    exports com.han.quizapp;
}
