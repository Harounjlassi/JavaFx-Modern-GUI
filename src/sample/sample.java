/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author msi
 */
public class sample extends Application {

    double x, y = 0;

    @Override
    public void start(Stage stage) throws Exception {
       // try {
            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            /*appele aux fichiet qui regroupe tout lse element graphique de notre interface */
            Scene scene = new Scene(root);
           stage.initStyle(StageStyle.UNDECORATED);

            //stage.setTitle("Inscription");
            root.setOnMousePressed(evt -> {

                x = evt.getSceneX();
                y = evt.getSceneY();

            });
            root.setOnMouseDragged(evt -> {
                stage.setX(evt.getScreenX()- x);
                stage.setY(evt.getScreenY()- y);

            });

            stage.setScene(scene);
            stage.show();
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
