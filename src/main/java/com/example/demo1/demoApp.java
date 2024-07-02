package com.example.demo1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Group;

import java.io.IOException;

public class demoApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);

        Image icon = new Image("icon.png");

        stage.setWidth(800);
        stage.setHeight(600);
        stage.getIcons().add(icon);
        stage.setTitle("Demo App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}