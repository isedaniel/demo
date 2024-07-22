package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SceneController {
    @FXML
    ImageView imgView;

    int imageNum = 1;

    Image image1 = new Image(getClass().getResourceAsStream("/img1.png"));
    Image image2 = new Image(getClass().getResourceAsStream("/img2.png"));

    public void changeImg(ActionEvent e) {
        if (imageNum == 1) {
            imgView.setImage(image2);
            imageNum = 2;
        } else {
            imgView.setImage(image1);
            imageNum = 1;
        }
    }
}
