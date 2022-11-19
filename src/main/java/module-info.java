module org.tradeadviser.tradesolutions {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires org.jetbrains.annotations;

    opens org.tradeadviser.tradesolutions to javafx.fxml;
    exports org.tradeadviser.tradesolutions;
}