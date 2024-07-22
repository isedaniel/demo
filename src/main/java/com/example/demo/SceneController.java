package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SceneController {
    int imageNumber = 1;
    Image image1 = new Image(getClass().getResourceAsStream("/img1.png"));
    Image image2 = new Image(getClass().getResourceAsStream("/img2.png"));
    @FXML
    ImageView imageView;


    public void changeImage(ActionEvent e) {
        if (imageNumber == 1) {
            imageNumber = 2;
            imageView.setImage(image2);
        }
        else {
            imageNumber = 1;
            imageView.setImage(image1);
        }
    }
}
