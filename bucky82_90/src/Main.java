import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        JFrame f = new JFrame("Going 3D");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ThreeD threed = new ThreeD();
        threed.setBackground(Color.PINK);
        f.add(threed);
        f.setSize(500, 300);
        f.setVisible(true);


        ColorChooser colorchooser = new ColorChooser();
        colorchooser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JFrame frame = new JFrame("JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Graphics graphics = new Graphics();
        frame.add(graphics);
        frame.setSize(400, 250);
        frame.setVisible(true);



        Layout l = new Layout();
        l.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        l.setSize(400, 200);
        l.setVisible(true);

        Scanner input = new Scanner(System.in);
        int x = 1;

        do {
            try {
                System.out.println("Enter first num: ");
                int n1 = input.nextInt();
                System.out.println("Enter first num: ");
                int n2 = input.nextInt();
                int sum = n1 / n2;
                System.out.println(sum);
                x = 2;

            } catch (Exception e) {
                // catch all errors
                System.out.println("Check your input, fool!");
            }
        } while(x == 1);


    }
}
