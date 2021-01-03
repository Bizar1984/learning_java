import javax.swing.JFrame;
import java.awt.*;

class main {
    public static void main(String[] args) {

        tuna bomba = new tuna();
        bomba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bomba.setSize(600, 600 / 12 * 9);
        bomba.setVisible(true);
        bomba.getContentPane().setBackground( Color.green );


    }
}
