module org.example.calbeans_coffee {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires eu.hansolo.tilesfx;

    opens org.example.calbeans_coffee to javafx.fxml;
    exports org.example.calbeans_coffee;
}