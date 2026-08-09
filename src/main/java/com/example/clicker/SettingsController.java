package com.example.clicker;

import javafx.event.ActionEvent;

public class SettingsController {

    private String lang = "us";

    public SettingsController(String lang) {
        this.lang = lang;
    }

    public String getLang() {
        return lang;
    }

    public void onButtonWhite(ActionEvent event) {

    }

    public void onButtonBlack(ActionEvent event) {
    }

    public void onButtonUs(ActionEvent event) {
        if (lang.equals("us")) ;
        {

        }
    }

    public void onButtonUk(ActionEvent event) {
    }

    public void onButtonRu(ActionEvent event) {
    }

    public void onButtonBack(ActionEvent event) {
    }
}
