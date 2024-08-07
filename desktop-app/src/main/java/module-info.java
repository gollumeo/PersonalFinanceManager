module com.gollumeo.financeManager {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;

    opens com.gollumeo.financeManager to javafx.fxml;
    exports com.gollumeo.financeManager;
}