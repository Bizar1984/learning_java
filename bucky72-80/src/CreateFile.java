import java.io.*;
import java.lang.*;
import java.util.*;

public class CreateFile {

    private Formatter x;

    public void openFile() {
        try{
            x = new Formatter("outputThis.txt");
        }
        catch(Exception e) {
            System.out.println("error again, fooool!");
        }
    }

    public void addRecords() {
        x.format("%s%s%s", "Age: 29, ", "Name: Benazir ", "lastName: Muktar");
    }
    public void closeFile(){
        x.close();
    }
}
