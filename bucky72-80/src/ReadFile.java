import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    private Scanner x;
    
    public void openFile() {
        try{
            x = new Scanner(new File("mystery_man.txt"));
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
    }

    public void readFile() {
        while(x.hasNext()) {
            String a = x.next();
            String b = x.next();
            String c = x.next();

            System.out.printf("%s %s %s\n", a, b, c);
        }
    }

    public void closeFile(){
        x.close();
    }
}
