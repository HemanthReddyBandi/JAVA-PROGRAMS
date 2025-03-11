import java.awt.Graphics;
import java.applet.Applet;
import java.awt.Color;
public class Color extends Applet
{
   public void init()
    {
      resize(400,600);
       setBackground(color.BLUE);
    }
    public void paint (Graphics g)
    {  
         g.drawString("JAVA APPLET COLOURING ",200,200);
}
}