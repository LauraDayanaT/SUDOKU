package com.example.sudoku;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class GameController {


    @FXML
    private GridPane gridPane;

    private static final int SIZE = 6;

    @FXML
    public void initialize() {
        createBoard();
    }

    private void createBoard() {
        gridPane.getChildren().clear();
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                TextField cell = new TextField();
                cell.setPrefSize(80, 80);
                cell.setStyle("-fx-font-size: 20; -fx-alignment: center;");
                gridPane.add(cell, col, row);
            }
        }
    }
}
