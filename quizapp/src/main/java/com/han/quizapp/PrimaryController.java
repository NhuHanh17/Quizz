package com.han.quizapp;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import utils.MyAlert;
import utils.MyStage;

public class PrimaryController {

    public void handleQuestionManagerment(ActionEvent event) throws IOException{
        MyStage.getInstance().showStage("questions.fxml");
    }

    public void handlePractice(ActionEvent event) {
        MyAlert.getInstance().showMsg("Coming soon...");
    }
}
