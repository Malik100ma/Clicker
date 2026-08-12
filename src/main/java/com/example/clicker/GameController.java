package com.example.clicker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import com.example.clicker.SettingsController.*;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

import static com.example.clicker.Application.*;

public class GameController {
    @FXML
    public Label lblCount, lblUpgrade, lblMaxUpgrade;
    @FXML
    public Button btnClick, btnUpgrade, btnBack;
    @FXML
    public AnchorPane root;

    @FXML
    public void initialize() {
        theme();
        lang();
        setLblCount();
    }

    public void theme() {
        if (theme.equals("black")) {
            btnClick.setStyle("-fx-background-color: #999999;");
            btnBack.setStyle(MenuController.buttonBlack);
            btnUpgrade.setStyle(MenuController.buttonBlack);
            root.setStyle(MenuController.rootBlack);
            lblMaxUpgrade.setStyle(MenuController.text);
            lblUpgrade.setStyle(MenuController.text);
            lblCount.setStyle(MenuController.text);
        } else if (theme.equals("white")) {
            btnClick.setStyle(MenuController.buttonWhite);
            btnBack.setStyle(MenuController.buttonWhite);
            btnUpgrade.setStyle(MenuController.buttonWhite);
            root.setStyle(MenuController.rootWhite);
            lblMaxUpgrade.setStyle(MenuController.text);
            lblUpgrade.setStyle(MenuController.text);
            lblCount.setStyle(MenuController.text);
        }
    }

    public void lang() {
        if (Application.lang.equals("uk")) {
            lblUpgrade.setText("Your upgrade : 1, next upgrade cost : 50");
            btnClick.setText("Клік !");
            btnUpgrade.setText("Апгрейд");
            btnBack.setText("Назад");
            lblMaxUpgrade.setText("Максимальній апгрейд : 5");
        } else if (Application.lang.equals("us")) {
            lblUpgrade.setText("Your upgrade : 1, next upgrade cost : 50");
            btnClick.setText("Click!");
            btnUpgrade.setText("Upgrade");
            btnBack.setText("Back");
            lblMaxUpgrade.setText("Max upgrade : 5");
        } else if (Application.lang.equals("ru")) {
            btnClick.setText("Клик !");
            btnUpgrade.setText("Апгрейд");

            btnBack.setText("Назад");
            lblMaxUpgrade.setText("Максимальний апгрейд : 5");
        }

    }

    @FXML
    private void onButtonClick(ActionEvent event) {
        if (Application.lang.equals("us")) {
            lblCount.setText("Click : " + clickCount);
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
        }
        if (Application.lang.equals("uk")) {
            lblCount.setText("Кліків : " + clickCount);
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
        }
        if (Application.lang.equals("ru")) {
            lblCount.setText("Кликов : " + clickCount);
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
        }
    }

    public void setLblCount() {
        if (Application.lang.equals("us")) {
            lblCount.setText("Click : " + clickCount);
            if (currentMultiplication == 1) {
                lblUpgrade.setText("Your upgrade : 1, next upgrade cost : 50");
            }
            if (currentMultiplication == 2) {
                lblUpgrade.setText("Your upgrade : 2, next upgrade cost : 100");
            }
            if (currentMultiplication == 3) {
                lblUpgrade.setText("Your upgrade : 3, next upgrade cost : 150");
            }
            if (currentMultiplication == 4) {
                lblUpgrade.setText("Your upgrade : 4, next upgrade cost : 200");
            }
            if (currentMultiplication == 5) {
                lblUpgrade.setText("Your upgrade : 5, next upgrade noting");
            }
        }
        if (Application.lang.equals("uk")) {
            lblCount.setText("Кліків : " + clickCount);
            if (currentMultiplication == 1) {
                lblUpgrade.setText("Ваш апгрейд : 1, наступний апгрейд коштує : 50");
            }
            if (currentMultiplication == 2) {
                lblUpgrade.setText("Ваш апгрейд : 2, наступний апгрейд коштує : 100");
            }
            if (currentMultiplication == 3) {
                lblUpgrade.setText("Ваш апгрейд : 3, наступний апгрейд коштує : 150");
            }
            if (currentMultiplication == 4) {
                lblUpgrade.setText("Ваш апгрейд : 4, наступний апгрейд коштує : 200");
            }
            if (currentMultiplication == 5) {
                lblUpgrade.setText("Ваш агрейд : 5, наступного апгрейду не буде");
            }
        }
        if (Application.lang.equals("ru")) {
            lblCount.setText("Кликов :" + clickCount);
            if (currentMultiplication == 1) {
                lblUpgrade.setText("Ваш апгрейд : 1, следующий апгрейд стоит : 50");
            }
            if (currentMultiplication == 2) {
                lblUpgrade.setText("Ваш апгрейд : 2, следующий апгрейд стоит : 100");
            }
            if (currentMultiplication == 3) {
                lblUpgrade.setText("Ваш апгрейд : 3, следующий апгрейд стоит : 150");
            }
            if (currentMultiplication == 4) {
                lblUpgrade.setText("Ваш апгрейд : 4, следующий апгрейд стоит : 200");
            }
            if (currentMultiplication == 5) {
                lblUpgrade.setText("Ваш агрейд : 5, следующего апгрейда не будет");
            }
        }
    }

    @FXML
    public void onButtonUpgrade(ActionEvent event) {
        if (Application.lang.equals("us")) {
            if (clickCount <= 50) {
                currentMultiplication = 1;
                multiplication = 1;
                lblUpgrade.setText("Your upgrade : 1, next upgrade cost : 50");
            }
            if (clickCount >= 50 && multiplication == 1) {
                currentMultiplication = 2;
                multiplication = 2;
                lblUpgrade.setText("Your upgrade : 2, next upgrade cost : 100");
            }
            if (clickCount >= 100 && multiplication == 2) {
                currentMultiplication = 3;
                multiplication = 3;
                lblUpgrade.setText("Your upgrade : 3, next upgrade cost : 150");
            }
            if (clickCount >= 150 && multiplication == 3) {
                currentMultiplication = 4;
                multiplication = 4;
                lblUpgrade.setText("Your upgrade : 4, next upgrade cost : 200");
            }
            if (clickCount >= 200 && multiplication == 4) {
                currentMultiplication = 5;
                multiplication = 5;
                lblUpgrade.setText("Your upgrade : 5, next upgrade noting");
            }
        } else if (Application.lang.equals("uk")) {
            if (clickCount <= 50) {
                currentMultiplication = 1;
                multiplication = 1;
                lblUpgrade.setText("Ваш апгрейд : 1, наступний апгрейд коштує : 50");
            }
            if (clickCount >= 50 && multiplication == 1) {
                currentMultiplication = 2;
                multiplication = 2;
                lblUpgrade.setText("Ваш апгрейд: 2 ,наступний апгрейд коштує: 100");
            }
            if (clickCount >= 100 && multiplication == 2) {
                currentMultiplication = 3;
                multiplication = 3;
                lblUpgrade.setText("Ваш апгрейд : 3, наступний апгрейд коштує : 150");
            }
            if (clickCount >= 150 && multiplication == 3) {
                currentMultiplication = 4;
                multiplication = 4;
                lblUpgrade.setText("Ваш апгрейд : 4, наступний апгрейд коштує : 200");
            }
            if (clickCount >= 200 && multiplication == 4) {
                currentMultiplication = 5;
                multiplication = 5;
                lblUpgrade.setText("Ваш агрейд : 5, наступного апгрейду не буде");
            }
        } else if (Application.lang.equals("ru")) {
            if (clickCount <= 50) {
                currentMultiplication = 1;
                multiplication = 1;
                lblUpgrade.setText("Ваш апгрейд : 1, следующий апгрейд стоит : 50");
            }
            if (clickCount >= 50 && multiplication == 1) {
                currentMultiplication = 2;
                multiplication = 2;
                lblUpgrade.setText("Ваш апгрейд: 2 ,следующий апгрейд стоит: 100");
            }
            if (clickCount >= 100 && multiplication == 2) {
                currentMultiplication = 3;
                multiplication = 3;
                lblUpgrade.setText("Ваш апгрейд : 3, следующий апгрейд стоит : 150");
            }
            if (clickCount >= 150 && multiplication == 3) {
                currentMultiplication = 4;
                multiplication = 4;
                lblUpgrade.setText("Ваш апгрейд : 4, следующий апгрейд стоит : 200");
            }
            if (clickCount >= 200 && multiplication == 4) {
                currentMultiplication = 5;
                multiplication = 5;
                lblUpgrade.setText("Ваш агрейд : 5, следующего апгрейда не будет");
            }
        }
    }

    public void onButtonBack(ActionEvent event) throws IOException {
        Application.setRoot("menu-view");
    }
}