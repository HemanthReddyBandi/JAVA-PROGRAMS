import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseEvent;

public class appletmouseevent extends Applet implements MouseListener, MouseMotionListener {
    String s1;

    public void init() {
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        s1 = "Mouse clicked: " + e.getX() + "," + e.getY();
        repaint(); // Call repaint() to update the display
        closeAppletWindow(); // Call the method to close the applet window
    }

    // Add this method to close the applet window
    private void closeAppletWindow() {
        // You can use the following line to close the applet window
        // This assumes that your applet is running in a standalone window
        Frame frame = (Frame) this.getParent().getParent();
        frame.dispose();
        // Alternatively, you can use the following line to close the applet window in
        // an applet viewer
        // System.exit(0);
    }

    public void mouseEntered(MouseEvent e) {
        s1 = "Mouse entered: " + e.getX() + "," + e.getY();
        repaint(); // Call repaint() to update the display
    }

    public void mouseExited(MouseEvent e) {
        s1 = "Mouse exited: " + e.getX() + "," + e.getY();
        repaint(); // Call repaint() to update the display
    }

    public void mousePressed(MouseEvent e) {
        s1 = "Mouse pressed: " + e.getX() + "," + e.getY();
        repaint(); // Call repaint() to update the display
    }

    public void mouseDragged(MouseEvent e) {
        s1 = "Mouse dragged: " + e.getX() + "," + e.getY();
        repaint(); // Call repaint() to update the display
    }

    public void mouseMoved(MouseEvent e) {
        s1 = "Mouse moved: " + e.getX() + "," + e.getY();
        repaint(); // Call repaint() to update the display
    }

    public void mouseReleased(MouseEvent e) {
        s1 = "Mouse released: " + e.getX() + "," + e.getY();
        repaint(); // Call repaint() to update the display
    }

    public void paint(Graphics g) {
        g.drawString(s1, 100, 150);
    }
}
