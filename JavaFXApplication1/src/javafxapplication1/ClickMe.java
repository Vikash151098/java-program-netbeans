/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author VK
 */


public class ClickMe extends Application
{
public static void main(String[] args)
{
launch(args);
}
Button btn;
Label lb;
int iclick;
@Override public void start(Stage primaryStage)
{
// Create the button
btn = new Button();
btn.setText("Click me please!");
btn.setOnAction(f -> buttonClick());

lb=new Label();
lb.setText("you have not clicked yet");
// Add the button to a layout pane
BorderPane pane = new BorderPane();
pane.setTop(lb);
pane.setCenter(btn);
// Add the layout pane to a scene
Scene scene = new Scene(pane, 300, 250);
// Finalize and show the stage
primaryStage.setScene(scene);
primaryStage.setTitle("The Click Me App");
primaryStage.show();
}
public void buttonClick()
{
    iclick++;
if (iclick==1)
{
lb.setText("you clicked once");
}
else
{
lb.setText("you clicked "+iclick+" times");
}
}
}