import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.event.*;

public class Gui3 extends JFrame {
    private JList list;
    private static String[] colornames = {"black", "blue", "red", "white"};
    private static Color[] colors = {Color.BLACK, Color.BLUE, Color.RED, Color.WHITE};

    public Gui3() {
        super("JList");
        setLayout(new FlowLayout());

        list = new JList(colornames);
        list.setVisibleRowCount(4);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane(list));

        list.addListSelectionListener(
                new ListSelectionListener() {
                    public void valueChanged(ListSelectionEvent event) {
                        getContentPane().setBackground(colors[list.getSelectedIndex()]);

                    }
                }
        );
    }




}

