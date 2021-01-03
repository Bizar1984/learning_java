import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdapterClass extends JFrame {
    private String details;
    private JLabel statusbar;

    public AdapterClass() {
        super("turtle");

        statusbar = new JLabel("this is default");
        add(statusbar, BorderLayout.SOUTH);
        addMouseListener(new Mouseclass());
    }

    private class Mouseclass extends MouseAdapter{
        // MouseAdapter is built in, it lets you override some methods without the need to implement all methods
        public void mouseClicked(MouseEvent anEvent) {
            details = String.format("You clicked %d %s with ", anEvent.getClickCount(), (anEvent.getClickCount() != 1)? "times" : "time");

            if(SwingUtilities.isRightMouseButton(anEvent))
                details += "the right button";
            else if(SwingUtilities.isMiddleMouseButton(anEvent))
                details += "the center mouse button";
            else
                details += "the left mouse button";

            statusbar.setText(details);


        }
    }
}
