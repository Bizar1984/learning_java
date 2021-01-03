import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.concurrent.Flow;

public class Gui2 extends JFrame {
    private JComboBox box;
    private JLabel picture;

    private static String[] filename = {"x.png", "y.png"};
    private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])), new ImageIcon(getClass().getResource(filename[1]))};

    public Gui2() {
        super("JComboBoxes");
        setLayout(new FlowLayout());

        box = new JComboBox(filename);

        box.addItemListener(
                new ItemListener() {
                    public void itemStateChanged(ItemEvent event) {
                        if(event.getStateChange()==ItemEvent.SELECTED)
                            picture.setIcon(pics[box.getSelectedIndex()]);
                    }
                }
        );

        add(box);
        picture = new JLabel(pics[0]);
        add(picture);

    }


}
