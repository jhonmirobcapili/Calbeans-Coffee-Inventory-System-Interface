package org.example.calbeans_coffee;

import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;

public class UserController {
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
        MenuApplication menuApplication = new MenuApplication();
        try {
            menuApplication.start(new Stage());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }

    public void onUserPageButtonClick() {
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
