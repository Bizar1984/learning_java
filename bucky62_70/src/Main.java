import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome everybody");

        Gui go = new Gui();
        go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        go.setSize(300, 300 / 12 * 9);
        go.setVisible(true);


    }
}
