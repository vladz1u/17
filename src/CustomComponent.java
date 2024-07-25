import javax.swing.*;
import java.awt.*;

public class CustomComponent extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(100, 100, 250, 250);
    }
}
