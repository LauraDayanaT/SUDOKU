package com.example.sudoku;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class GameController {

    @FXML
    private GridPane gridPane;

    // Tablero inicial (0 = celda vacía)
    private final int[][] board = {
            {0, 0, 0, 3, 0, 6},
            {3, 0, 6, 0, 0, 0},
            {0, 0, 0, 0, 2, 0},
            {0, 4, 0, 0, 0, 0},
            {0, 0, 0, 6, 0, 4},
            {6, 0, 2, 0, 0, 0}
    };

    @FXML
    public void initialize() {
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 6; col++) {
                TextField cell = getCell(row, col);

                if (cell != null) {
                    int value = board[row][col];

                    if (value != 0) {
                        cell.setText(String.valueOf(value));
                        cell.setEditable(false);
                    } else {
                        cell.setText("");
                        cell.setEditable(true);
                    }

                    // Añadimos clases CSS para dibujar los bordes de bloques
                    cell.getStyleClass().add("row-" + row);
                    cell.getStyleClass().add("col-" + col);
                }
            }
        }
    }

    private TextField getCell(int row, int col) {
        for (var node : gridPane.getChildren()) {
            Integer r = GridPane.getRowIndex(node);
            Integer c = GridPane.getColumnIndex(node);

            if (r == null) r = 0;
            if (c == null) c = 0;

            if (r == row && c == col && node instanceof TextField) {
                return (TextField) node;
            }
        }
        return null;
    }
}
