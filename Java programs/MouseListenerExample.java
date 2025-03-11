import java.awt.*;
import java.awt.event.*;

public class MouseListenerExample extends Frame implements MouseListener, MouseMotionListener {
  Label l;

  MouseListenerExample() {
    l = new Label();
    l.setBounds(20, 50, 200, 40);
    add(l);
    setSize(300, 300);
    setLayout(null);
    setVisible(true);
    addMouseListener(this);
    addMouseMotionListener(this);
  }

  public void mouseClicked(MouseEvent e) {
    l.setText("mouse clicked at:" + e.getX() + " " + e.getY());
  }

  public void mouseEntered(MouseEvent e) {
    l.setText("mouse entered at:" + e.getX() + " " + e.getY());
  }

  public void mouseExited(MouseEvent e) {
    l.setText("mouse exited at:" + e.getX() + " " + e.getY());
  }

  public void mousePressed(MouseEvent e) {
    l.setText("mouse pressed at:" + e.getX() + " " + e.getY());
  }

  public void mouseReleased(MouseEvent e) {
    l.setText("mouse released at:" + e.getX() + " " + e.getY());
  }

  public void mouseDragged(MouseEvent e) {
    l.setText("mouse dragged at:" + e.getX() + " " + e.getY());
  }

  public void mouseMoved(MouseEvent e) {
    l.setText("mouse moved at:" + e.getX() + " " + e.getY());
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

  public static void main(String[] args) {
    MouseListenerExample m = new MouseListenerExample();
  }
}
