import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Graphics extends JPanel {

    public void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.BLACK);

        g.setColor(Color.BLUE);
        g.fillRect(25, 25, 100, 30);

        g.setColor(new Color(220, 50, 20));
        g.fillRect(25, 65, 100, 30);

        g.setColor(new Color(0, 200, 100));
        g.drawString("Drawing Graphics", 30, 120);

    }

}
