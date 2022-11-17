package org.tradeadviser.tradesolutions;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TradeSolutionsController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onTradeSolutionButtonClick() {
        welcomeText.setText("Welcome to TradeSolutions");
    }
}