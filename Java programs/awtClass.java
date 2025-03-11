import java.awt.Graphics.*;
import java.applet.*;

public class awtClass extends Applet {

    public void paint(Graphics g) {
        g.drawString("hello", 300, 400);
    }

}

/*
 * <applet code="awtClass.class" width="300" height="300"></applet>
 */
