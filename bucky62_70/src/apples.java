import javax.swing.JFrame;

public class apples {
    public static void main(String[] args) {
        CheckBox checkbox = new CheckBox();
        checkbox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        checkbox.setSize(400, 260);
        checkbox.setVisible(true);

        RadioButton radiobutton = new RadioButton();
        radiobutton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        radiobutton.setSize(400, 260);
        radiobutton.setVisible(true);

        Gui2 go = new Gui2();
        go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        go.setSize(400, 260);
        go.setVisible(true);

        Gui3 color = new Gui3();
        color.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        color.setSize(400, 260);
        color.setVisible(true);


    }
}
