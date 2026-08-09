package com.example.clicker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import com.example.clicker.SettingsController.*;

import java.io.IOException;

public class GameController {
    public SettingsController settingsController;
    @FXML
    public Label lblCount, lblUpgrade;
    @FXML
    public Button btnClick, btnUpgrade;

    public int clickCount, multiplication = 1;


    public void logic() {


    }

    @FXML
    public void initialize() {

    }

    @FXML
    private void onButtonClick(ActionEvent event) {
        if (multiplication == 2) {
            clickCount += 2;
        } else if (multiplication == 3) {
            clickCount += 3;
        } else if (multiplication == 4) {
            clickCount += 4;
        } else if (multiplication == 5) {
            clickCount += 5;
        } else {
            clickCount++;
        }
        lblCount.setText("Click : " + clickCount);
    }

    public void onButtonUpgrade(ActionEvent event) {
        if (clickCount >= 50) {
            multiplication = 2;
            lblUpgrade.setText("Your upgrade : 2, next upgrade cost : 100");
        }
        if (clickCount >= 100 && multiplication == 2) {
            multiplication = 3;
            lblUpgrade.setText("Your upgrade : 3, next upgrade cost : 150");
        }
        if (clickCount >= 150 && multiplication == 3) {
            multiplication = 4;
            lblUpgrade.setText("Your upgrade : 4, next upgrade cost : 200");
        }
        if (clickCount >= 200 && multiplication == 4) {
            multiplication = 5;
            lblUpgrade.setText("Your upgrade : 5, next upgrade noting");
        }
    }

    public void onButtonBack(ActionEvent event) throws IOException {
        Application.setRoot("menu-view");
    }
}