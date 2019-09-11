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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author VK
 */
public class SceneSwitcher extends Application {
  
    Button btn,SwitchBtnScene1to2;
Label lb;
int iclick=0;
Scene scene1;
  Button btn1,btn2,SwitchBtnScene2to1;
    Label lb1;
    int i=0;
    Scene scene2;
    Stage stage;
    @Override
    public void start(Stage primaryStage) {
        // for scene1
       stage=primaryStage;
btn = new Button();
btn.setText("Click me please!");
btn.setOnAction(e ->buttonClick());
SwitchBtnScene1to2=new Button("Switch");
SwitchBtnScene1to2.setOnAction(e ->switchscene1to2());
lb=new Label();
lb.setText("you have not clicked yet");
// Add the button to a layout pane
VBox pane = new VBox(10);
pane.getChildren().addAll(lb,btn,SwitchBtnScene1to2);

// Add the layout pane to a scene
 scene1 = new Scene(pane, 250,150);

        //for scene2
        btn1 = new Button();
        btn1.setText("Add");
        btn1.setOnAction(e ->addcounter());
        btn2 = new Button();
        btn2.setText("Substract");
        btn2.setOnAction(e ->substractcounter());
        SwitchBtnScene2to1=new Button("Switch");
        SwitchBtnScene2to1.setOnAction( e->switchscene2to1());
        lb1=new Label();
        lb1.setText(Integer.toString(i));
        HBox root = new HBox(10);
        root.getChildren().addAll(lb1,  btn1,  btn2,SwitchBtnScene2to1);
        
       scene2 = new Scene(root, 300, 75);
       primaryStage.setScene(scene1);
       primaryStage.setTitle("SceneSwitcher");
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
public void addcounter() {
       
            i++;
            lb1.setText(Integer.toString(i));
        }

        private void substractcounter()
        {
        
            i--;
            lb1.setText(Integer.toString(i));
        }   

private void switchscene1to2()
{
   stage.setScene(scene2);
}
private void switchscene2to1()
{
   stage.setScene(scene1);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
