// create a class for the changing of the color background within the menu panel
import java.util.Hashset;
import java.util.Set;
import java.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.canvas.Canvas;
import java.util.Iterator;


public static class fxGUIColorDisplayMenuSelection extends fxGUIMenuAction
{

    Display()
    {
        if(event -> 
        {
               if(ColorSet.size()==0)
               {
                   addColorsToSet();   // add more color hues to the set 
               }
        
                else 
                {
                    Iterator<Color> colorIterator = ColorSet.iterator();
                     Color nextColor  = colorIterator.next();
                    
currentColor = null;
currentColor = nextColor;
                    nextColor=null;
                    ColorSet.remove(currentColor);
     sceneHbox = new Scene(menubar,400,400,currentColor);
        primaryStage.setScene(sceneHbox);
        primaryStage.show(); 
                    // may need to launch
                    // lanuch();
                }
        });
    }

// Add Colors to the Color Hash Set
    public void addColorsToSet()
    {
        for(i=0;i<=100;i+=10)
        {
        ColorSet.add(Color.rgb(i,255,0));
        ColorSet.add(Color.rgb(0,255,i));
        ColorSet.add(Color.rgb(i,255,i));
        }
    }


}