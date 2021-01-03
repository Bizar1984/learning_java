import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChooser extends JFrame {

    private JButton button;
    private Color color = (Color.WHITE);
    private JPanel panel;

    public ColorChooser(){
        super("Color chooser");
        panel = new JPanel();
        panel.setBackground(color);

        button = new JButton("choose your color");
        button.addActionListener(
                e -> {
                    color = JColorChooser.showDialog(null, "pick color", color);

                    if(color == null) {
                        color = (Color.WHITE);


                    }panel.setBackground(color);

                }

        );

        add(panel, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);
        setSize(425, 150);
        setVisible(true);


    }
}
