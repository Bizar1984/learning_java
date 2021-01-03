import java.util.Random;

public class number_generator {
    public static void main(String[] args) {
        Random dice = new Random();
        int number;
        int bomba[] = new int[10];

        for(int counter = 1; counter <= 10; counter++) {
            number = 10 + dice.nextInt(2);
            System.out.println(number);
        }



    }
}
