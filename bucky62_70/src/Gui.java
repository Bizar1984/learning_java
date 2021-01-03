import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class Gui extends JFrame {
    private JButton reg;
    private JButton custom;

    public Gui() {
        super("Check out these buttons");
        setLayout(new FlowLayout());

        reg = new JButton("reg Button");
        add(reg);

        Icon x = new ImageIcon(getClass().getResource("x.png"));
        Icon y = new ImageIcon(getClass().getResource("y.png"));
        custom = new JButton("Custom", y);
        custom.setRolloverIcon(x);
        add(custom);

        HandlerClass handler = new HandlerClass();
        reg.addActionListener(handler);
        custom.addActionListener(handler);

    }

    private class HandlerClass implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(null, String.format("You clicked me!", event.getActionCommand()));
        }
    }

}
