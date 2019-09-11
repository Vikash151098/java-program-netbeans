/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Add_Substract;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author VK
 */
public class Add_Substract extends Application implements EventHandler<ActionEvent>{
    Button btn,btn1;
    Label lb;
    int i=0;
    @Override
    public void start(Stage primaryStage) {
         btn = new Button();
        btn.setText("Add");
        btn.setOnAction(this);
        btn1 = new Button();
        btn1.setText("Substract");
        btn1.setOnAction(this);
        lb=new Label();
        lb.setText(Integer.toString(i));
        HBox root = new HBox(10);
        root.getChildren().addAll(lb,  btn,  btn1);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Add_Substract");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(ActionEvent e) {
        if(e.getSource()==btn)
        {
            i++;
            lb.setText(Integer.toString(i));
        }
        if(e.getSource()==btn1)
        {
            i--;
            lb.setText(Integer.toString(i));
        }   
    } 
}
