package com.example.clicker;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MenuController {

    public static String buttonWhite = "-fx-background-color: #dfdfdf;-fx-border-color: #000000;-fx-border-width: 4px;-fx-border-radius: 12px;-fx-background-radius: 12px;";

    public static String buttonBlack = "-fx-background-color: #808080";

    public static String rootWhite = "-fx-background-color: #ececec;";

    public static String rootBlack = "-fx-background-color: #2b2b2b;";

    public static String text = "-fx-text-fill: #000000;";


    public AnchorPane root;

    public Button btnQuit, btnGame, btnSettings;

    public Label title;

    @FXML
    public void initialize() {
        theme();
        lang();
    }

    public void theme() {
        if (Application.theme.equals("black")) {
            root.setStyle(rootBlack);
            btnGame.setStyle(buttonBlack);
            btnQuit.setStyle(buttonBlack);
            btnSettings.setStyle(buttonBlack);
            title.setStyle("-fx-text-fill: #ffffff;");
        } else if (Application.theme.equals("white")) {
            root.setStyle(rootWhite);
            title.setStyle(text);
            btnSettings.setStyle(buttonWhite);
            btnGame.setStyle(buttonWhite);
            btnQuit.setStyle(buttonWhite);
        }
    }

    public void lang() {
        if (Application.lang.equals("us")) {
            btnQuit.setText("Quit");
            btnGame.setText("To game");
            btnSettings.setText("Settings");
        }
        if (Application.lang.equals("uk")) {
            btnQuit.setText("Вийти");
            btnGame.setText("Грати");
            btnSettings.setText("Налаш.");
        }
        if (Application.lang.equals("ru")) {
            btnQuit.setText("Выйти");
            btnGame.setText("В игру");
            btnSettings.setText("Настр.");
        }
    }

    public void onButtonToGame(ActionEvent event) throws IOException {
        Application.setRoot("game-view");

    }

    public void onButtonSettings(ActionEvent event) throws IOException {
        Application.setRoot("settings-view");
    }

    public void onButtonQuit(ActionEvent event) {
        Platform.exit();
        System.exit(0);
    }
}
