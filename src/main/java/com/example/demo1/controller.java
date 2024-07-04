package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class controller {

    @FXML

    private Circle c;
    private double x;
    private double y;

    public void up(ActionEvent e) {
        c.setCenterY(y-=5);
    }

    public void right(ActionEvent e) {
        c.setCenterX(x+=5);
    }

    public void down(ActionEvent e) {
        c.setCenterY(y+=5);
    }

    public void left(ActionEvent e) {
        c.setCenterX(x-=5);
    }
}
