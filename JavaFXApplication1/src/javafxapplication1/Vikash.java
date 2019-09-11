/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author VK
 */
public class Vikash extends Application {
Button btn;
    @Override
    public void start(Stage primaryStage) throws Exception {
        btn=new Button();
        btn.setText("Vikash");
        btn.setOnAction(e ->click());
        BorderPane pane=new BorderPane();
        pane.setCenter(btn);
        Scene sc=new Scene(pane,300,200);
        primaryStage.setScene(sc);
        primaryStage.show();
    }

    private void click() {
        if(btn.getText()=="Vikash")
        {
            btn.setText("Mangal");
        }
        else
        {
            btn.setText("Vikash");
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
