import java.util.Scanner;

class top_class {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of last  girlfriend: ");
        String temp = input.nextLine();

        girl girlObject = new girl("Ellen");
        girlObject.saying();

        girl girlObject1 = new girl(temp);
        girlObject1.the_ending();

    }
}
