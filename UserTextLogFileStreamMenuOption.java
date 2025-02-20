// menubar option 2 
// set the user textfield and filestream to log.txt file

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.BufferedWriter;
import java.io.FileWrite;
import java.io.Writer;
import javafx.scene.control.TextField;
import java.io.IOException;

public static class UserTextLogFileStreamMenuOption extends fxGUIMenuAction
{
    String filepath = "log.txt";
    
    Display()
    {
        if(filepath.exsist())
            {
                WriteToFile();
            }
        else
            {
                CreateNewFile();
                WriteToFile();
            }
    }

    
    WriteToFile()
    {
        
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filepath,true)))
        {    
            writer.write(userTextToLog.getText());
            writer.newLine();
            userTextToLog = "";
        
        } catch (IOException e) 
        {
            System.out.println("Issues with the file: " + e.getMessage());
        }
    
    }

    
    CreateNewFile()
    {
        try 
        {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) 
            {
                System.out.println("File created: " + myObj.getName());
            } 
            else 
            {
                System.out.println("File already exists.");
            }
        } 
        
        catch (IOException e) 
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}