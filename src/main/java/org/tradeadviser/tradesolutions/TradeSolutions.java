package org.tradeadviser.tradesolutions;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TradeSolutions extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TradeSolutions.class.getResource("TradeSolutions.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1500, 780);
        stage.setTitle("TradeSolutions");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}