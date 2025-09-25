package com.example.sudoku;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class GameController {


    @FXML
    private GridPane gridPane;

    @FXML
    private Button btnResolver;

    @FXML
    private Button btnReiniciar;

    @FXML
    private Button btnExit;



    private static final int SIZE = 6;

    private final int[][] initialBoard = new int[][]{
            {0, 0, 0, 4, 5, 6},
            {4, 5, 6, 0, 0, 0},
            {0, 0, 0, 1, 2, 3},
            {1, 2, 3, 0, 0, 0},
            {0, 4, 0, 0, 6, 0},
            {0, 0, 5, 0, 0, 1}
    };

    @FXML
    public void initialize() {
        createBoard();

        btnResolver.setOnAction(e -> {
            System.out.println("Nuevo Juego");
        });

        btnReiniciar.setOnAction(e -> {
            System.out.println("Juego Reiniciado");
        });

        btnExit.setOnAction(e -> {
            System.out.println("Salir");
            System.exit(0);
        });
    }


    private void createBoard() {
        gridPane.getChildren().clear();
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                TextField cell = new TextField();
                cell.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
                cell.setStyle("-fx-font-size: 20; -fx-alignment: center;");
                gridPane.add(cell, col, row);
            }
        }
    }
}
