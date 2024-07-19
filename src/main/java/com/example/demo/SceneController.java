package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class SceneController {
    @FXML
    ImageView imgViewer;

    public void changeImg(ActionEvent e) {
        imgViewer.setImage("./img2.png");
    }
}
