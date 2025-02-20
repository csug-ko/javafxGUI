// The main GUI Menu Bar Action Control 
import javafx.scene.control;
import java.awt.Color;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;
import javafx.event.ActionEvent;
import javafx.event.Eventhandler;
import java.io.IOException;
import java.scene.paint.Color;

public abstract class fxGUIMenuAction
{
    
    @Override
    public void start(Stage primaryStage) throws Exception 
    {
    Color currentColor = new Color.rgb(0,155,0);
        MenuItem menuButton1 = new MenuItem("Display Date and Time");
        MenuItem menuButton2 = new MenuItem("Add TextField Box Contents to Log File");
        MenuItem menuButton3 = new MenuItem("Change the Background Color");
        MenuItem menuButton4 = new MenuItem("Exit Program");
        MenuBar menubar = makeMenuBar(new MenuButton("Menu", null, menuButton1,menuButton2,menuButton3,menuButton4));
        Scene sceneHbox = new Scene(menubar,400,400,currentColor);
        primaryStage.setScene(sceneHbox);
        primaryStage.show();
        try
            {
                RunEvents();
            }
        catch
            {
                Panel ExceptionPanel = new Panel(new Label("Something is wrong with the processing stage after the menu bar"));
                FlowLayout ExceptionFlowPanel = new FlowLayout;
                ExceptionFlowPanel.add(ExceptionPanel);
                ExceptionFlowPanel.show();
                System.exit(0);
                
            }

        public static void RunEvents()
        {
                while (true)
                {
                    menuButton1.setOnAction(event -> {DateTimeButtonCLick.Display();
                                                     Group dateTimeGroup = new Group();
                                                     });
                    menuButton2.setOnAction(event -> {UserTextLogFileStreamMenuOption.Display();});
                    menuButton3.setOnAction(event -> {fxGUIColorDisplay.Display();});
                    menuButton4.setOnAction(event -> {System.exit(0);});
                }
        
        }

 
   }
    
    public static void main(String args[])
    {           
        launch(args);    
    }
}