package com.example.demo1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Group;

import java.io.IOException;

public class demoApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root, 800, 600, Color.DODGERBLUE);

        Text text = new Text();
        text.setText("This is a text.");
        text.setX(100);
        text.setY(100);
        text.setFont(Font.font("Tahoma", 72));
        root.getChildren().add(text);

        Line line = new Line();
        line.setStartX(100);
        line.setStartY(115);
        line.setEndX(525);
        line.setEndY(115);
        line.setStrokeWidth(4);
        root.getChildren().add(line);

        Rectangle r = new Rectangle();
        r.setX(200);
        r.setY(200);
        r.setWidth(425);
        r.setHeight(200);
        root.getChildren().add(r);

        Image icon = new Image("icon.png");

        stage.getIcons().add(icon);
        stage.setTitle("Demo App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}