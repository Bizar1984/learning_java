import javax.swing.*;
import java.io.File;
import java.util.*;

public class apples {
    public static void main(String[] args) {

        ReadFile r = new ReadFile();
        r.openFile();
        r.readFile();
        r.closeFile();



        final Formatter writeToFile;

        try {
            writeToFile = new Formatter("freddieAgain.txt");
            System.out.println("you created your first file!");
        }
        catch(Exception e) {
            System.out.println("you got an error sir!");
        }

        File x = new File("C:\\Users\\crank\\IdeaProjects\\bucky72-80\\outputThis.txt");

        CreateFile createfile = new CreateFile();
        createfile.openFile();
        createfile.addRecords();
        createfile.closeFile();



        if(x.exists())
            System.out.println(x.getName() + " exists!");
        else System.out.println(x.getName() + " doesn't exist!");

        Gui go = new Gui();
        go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        go.setSize(300, 200);
        go.setVisible(true);

        MouseEvents mouse = new MouseEvents();
        mouse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mouse.setSize(300, 200);
        mouse.setVisible(true);

        AdapterClass adapterclass = new AdapterClass();
        adapterclass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        adapterclass.setSize(300, 200);
        adapterclass.setVisible(true);

    }
}
