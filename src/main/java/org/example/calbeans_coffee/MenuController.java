package org.example.calbeans_coffee;

import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {
    public void onDashboardPageButtonClick() {
        DashboardApplication dashboardApplication = new DashboardApplication();
        try {
            dashboardApplication.start(new Stage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onInventoryPageButtonClick() {
        InventoryApplication inventoryApplication = new InventoryApplication();
        try {
            inventoryApplication.start(new Stage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onMenuPageButtonClick() {
    }

    public void onUserPageButtonClick() {
        UserApplication userApplication = new UserApplication();
        try {
            userApplication.start(new Stage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onLogoutButtonClick() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Calbeans Coffee");
        alert.setHeaderText("Are you sure you want to logout?");
        alert.showAndWait();

        if (alert.getResult().getText().equals("OK")) {
            System.exit(0);
        }
    }
}
