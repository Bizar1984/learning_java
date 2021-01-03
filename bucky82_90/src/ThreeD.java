import javax.swing.*;
import java.awt.*;

public class ThreeD extends JPanel {

    public void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.BLACK);

        g.setColor(Color.BLUE);
        g.drawLine(10, 15, 125, 25);

        g.setColor(Color.RED);
        g.drawRect(150, 10, 100, 100);

        g.setColor(Color.CYAN);
        g.fillOval(10, 30, 110, 70);

        g.setColor(Color.ORANGE);
        g.fill3DRect(50, 160, 150, 50, true);


    }


}
