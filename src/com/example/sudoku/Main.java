package com.example.sudoku;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/fxml/game.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);

        // Vincular el CSS
        scene.getStylesheets().add(Main.class.getResource("style.css").toExternalForm());

        stage.setTitle("Sudoku 6x6");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
