// output the date and time into a text field box
import javafx.Contents.TextField;
import javafx.scene.layout.FlowLayout;
import javafx.scene.control.TextField;
import javafx.scene.control.Panel;
import javafx.stage.Stage;
import javafx.application.Application;
//import javafx.geometry.Insets;
//import javafx.event.ActionEvent;
//import javafx.event.Eventhandler;
import java.util.Date;
import java.util.DateFormat;



// create a class for a text field box to be the menu select of option 1

public static class DateTimeButtonCLick extends fxGUIMenuAction
{
    Display()
        {
            DisplayMenuSelection();
        };
    
    public static void DisplayMenuSelection()
        {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            Group DateTimeGroup = new Group();
            Scene DateTImeScene = new Scene();
            TextField DateTimeTextFieldDisplay;
            
            DateTimeTextFieldDisplay.setText(dateFormat.format(date));
            DateTimeTextFieldDisplay.setEditable(false);
            DateTimeGroup.getChildren().addAll(DateTimeTextFieldDisplay);
            Scene DateTImeScene = new Scene(DateTimeGroup,400,400,currentColor);
            primaryStage.setScene(DateTImeScene);
            primaryStage.setTitle("Date and Time Menu Option");
            primaryStage.show();
            // possibly might need to put launch here
            // launch();

        }
}