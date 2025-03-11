import javax.swing.*;
import java.awt.*;

public class Colouring {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Swing App");
            frame.setSize(400, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            panel.setBackground(Color.BLUE);

            JLabel label = new JLabel("JAVA SWING COLOURING");
            label.setForeground(Color.WHITE); // Set text color to white

            panel.add(label);
            frame.add(panel);

            frame.setVisible(true);
        });
    }
}
