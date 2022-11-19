package org.tradeadviser.tradesolutions;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class TradeSolutions extends Application {
    @Override
    public void start( Stage stage) throws IOException {
    Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Login.fxml")));
    stage.setTitle("TradeSolutions");
    stage.setScene(new Scene(root));
    stage.show();

}

    public static void main(String[] args) {
        launch(args);

    }
}