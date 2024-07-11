package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class scene1Controller {

    @FXML
    TextField userNameText;

    public void login(ActionEvent e) throws IOException {
        String name = userNameText.getText();

        FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(getClass().getResource("scene2.fxml")));

        Parent root = loader.load();
        scene2Controller s2c = loader.getController();
        s2c.displayName(name);

        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
