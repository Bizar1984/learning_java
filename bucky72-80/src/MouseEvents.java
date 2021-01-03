import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class MouseEvents extends JFrame {

    private JPanel mousepanel;
    private JLabel statusbar;

    public MouseEvents() {
        super("mouse events");

        mousepanel = new JPanel();
        mousepanel.setBackground((Color.WHITE));
        add(mousepanel, BorderLayout.CENTER);

        statusbar = new JLabel("default");
        add(statusbar, BorderLayout.SOUTH);

        Handlerclass handler = new Handlerclass();
        mousepanel.addMouseListener(handler);
        mousepanel.addMouseMotionListener(handler);

    }

    private class Handlerclass implements MouseListener, MouseMotionListener {
        public void mouseClicked(MouseEvent event){
            statusbar.setText(String.format("Clicked at %d, %d", event.getX(), event.getY()));
        }
        public void mousePressed(MouseEvent event) {
            statusbar.setText("you pressed down the mouse");
        }
        public void mouseReleased(MouseEvent event) {
            statusbar.setText("you released the mouse");
        }
        public void mouseEntered(MouseEvent event) {
            statusbar.setText("you entered the mouse area");
            mousepanel.setBackground(Color.red);
        }
        public void mouseExited(MouseEvent event) {
            statusbar.setText("you exited the mouse area");
            mousepanel.setBackground(Color.blue);
        }

        // methods belonging to mouseMotion
        public void mouseDragged(MouseEvent event) {
            statusbar.setText("stop dragging man!");
            mousepanel.setBackground(Color.orange);
        }
        public void mouseMoved(MouseEvent event) {
            statusbar.setText("some one moved the mouse");
            mousepanel.setBackground(Color.CYAN);

        }
    }

}
