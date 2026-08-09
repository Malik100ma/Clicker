package com.example.clicker;

import javafx.event.ActionEvent;

import java.io.IOException;

public class MenuController {

    public void onButtonToGame(ActionEvent event) throws IOException {
        Application.setRoot("game-view");

    }

    public void onButtonSettings(ActionEvent event) throws IOException {
        Application.setRoot("settings-view");
    }
}
