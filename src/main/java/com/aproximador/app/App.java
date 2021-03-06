package com.aproximador.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application
{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("app.fxml"));

        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setTitle("Aproximador");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
