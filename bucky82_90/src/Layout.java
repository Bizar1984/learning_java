import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Layout extends JFrame {
    private JButton lb;
    private JButton rb;
    private JButton cb;

    private FlowLayout layout;
    private Container container;

    public Layout() {
        super("Layout example");
        layout = new FlowLayout();
        container = getContentPane();
        setLayout(layout);

        // left button
        lb = new JButton("left");
        add(lb);
        lb.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        layout.setAlignment(FlowLayout.LEFT);
                        layout.layoutContainer(container);

                    }
                }
        );
        // center button
        cb = new JButton("center");
        add(cb);
        cb.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        layout.setAlignment(FlowLayout.CENTER);
                        layout.layoutContainer(container);

                    }
                }
        );
        // right button
        rb = new JButton("right");
        add(rb);
        rb.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        layout.setAlignment(FlowLayout.RIGHT);
                        layout.layoutContainer(container);

                    }
                }
        );

    }

}
