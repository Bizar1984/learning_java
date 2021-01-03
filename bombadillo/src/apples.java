import java.util.Scanner;

class apples {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        oranges orangesObject = new oranges();

        System.out.println("Enter your first name: ");
        String firstName = input.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = input.nextLine();

        System.out.println("Enter your age now: ");
        int age = input.nextInt();

        orangesObject.morningMessage(firstName, lastName, age);

    }
}
