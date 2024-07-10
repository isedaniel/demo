package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class scene1Controller {

    public void login(ActionEvent e) throws IOException {
        FXMLLoader loader = new FXMLLoader();

        scene2Controller s2c = new scene2Controller();
        s2c.displayName("Test");

        Parent root = loader.load(Objects.requireNonNull(getClass().getResource("scene2.fxml")));
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
