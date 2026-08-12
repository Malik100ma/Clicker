package com.example.clicker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class SettingsController {
    @FXML
    public AnchorPane root;
    @FXML
    public Label lblLang, lblTheme;
    @FXML
    public Button btnBack, btnUs, btnUk, btnRu, btnBlack, btnWhite;

    public void theme() {
        if (Application.theme.equals("black")) {
            root.setStyle(MenuController.rootBlack);
            lblLang.setStyle("-fx-text-fill: #ffffff");
            lblTheme.setStyle("-fx-text-fill: #ffffff");
            btnBack.setStyle(MenuController.buttonBlack);
            btnRu.setStyle(MenuController.buttonBlack);
            btnUk.setStyle(MenuController.buttonBlack);
            btnUs.setStyle(MenuController.buttonBlack);
            btnWhite.setStyle(MenuController.buttonBlack);
            btnBlack.setStyle(MenuController.buttonBlack);
        } else if (Application.theme.equals("white")) {
            root.setStyle(MenuController.rootWhite);
            lblLang.setStyle("-fx-text-fill: #000000");
            lblTheme.setStyle("-fx-text-fill: #000000");
            btnBack.setStyle(MenuController.buttonWhite);
            btnRu.setStyle(MenuController.buttonWhite);
            btnUk.setStyle(MenuController.buttonWhite);
            btnUs.setStyle(MenuController.buttonWhite);
            btnWhite.setStyle(MenuController.buttonWhite);
            btnBlack.setStyle(MenuController.buttonWhite);
        }
    }

    public void lang() {
        if (Application.lang.equals("us")) {
            lblTheme.setText("Theme :");
            lblLang.setText("Lang :");
            btnBack.setText("Back");
            btnUs.setText("US");
            btnRu.setText("RU");
            btnUk.setText("UK");
            btnBlack.setText("Black");
            btnWhite.setText("White");
        } else if (Application.lang.equals("uk")) {
            lblTheme.setText("Теми :");
            lblLang.setText("Мови :");
            btnBack.setText("Назад");
            btnUs.setText("США");
            btnRu.setText("РУС");
            btnUk.setText("УКР");
            btnBlack.setText("Чорна");
            btnWhite.setText("Біла");
        } else if (Application.lang.equals("ru")) {
            lblTheme.setText("Темы :");
            lblLang.setText("Языки :");
            btnBack.setText("Back");
            btnUs.setText("США");
            btnRu.setText("РУС");
            btnUk.setText("УКР");
            btnBlack.setText("Черный");
            btnWhite.setText("Белый");
        }
    }

    @FXML
    public void initialize() {
        theme();
        lang();
    }

    public void onButtonWhite(ActionEvent event) {
        Application.theme = "white";
        theme();
    }

    public void onButtonBlack(ActionEvent event) {
        Application.theme = "black";
        theme();
    }

    public void onButtonUs(ActionEvent event) {
        Application.lang = "us";
        lang();
    }

    public void onButtonUk(ActionEvent event) {
        Application.lang = "uk";
        lang();
    }

    public void onButtonRu(ActionEvent event) {
        Application.lang = "ru";
        lang();
    }

    public void onButtonBack(ActionEvent event) throws IOException {
        Application.setRoot("menu-view");
    }
}

