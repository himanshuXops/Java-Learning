package basic;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter A username: ");
        String username = obj.nextLine();
        System.err.println("Your name is : " + username);

        System.out.println("Enter A number: ");
        int x = obj.nextInt();
        System.err.println("Your number is : " + x);
        


        // Take a double input
        System.out.print("Enter your height (in meters): ");
        double height = obj.nextDouble();



    }
}
