package org.example.calbeans_coffee;

import javafx.application.Platform;
import javafx.stage.Stage;

import java.io.IOException;

public class LoadingController {
    public void initialize() {
        new java.util.Timer().schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        // show the login screen
                        Platform.runLater(() -> {
                            LoginApplication loginApplication = new LoginApplication();
                            try {
                                loginApplication.start(new Stage());
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        });
                    }
                },
                2000
        );
    }
}
