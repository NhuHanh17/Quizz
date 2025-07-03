package com.han.quizzapp;

import com.han.utils.MyAlert;
import com.han.utils.MyStage;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class PrimaryController {

    public void handleQuestionManagement(ActionEvent event) throws IOException {
        MyStage.getInstance().showStage("question.fxml");
    }

    public void handlePractice(ActionEvent event) {
        MyAlert.getInstance().showMsg("Coming soon");
    }
}
