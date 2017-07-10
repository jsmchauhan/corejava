package tutorial7;

import java.util.Scanner;

/**
 * Created by mch23 on 10/07/2017.
 */
public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a line of text");

        if (input.hasNextDouble()) {

            System.out.println("The value entered is double: " + input.nextDouble());
        }
        else{
            System.out.println("The value is"+input.nextLine());
        }
    }
}
