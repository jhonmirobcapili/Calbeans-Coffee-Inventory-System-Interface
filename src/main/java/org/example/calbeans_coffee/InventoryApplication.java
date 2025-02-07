package org.example.calbeans_coffee;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class InventoryApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(InventoryApplication.class.getResource("inventory-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1008, 585);
        stage.initStyle(javafx.stage.StageStyle.UNDECORATED);
        stage.setScene(scene);
        stage.show();
    }
}
