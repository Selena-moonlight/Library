package com.ucenfotec.ac.cr.quiros.selena.libraryfrontend;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainMenuController {
    public void onRegisterBook(ActionEvent actionEvent) {
    }

    public void onRegistBokBtnClk(MouseEvent mouseEvent) {
    }

    public void onRegisterMemBtn(ActionEvent actionEvent) {
    }

    public void OnRegisMemBtnClk(MouseEvent mouseEvent) {
    }

    public void onListBookBtn(ActionEvent actionEvent) {
    }

    public void onlistBokBtnClk(MouseEvent mouseEvent) {
    }

    public void onListMemBtn(ActionEvent actionEvent) {
    }

    public void onlistMemBtnClk(MouseEvent mouseEvent) {
    }

    @FXML
    private Button exitBtn;
    @FXML
    private AnchorPane mainMenuPane;

    Stage stage;
    public void onExitBtn(ActionEvent actionEvent) {
        stage = (Stage) mainMenuPane.getScene().getWindow();
        System.out.println("You succesfully logged out!");
        stage.close();
    }

    public void onExitBtnClk(MouseEvent mouseEvent) {
    }
}
